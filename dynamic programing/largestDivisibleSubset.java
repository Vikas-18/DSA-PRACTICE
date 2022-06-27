// import java.util.ArrayList;

// public class largestDivisibleSubset {
//     public static void main(String[] args) {
        
//     }
//     public static ArrayList<Integer> solve(int[] arr,int idx,int prev)
//     {
//         //base case
//         if(idx==0)
//         {

//         }

//         //not pick
//         return solve(arr, idx+1,prev);

//         //pick
//         ArrayList<Integer> ans = new ArrayList<>();
//         if(arr[prev]%arr[idx] || arr[idx]%arr[prev])
//         {
//             ans.add(arr[idx]);
//             return solve(arr, idx+1, prev+1);
//         }
        
//     }

