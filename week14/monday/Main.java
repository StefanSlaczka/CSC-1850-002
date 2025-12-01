class Main{
    public static void main(String[] args) {
        System.out.println(isEven(123));
        System.out.println(isLeapYear(2004));
        System.out.println(toOnehundored());
        System.out.println(primOrNot(97));
    }

    public static boolean isEven(int x) {
        if(x % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isLeapYear(int x) {
        if( x % 4 == 0 || x % 100 == 0 || x % 400 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static int toOnehundored() {
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            sum += i;
        }
        /*
        int i = 0;
        while ( i <= 100;){
            i++
            sum += i;
        }

        int i = 0;
        do{
            i++
            sum += i;
        }  while( i <= 100;)
        */

        return sum;
    }

    
}