import java.util.ArrayList;
import java.util.Collections;

public class exam_ronny {
   static ArrayList<Integer>list=new ArrayList<>();
   static int mat[][]={
    {0,0,0},
    {1,1,0},
    {0,0,1}
   };
public static void main(String[] args) {
  
    for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[0].length;j++){
        if(mat[i][j]<=0)continue;
        list.add(helper(i,j));
    }
   }
int ans=0;
Collections.sort(list,(a,b)->b-a);
   for(int i=0;i<list.size();i++){
        if(i%2==0)continue;
        else ans+=list.get(i);
   }
   System.out.println(ans);
}

static int helper(int i,int j){
    if(i<0||j<0||i>=mat.length||j>=mat[0].length)return 0;
    if(mat[i][j]<=0)return 0;
    if(mat[i][j]==1)mat[i][j]=-1;
    int a=helper(i-1, j);
    int b=helper(i+1, j);
    int c=helper(i, j-1);
    int d=helper(i, j+1);
    return 1+a+b+c+d;
}

   
}
