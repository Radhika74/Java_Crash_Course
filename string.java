import java.util.*;
public class string {
    public static void main(String args[]){
        String name ="Radhika";
        String sentence="This is string";
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        System.out.println("Your name:"+user);
        //String concatenation
        String full= sentence + user;
        System.out.println(full);
        System.out.println(full.length());
        //charAt
        for (int i=0; i<full.length(); i++){
            System.out.println(full.charAt(i));
        }
        //Compare
        String str1="Mam";
        String str2= "Mam";
        if (str1.compareTo(str2)==0){
            System.out.println("Strings are equal");
        }
        //substring (beg index, end index)
        String name1 = sentence.substring(1,2);
        System.out.print(name1);
        //Strings are immutable
    }
}
