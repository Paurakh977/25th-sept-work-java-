import java.util.Scanner;

public class password_checker_5 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String static_username="Pandu";
        String static_password="ok123";
        for (int i = 4; i >=0 ; i--) {
            System.out.println("enter your user name");
            String username= obj.next();
            System.out.println("Enter Your Password");
            String password= obj.next();
            if (static_username.equals(username)& static_password.equals(password)){
                System.out.println("Your are sucessfully loggedin");
                break;
            }
            else {
                System.out.println("Invalid Username password");
                System.out.println("You have got "+ i+" more tires.");
            }
        }
    }
}