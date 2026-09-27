import java.util.Arrays;

public class KrushkalMST {
    static int parent[];
    static int find(int x){
        if(parent[x]==x)return x;
        return find(parent[x]);
    }

    static void union(int a,int b){
        parent[find(b)]=find(a);
    }
    public static void main(String[] args) {
      int  N = 5;
parent=new int[5];
for(int i=0;i<parent.length;i++)parent[i]=i;
 int nums[][]= {
 {0,1,10},
 {0,2,6},
 {0,3,5},
 {1,3,15},
 {2,3,4},
 {3,4,8}
};


Arrays.sort(nums,(a,b)->
    a[2]-b[2]
);

int cost=0,count=0;
for(int i=0;i<nums.length;i++){
    int u=nums[i][0];
    int v=nums[i][1];
    int wig=nums[i][2];
    if(find(u)!=find(v)){
        union(u,v);
        cost+=wig;
        count++;
    }

}
if(count!=N-1)System.out.println(-1);
else System.out.println(cost);





    }
}
