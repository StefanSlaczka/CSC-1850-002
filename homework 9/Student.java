public class Student extends Person {
    public void showAccess() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(city);
        //System.out.println(salary);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.showAccess();
    }
}