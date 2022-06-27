public class chooseStudents {
    public static void main(String[] args) {
        
    }
//nCr = 
    public static int solve(int n,int r)
    {
      if(r==0)
      {
        return 0;
      }

      return solve(n,n-r);
    }
}
