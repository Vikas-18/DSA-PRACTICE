package maths;
import java.util.*;
public class triplets {
    public static void main(String[] args) {
        int[] A= {2, 5, 3, 1, 4, 9};
        System.out.println(solve(A));

    }
    static int solve(int[] A) {
        Arrays.sort(A);
        int a = A[A.length-1];
        int b = A[A.length-2];
        int c = A[A.length-3];
        return a+b+c;
    }
}
