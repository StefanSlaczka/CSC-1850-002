public class main {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++){
            if (prime(i)){
                System.out.println(i);
            }
        }
    }
    public static Boolean prime (int i){
        for (int d = 2; d < i; d ++){
            if (i%d == 0) return false;
        } return true;
    } 
}
