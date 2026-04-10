import java.util.*;
public class number_greatest{
    public static void func(int num1, int num2){
        if (num1>num2){
            System.out.println("Num1 is greatest");
        }else{
            System.out.println("Num2 is greatest");
        }
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        func(num1, num2);

    }
}
