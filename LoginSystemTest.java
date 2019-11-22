import java.util.Scanner;

public class TI {
    public static void main(String[] args) {

        String UsernameO;
        String PasswordO;
        String UsernameT;
        String PasswordT;

        Scanner input1 = new Scanner(System.in);
        System.out.println("What do you want you'r username to be?");
        UsernameO = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("What do you want you'r password to be?");
        PasswordO = input2.next();

        PasswordT = "Nadav2004";
        UsernameT = "Nadav1283";

        if ((PasswordT == PasswordO)||(UsernameT == UsernameO)){

            System.out.println("Invalid username or password, try again");
            return;
        }

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input3.next();

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input4.next();

        if (username.equals(UsernameT) && password.equals(PasswordT)) {

            System.out.println("Access Granted! Welcome!");
        }

        else if (username.equals(UsernameT)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(PasswordT)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }

}
