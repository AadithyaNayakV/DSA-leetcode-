import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class shortest_newtwork_connection{
   static boolean vis[];
   

    public static void main(String[] args) {
        int n=6,m=6;
        vis=new boolean[n+1];
        int[][] nums = {
    {1, 2},
    {1, 3},
    {2, 4},
    {3, 4},
    {4, 5},
    {5, 6}
};

ArrayList<ArrayList<Integer>>list=new ArrayList<>();

for(int i=0;i<=n;i++){
    list.add(new ArrayList<>());
}
for(int i=0;i<nums.length;i++){
    int a=nums[i][0];
    int b=nums[i][1];
    list.get(a).add(b);
    list.get(b).add(a);
}
int dist=0;
Queue<Integer>q=new ArrayDeque<>();
q.offer(1);
vis[1]=true;

while(!q.isEmpty()){
int size=q.size();

while(size>0){
    int node=q.poll();
    if(node==n){ System.out.println(dist);
        System.exit(0);
    }
    for(int i:list.get(node)){
        if(vis[i])continue;
        vis[i]=true;
        q.add(i);
    }
    size--;
}
dist++;
}
System.out.println(-1);

// int ans=helper(list,n,m,1);
// System.out.println(ans);

    }
    static int  helper(ArrayList<ArrayList<Integer>>list,int n,int m,int node){
        if(vis[node])return Integer.MAX_VALUE-1;
        if(node==n)return 0;
        int count=0;
        int min=Integer.MAX_VALUE;
        vis[node]=true;
        for(int i:list.get(node)){
            
          count=1+ helper(list,n,m,i);
         min= Math.min(count,min);
        }
        vis[node]=false;

        return min;
    }
}