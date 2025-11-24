class Main {

    public static int factorial(int i){
        if (i == 0) {return 1;}
        else {
            return i*factorial(i-1);
        }
    }

    public static int fibonacii(int i){
        if (i < 2) {return i;}
        else {
            return (fibonacii(i-1) + fibonacii(i-2));
        }
    }
    public static void main(String[] args) {
        System.err.println(factorial(6));
        System.err.println(fibonacii(6));
    }
}