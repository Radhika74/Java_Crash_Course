import java.util.*;
public class userchoice {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int pos=0;
        int neg=0;
        int zero=0;
        char choice;
        do{
            int num = sc.nextInt();
            if (num>0){
                pos++;
            }
            else if ( num<0){
                neg++;
            }
            else{
                zero++;
            }
                System.out.println("Continue? (y/n)");
                choice = sc.next().charAt(0);

        }while (choice == 'y' || choice == 'Y');
        System.out.println("Positive: "+pos);
        System.out.println("Negative: "+neg);
        System.out.println("Zeroes: "+zero);
    }
}
