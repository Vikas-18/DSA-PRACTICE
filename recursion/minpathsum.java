public class minpathsum {
    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        boolean[][] visited = new boolean[arr.length][arr[0].length];

     
        minsum(arr, 0, 0, visited, 0);
       
       
    }
       static void minsum(int[][] arr,int n,int m,boolean[][] visited,int sum)
       
    {
        if(n==arr.length-1 && m==arr[0].length-1)
        {  
            sum = sum+arr[arr.length-1][arr[0].length-1];
           
                System.out.println(sum);
            
            return;
        }
        
        if(n+1<arr.length && visited[n+1][m]!=true)
        {
            sum+=arr[n][m];
            visited[n][m]=true;
            minsum(arr,n+1,m,visited,sum);
            sum-=arr[n][m];
            visited[n][m]=false;
        }
         if(m+1<arr[0].length && visited[n][m+1]!=true)
        {
            sum+=arr[n][m];
            visited[n][m]=true;
            minsum(arr,n,m+1,visited,sum);
            sum-=arr[n][m];
            visited[n][m]=false;
        }
    }
}
