public class seiveOfErathosthenes {
    public static void main(String[] args) {
        boolean[]arr = new boolean[12];
        for (int i = 2; i*i<=arr.length; i++) {
            int j=2;
            while(j*i<arr.length)
            {
                arr[j*i] = true;
                j++;
            }
        }

        for (int i = 2; i <arr.length; i++) {
            if(arr[i]==false)
            System.out.println(i);
        }
    }
}
