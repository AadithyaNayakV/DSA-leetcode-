import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

public class locked_network {
    public static void main(String[] args) {
       int state[]={0,1, 1, 1, 0, 0};
       int k=0;
       Queue<int[]>q=new ArrayDeque<>();
       int[][] nums = {
           {1, 2},
           {1, 3},
           {2, 4},
           {3, 4},
           {4, 5},
           {5, 6}
        };
        boolean vis[][]=new boolean[state.length+1][k+1];

List<List<Integer>>list=new ArrayList<>();
for(int i=0;i<state.length+1;i++)list.add(new ArrayList<>());
for(int i=0;i<nums.length;i++){ 
    int a=nums[i][0];
    int b=nums[i][1];
    list.get(a).add(b);
    list.get(b).add(a);
}

q.offer(new int[]{1,0,0});

vis[1][0]=true;

while(!q.isEmpty()){
    int size=q.size();
    while(size>0){
        int curr[]=q.poll();
        int used=curr[1];
        int dist=curr[2];
        if(curr[0]==state.length-1){
            System.out.println(dist);
            System.exit(dist);
        }
        for(int node:list.get(curr[0])){

    if(state[node]==1){

        if(used < k && !vis[node][used+1]){

            vis[node][used+1]=true;

            q.offer(new int[]{
                node,
                used+1,
                dist+1
            });
        }

    }

    else{

        if(!vis[node][used]){

            vis[node][used]=true;

            q.offer(new int[]{
                node,
                used,
                dist+1
            });
        }
    }
}
        size--;
        

    }
}
System.out.println(-1);


    }
}
