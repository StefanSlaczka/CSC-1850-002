public class main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do {
            System.out.println(i);
            sum += i;
            i++;
        } while( i <= 100);
        System.out.println(sum);
    }
}
