import java.nio.channels.InterruptibleChannel;
import java.util.Arrays;
import java.util.PriorityQueue;

public class min_energy_path{
    static int n=3,m=3;
    static boolean vis[][];
    public static void main(String[] args) {
        int nums[][]={
            {1,2,3},
            {4,1,2},
            {5,6,1 }
        };
        vis=new boolean[n][m];
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);

      int dist[][] = new int[n][m];

        for(int i=0;i<n;i++)
            Arrays.fill(dist[i], Integer.MAX_VALUE);

        dist[0][0] = nums[0][0];

        pq.offer(new int[]{nums[0][0],0,0});
        
            int ii[]={-1,+1,0,0};
            int jj[]={0,0,+1,-1};
        while(!pq.isEmpty()){
            int cur[]=pq.poll();
            int cost=cur[0];
            int r=cur[1];
            int c=cur[2];
            if(r==n-1&&c==m-1){System.out.println(cost);return;}
            if(cost>dist[r][c])continue;


            for(int i=0;i<4;i++){
                int nr=r+ii[i];
                int nc=c+jj[i];
                if(nr<0||nc<0||nc>=m||nr>=n){
                    continue;
                }
                else{
                    int newcost=cost+nums[nr][nc];
                    if(newcost<dist[nr][nc]){
                          dist[nr][nc] = newcost;
                          pq.offer(new int[]{newcost,nr,nc});

                    }
                }
            }


        }
        // int ans=helper(nums,0,0);
        // System.out.println(ans);
    }
static int helper(int [][]nums,int r ,int c){
    if(r>=n||c>=m||r<0||c<0)return Integer.MAX_VALUE/2;
    if(r==n-1&&c==m-1)return nums[r][c];
    if(vis[r][c])return Integer.MAX_VALUE/2;
    vis[r][c]=true;
    int u=helper(nums, r+1, c);
    int v=helper(nums, r-1, c);
    int x=helper(nums, r, c+1);
    int y=helper(nums, r, c-1);
    vis[r][c]=false;
        return nums[r][c]+Math.min(Math.min(u,v),
        Math.min(x,y));
    }
}