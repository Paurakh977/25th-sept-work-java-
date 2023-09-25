import java.util.Scanner;

public class result_generator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the no. of the subjects you want to enter");
        int number_of_subjects= obj.nextInt();
        double sum_of_subjects = 0;
        if (number_of_subjects > 0){
            for (int i = 1; i <=number_of_subjects ; i++) {
                System.out.println("Enter your marks in subject "+i);
                sum_of_subjects+= obj.nextDouble();
            }
            if (sum_of_subjects<0){
                System.out.println("INVALID Marks in");
            }
            double percentage=((sum_of_subjects/(number_of_subjects*100.00))*100.00);
            if (percentage >= 80) {
                System.out.println("Congratualtions you got A+ with " + percentage);
            } else if (percentage < 80 & percentage >= 50) {
                System.out.println("Congratualtions you got B+ with " + percentage);
            } else if (percentage < 50 & percentage >= 40) {
                System.out.println("Congratualtions you got C+ with " + percentage);
            } else {
                System.out.println("You failed. Your percentage " + percentage);
            }
        }
        else{
            System.out.println("Invalid no of subject chosen");
        }

    }
}