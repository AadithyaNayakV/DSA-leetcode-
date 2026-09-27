import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class MST {
    public static void main(String[] args) {
        int N = 5;

int nums[][] = {
    {0,1,10},
    {0,2,6},
    {0,3,5},
    {1,3,15},
    {2,3,4},
    {3,4,8}
};
int m=N-1;

boolean vis[]=new boolean[N];
PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
    return a[1]-b[1];
});
pq.offer(new int[]{0,0});
int cost=0,edge=0;
while(!pq.isEmpty()){
    int size=pq.size();
    while(size-->0){
        int curr[]=pq.poll();
          if(vis[curr[0]])continue;
          vis[curr[0]]=true;   

        cost+=curr[1];
        edge++;

       for(int i=0;i<nums.length;i++){
         
            if(nums[i][0]==curr[0])

            pq.offer(new int[]{nums[i][1],nums[i][2]});
            else if(nums[i][1]==curr[0])
                pq.offer(new int[]{nums[i][0],nums[i][2]});
       }
    }
}

    }
}
