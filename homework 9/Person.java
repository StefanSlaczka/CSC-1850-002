public class Person{
    public int age = 25;
    protected String name = "Alex";
    String city = "New Yourk";
    private double salary = 55000;

    public void showInfo(){
        System.out.println(age + ", " + name + ", " + city + ", " + salary);
    }
}