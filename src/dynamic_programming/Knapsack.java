package dynamic_programming;

/**
 * 0 - 1 Knapsack Problem
 */
public class Knapsack {
    // Returns the maximum value that can be put in a knapsack of capacity W
    static int knapSack(int W, int wt[], int val[], int n)
    {
        int i,j;
        int K[][] = new int[n+1][W+1];
        for(i=0; i<=n; i++){
            for(j=0; j<=W; j++){
                if(i==0 || j==0)
                    K[i][j] = 0;
                else if(wt[i-1]<=j)
                    K[i][j] = Math.max(val[i-1] + K[i-1][j-wt[i-1]],
                            K[i-1][j]);
                else
                    K[i][j] = K[i-1][j];
            }
        }
        return K[n][W];
    }

    public static void main(String[] args) {
        int weight[] = {4,5,1};
        int values[] = {1,2,3};
        System.out.println("maximum possible value you can get: "+knapSack(4, weight, values, 3));
    }
}
