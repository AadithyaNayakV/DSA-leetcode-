
public class thirrdimage{
   static int a[][]={
    {1,12,3},
    {1,12,3},
    {1,12,3},
};
public static void main(String[] args) {
    
}
static int mincost(int a){
    int ans=Integer.MAX_VALUE;
    if(check(a))return 0;
for(int i=1;i*i<=a;i++){
    if(a%i==0){
    int aadi=a/i;
    if(check(aadi)){
        ans=Math.min(ans,i);
    }
    int padi=a/i;
    int s=a/padi;
    if(aadi!=padi&&check(s)){
        ans=Math.min(ans,padi);
    }

}}
return ans;
}
static boolean check(int n){
    if(n==1)return true;
    int count=0,p=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){count++;if(isp(i))p++;}

    }
    return Math.pow(2,p)==count;
}
static boolean isp(int n){
    if(n < 2) return false;
    for(int i=2;i*i<=n;i++){
        if(n%i==0)return false;
    }
    return true;
}
static int helper(int r,int c){
    if(r>=a.length||c>=a[0].length)return Integer.MAX_VALUE;
    if(r==a.length-1&&c==a[0].length-1){
   return mincost(a[r][c]);}

int cost=mincost(a[r][c]);
    

        int right = helper(r, c + 1);
    int down = helper(r + 1, c);
    int best = Math.min(right, down);

    if (best == Integer.MAX_VALUE)
        return Integer.MAX_VALUE;

    return cost + best;


}
}


