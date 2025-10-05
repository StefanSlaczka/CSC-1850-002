class TestApp{
    public static void main(String[] args) {
        Appointment a1 = new Appointment("Ben Dover", "Mike Rotch", "Friday", 2.2);

        System.out.println("Docter:"  + a1.getDocName());
        System.out.println("Patient: " + a1.getPatientName());
        System.out.println("Day: " + a1.getDayName());
        System.out.println("Duration: " + a1.getHowLongItTakes());

        a1.setDocName("Mike Hunt");
        a1.setPatientName("Sofa King");
        a1.setDayName("Monday");
        a1.setHowLongItTakes(1.3);

        System.out.println("Docter:"  + a1.getDocName());
        System.out.println("Patient: " + a1.getPatientName());
        System.out.println("Day: " + a1.getDayName());
        System.out.println("Duration: " + a1.getHowLongItTakes());
    }
}