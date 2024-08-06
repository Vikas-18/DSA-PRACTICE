import java.util.Scanner;

public class searchcourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of course:");
        int n = sc.nextInt();
        if (n <= 0 || n > 20) {
            System.out.println("Invalid Range");
            sc.close();
            return;
        }

        System.out.println("Enter course names:");
        String[] courses = new String[n];
        for (int i = 0; i < n; i++) {
            courses[i] = sc.next();
        }

        System.out.println("Enter the course to be searched:");

        String search = sc.next();
        boolean ans = false;
        for (int i = 0; i < courses.length; i++) {
            if (search.equals(courses[i])) {
                ans = true;
                break;
            }
        }
        if (ans) {
            System.out.println(search + " course is available");
        } else {
            System.out.println(search + " course is not available");
        }
        sc.close();
    }
}
