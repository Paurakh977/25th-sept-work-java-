import java.util.Scanner;
public class billing_system {
    public static void main(String[] args) {
        int [] array_of_rates={150,100,450,350,155,30,450};
        int order,quantity;
        int no_of_iteration=0;
        double service_tax=0.02;
        double sum=0;
        double total=0;
        String descisoin;
        Scanner obj=new Scanner(System.in);
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t" +
                "Welcome To Chappu Chapauda Dhaba");
        System.out.println(" We heartly welcome to our Dhaba,\n ");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                +"MENU\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tDishes\t\t\t\t\t\t\t\t Rate");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t1)Chicken MO:MO\t\t\t\t\t\t Rs 150");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t2)VEG MO:MO\t\t\t\t\t\t\t Rs 100");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t3)Chicken Cheese Pizza-Medium\t\t Rs 450");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t4)VEG Cheese Pizza-Medium\t\t\t Rs 350");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t5)Chicken Chapauda\t\t\t\t\t Rs 155");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t6)Frooti\t\t\t\t\t\t\t Rs 30");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t7)Tuborg(650ml)\t\t\t\t\t\t Rs 450");
        System.out.println("no. of items you would have?");
        no_of_iteration=obj.nextInt();
        String [] array_of_food_items=new String[no_of_iteration];
        int [] array_of_food_total=new int[no_of_iteration];
        int [] array_of_quantity=new int[no_of_iteration];
        int [] array_of_ordered_food_rates=new int[no_of_iteration];
        for (int i = 1; i <= no_of_iteration ; i++) {
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t Press the Corresponding Symbol Number Of The Dish You Would Like To Have");
            order=obj.nextInt();
            if (order==1){
                System.out.println("How many quantity of Chicken MO:MO Would You like to have?");
                array_of_food_items[i-1]="Chicken MO:MO";
            } else if (order==2) {
                array_of_food_items[i-1]="VEG MO:MO";
                System.out.println("How many quantity of VEG MO:MO Would You like to have?");
            } else if (order==3) {
                array_of_food_items[i-1]="Chicken Cheese Pizza";
                System.out.println("How many quantity of Chicken Cheese Pizza Would You like to have?");
            } else if (order==4) {
                array_of_food_items[i-1]="VEG Cheese Pizza";
                System.out.println("How many quantity of VEG Cheese Pizza Would You like to have?");
            } else if (order==5) {
                array_of_food_items[i-1]="Chicken Chapauda";
                System.out.println("How many quantity of Chicken Chapauda Would You like to have?");
            } else if (order==6) {
                array_of_food_items[i-1]="frooti";
                System.out.println("How many quantity of frooti Would You like to have?");
            } else if (order==7) {
                array_of_food_items[i-1]="Tuborg";
                System.out.println("How many quantity of Tuborg Would You like to have?");
            }
            else {
                System.out.println("Invalid Input");
            }
            array_of_quantity[i-1]= obj.nextInt();
            System.out.println("For Confirmation. Your orders are:"+array_of_quantity[i-1]+" "+array_of_food_items[i-1]);
            System.out.println("Press Y for Yes and N for No ");
            descisoin=obj.next();
            if (descisoin.equals("Y") || descisoin.equals("y")){
                System.out.println("Thank You. Your orders are on the way.");
            }
            else {
                System.out.println("Run Program Again");
            }
            array_of_food_total[i-1]=array_of_quantity[i-1]*array_of_rates[order-1];
            array_of_ordered_food_rates[i-1]=array_of_rates[order-1];
        }
////        Calculating  area
        for (int i = 0; i <no_of_iteration ; i++) {
            sum+=array_of_food_total[i];
        }
        double discount_done=sum-(sum*0.1);
        double discount_amnt=sum*0.1;
        double vat_done=discount_done+(discount_done*0.13);
        double vatamnt=discount_done*0.13;
        double gotal=vat_done+(vat_done*service_tax);
//        presenting area
        System.out.println("S.N\t\t\tITEM\t\t\t\t\t\t\t\t\tQuantity\t\t\t\t\t rate\t\t\t\t\ttotal");
        for (int i = 0; i < no_of_iteration ; i++) {
            System.out.println(i+1+"\t\t\t"+array_of_food_items[i]+"\t\t\t\t\t\t\t\t\t"+array_of_quantity[i]+"\t\t\t\t\t "+array_of_ordered_food_rates[i]+"\t\t\t\t\t"+array_of_food_total[i]);
        }
        System.out.println("\n VAT:13%\t\t\t\t\t\tDISCOUNT:10%\t\t\t\t\t\tSERVICE TAX 2%\n\n");
        System.out.println("Discount amount----->Rs "+discount_amnt);
        System.out.println("Vat Amount------>Rs "+vatamnt);
        System.out.println(("GRAND TOTAL----->Rs "+gotal));
    }
}
