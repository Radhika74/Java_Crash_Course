import java.util.*;
public class array {
    public static void main(String arg[]){
//        int marks[]= {1,2,3,4};

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for (int i=0; i<size; i++){
            marks[i]= sc.nextInt();
        }
        for (int i=0; i<size; i++){
            System.out.println(marks[i]);

        }
    }
}
