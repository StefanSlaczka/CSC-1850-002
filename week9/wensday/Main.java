class Fruit{
    double suger;
    double caloirs;
    double friber;
}

class Apple extends Fruit{
    double suger = 10.2;
    double caloirs = 70;
    double fiber = 2;
}

class Banana extends Fruit{
    double suger = 12.2;
    double caloirs = 80;
    double fiber = 4;
}

class Main{
    public static void main(String[] args){
         Apple a = new Apple();
        Banana b = new Banana();

        Fruit maxSugar = max(b, a);
        System.out.println("Fruit with more sugar: " + 
            (maxSugar instanceof Apple ? "Apple" : "Banana"));
    }
    public static Fruit max(Fruit Banana, Fruit Apple) {
        if (Apple.suger > Banana.suger){
            return Apple;
        }else{
            return Banana;
        }
    }
}