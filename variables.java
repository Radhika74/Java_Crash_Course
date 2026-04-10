import java.util.*;
public class variables {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello World\n");
        System.out.print("Hello World");
        System.out.print("Hello World");
        String name= "radhika";
        int age = 10;
        double price = 25.25;
        int a =10;
        int b=30;
        b=40;
        System.out.println(name);
        System.out.println(price);
        System.out.println(age);
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //input taking from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num:");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Enter name:");
        String name_user = sc.next();
        System.out.println(name_user);
        sc.nextLine();

        System.out.println("Enter full sentence:");
        String names_sentence = sc.nextLine();
        System.out.println(names_sentence);
        sc.close();
    }

}