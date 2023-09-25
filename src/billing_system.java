import java.util.Scanner;
public class billing_system {
    public static void main(String[] args) {
        int order,quantity;
        double total=0;
        String food="" ;
        String descisoin;
        Scanner obj=new Scanner(System.in);
        String name_of_resutrant="Chappu Chapauda Dhaba";
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t" +
                "Welcome To Chappu Chapauda Dhaba");
        System.out.println(" We heartly welcome to our Dhaba,\n ");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                +"MENU\n");

        System.out.println("enter number of items you would like to order: ");
        int n = obj.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tDishes\t\t\t\t\t\t\t\t Rate");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t1)Chicken MO:MO\t\t\t\t\t\t Rs 150");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t2)VEG MO:MO\t\t\t\t\t\t\t Rs 100");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t3)Chicken Cheese Pizza-Medium\t\t Rs 450");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t4)VEG Cheese Pizza-Medium\t\t\t Rs 350");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t5)Chicken Chapauda\t\t\t\t\t Rs 155");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t6)Frooti\t\t\t\t\t\t\t Rs 30");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t7)Tuborg(650ml)\t\t\t\t\t\t Rs 450");
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t Press the Corresponding Number Of The Dish You Would Like To Have");
            order = obj.nextInt();
            if (order == 1) {
                System.out.println("How many quantity of Chicken MO:MO Would You like to have?");
                food = "Chicken MO:MO";
            } else if (order == 2) {
                food = "VEG MO:MO";
                System.out.println("How many quantity of VEG MO:MO Would You like to have?");
            } else if (order == 3) {
                food = "Chicken Cheese Pizza";
                System.out.println("How many quantity of Chicken Cheese Pizza Would You like to have?");
            } else if (order == 4) {
                food = "VEG Cheese Pizza";
                System.out.println("How many quantity of VEG Cheese Pizza Would You like to have?");
            } else if (order == 5) {
                food = "Chicken Chapauda";
                System.out.println("How many quantity of Chicken Chapauda Would You like to have?");
            } else if (order == 6) {
                food = "frooti";
                System.out.println("How many quantity of frooti Would You like to have?");
            } else if (order == 7) {
                food = "Tuborg";
                System.out.println("How many quantity of Tuborg Would You like to have?");
            } else {
                System.out.println("Invalid Input");
            }
            quantity = obj.nextInt();

            System.out.println("For Confirmation. Your orders are:" + quantity + " " + food);
            System.out.println("Press Y for Yes and N for No ");
            descisoin = obj.next();
            if (descisoin.equals("Y") || descisoin.equals("y")) {
                System.out.println("Thank You. Your orders are on the way.");
            } else {
                System.out.println("Run Program Again");
            }
            System.out.println("Hope you had wonderful experience");
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                    + "BILL\n");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tOrders\t\t\t\t\t\t\t\t Quantity\t\t\t\t\t\t Rate\t\t\t\t\tTotal");
            if (food.equals("Chicken MO:MO")) {
                total = (150 * quantity);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tChicken MO:MO" + "\t\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t 150" + "\t\t\t\t\t " + total);
            } else if (food.equals("VEG MO:MO")) {
                total = (100 * quantity);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tVEG MO:MO" + "\t\t\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t 100" + "\t\t\t\t\t " + total);
            } else if (food.equals("Chicken Cheese Pizza")) {
                total = (450 * quantity);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tChicken Cheese Pizza" + "\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t 450" + "\t\t\t\t\t " + total);
            } else if (food.equals("VEG Cheese Pizza")) {
                total = (350 * quantity);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tVEG Cheese Pizza" + "\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t 350" + "\t\t\t\t\t " + total);
            } else if (food.equals("Chicken Chapauda")) {
                total = (150 * quantity);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tChicken Chapauda" + "\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t 150" + "\t\t\t\t\t " + total);
            } else if (food.equals("frooti")) {
                total = (30 * quantity);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tfrooti" + "\t\t\t\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t  30" + "\t\t\t\t\t  " + total);
            } else if (food.equals("Tuborg")) {
                total = (450 * quantity);
                System.out.println("\t\t\t\t\t\t\t\t\t\t\tTuborg" + "\t\t\t\t\t\t\t\t\t" + quantity + "\t\t\t\t\t\t\t  450" + "\t\t\t\t\t " + total);
            }

            System.out.println("VAT:13%");
            System.out.println("Discount: 10%");

            double gtotal = total - (total * 0.1);
            gtotal = gtotal + (gtotal * 0.13);
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                    + "Grand Total: " + gtotal);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPLEASE VISIT AGAIN");
        }
    }
}
