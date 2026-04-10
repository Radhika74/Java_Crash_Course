public class factorial {
    public static int fact_cal(int num){
        if (num<=1){
            return 1;
        }
        return num*fact_cal(num-1);
    }
    public static void main(String arg[]){
        int num =5;
        int res;
        res = fact_cal(num);
        System.out.println(res);
    }
}
