public class HamiltonTree {

    public static void main(String[] args) {

        int n = 5;
        int m = 4;

        int[][] edges = {
            {1, 2},
            {1, 3},
            {1, 4},
            {1, 5}
        };

        int[] degree = new int[n + 1];

        // Find degree of every node
        for (int i = 0; i < m; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            degree[u]++;
            degree[v]++;
        }
int op=0;
for(int i=1;i<=n;i++){
    if(degree[i]>2)op+=degree[i]-2;
}

    }
}