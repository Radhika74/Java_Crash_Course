public class StringBuilde {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello jh");
        System.out.println(sb);
        //charAt
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'h');
        System.out.println(sb);
        System.out.println(sb.insert(0, 's'));
        System.out.println(sb.delete(0,2));
        System.out.println(sb.append("k"));
        System.out.println(sb.reverse());
    }
}
