import java.util.*;
public class age {
    public static void age_greater(int num1) {
        if (num1 > 18) {
            System.out.println("Yes, eligible for vote");
        } else {
            System.out.println("No, age is less then 18 not eligible");
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        age_greater(num1);
    }
}
