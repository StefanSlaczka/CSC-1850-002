public class HW_3{
	public static void main(String[] arr){

                // making indepences day
	        Holiday independenceDay = new Holiday("IndependenceDay", 4, "July");
                // making thanksgiving
	        Holiday thanksgiving = new Holiday("Thanksgiving", 27, "November"); 
                // Compareas thanksgiving day and indepecedens day are the same date
	        boolean sameMonth = independenceDay.isSameMouth(thanksgiving);

                System.out.println("Holiday 1: " + independenceDay.getName() + " on " + independenceDay.getMouth() + " " + independenceDay.getDay());
                System.out.println("Holiday 2: " + thanksgiving.getName() + " on " + thanksgiving.getMouth() + " " + thanksgiving.getDay());
                System.out.println("Are these holidays in the same month? " + sameMonth);

                // makeing veterense day
                Holiday veteransDay = new Holiday("VeteransDay", 11, "November");
                // Comparing thanksgiving with verteresn day
                boolean sameMonthVeterans = thanksgiving.isSameMouth(veteransDay);


                System.out.println("\nAdditional comparison:");
                System.out.println("Thanksgiving and VeteransDay are in the same month? " + sameMonthVeterans);
	}
}