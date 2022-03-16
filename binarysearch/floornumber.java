public class floornumber {
    
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,7,12,14,17};
        int t=8;
        int s=0;
        int e = arr.length-1;
        while(s<=e)
        {
            int mid = s+(e-s)/2;

           

             if(arr[mid]<t)
            {
                s = mid+1;
            }

            else if(t<arr[mid]){
                e = mid-1;
            }
            else{
                System.out.println(mid);
            }
        }

        System.out.println(e);
    }
}


