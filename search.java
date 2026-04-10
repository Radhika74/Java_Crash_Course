public class search{
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4};
        int n = num.length;
        int key = 7;
        for (int i = 0; i < n; i++) {
            if (num[i] == key) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
