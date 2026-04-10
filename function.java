import java.util.*;
public class function {
    public static void printmy(String name){
        System.out.println(name);
        return;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printmy(name);

    }
}
