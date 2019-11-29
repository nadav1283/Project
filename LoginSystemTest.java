import java.util.Scanner;

public class TI {
    public static void main(String[] args) {

        //Strings + Integers + Booleans
        String UsernameO;
        String PasswordO;
        String CodeO;
        String CodeT;
        String UsernameT;
        String PasswordT;
        String AccountA;
        int CodeN;
        boolean AccountYN;

        UsernameO = "username2";
        PasswordO = "password2";
        CodeO = "2004";
        UsernameT = "Nadav1283";
        PasswordT = "Nadav2004";
        CodeT = "2004";

        //Check if you have an existing account or if you are a new user
        Scanner a = new Scanner(System.in);
        System.out.println("Do you already have an account?");
        while (true) {
            AccountA = a.nextLine();
            if (AccountA.equals("yes")) {
                AccountYN = true;
            } else if (AccountA.equals("no")) {
                AccountYN = false;
            }
            else {
                System.out.println("Please try answer yes or no...");
                AccountA = a.nextLine();
                if (AccountA.equals("yes")) {
                    AccountYN = true;
                } else if (AccountA.equals("no")) {
                    AccountYN = false;
                }
                else {
                    System.out.println("Try again later");
                    break;
                }
            }

            if (AccountYN == false) {
                //SignUp Info
                Scanner input1 = new Scanner(System.in);
                System.out.println("SignUp: ");
                System.out.println("What do you want you'r username to be?");
                UsernameO = input1.next();

                Scanner input2 = new Scanner(System.in);
                System.out.println("What do you want you'r password to be?");
                PasswordO = input2.next();

                //Verification Questions
                CodeN = (int) (Math.random() * 6);
                if (CodeN == 1) {
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("What was you'r first pet's name?");
                    CodeO = input3.next();
                } else if (CodeN == 2) {
                    Scanner input4 = new Scanner(System.in);
                    System.out.println("What year were you born in?");
                    CodeO = input4.next();
                } else if (CodeN == 3) {
                    Scanner input5 = new Scanner(System.in);
                    System.out.println("What is your favorite game? (it doesn't matter what kind of game)");
                    CodeO = input5.next();
                } else if (CodeN == 4) {
                    Scanner input6 = new Scanner(System.in);
                    System.out.println("What is your favorite song?");
                    CodeO = input6.next();
                } else if (CodeN == 5) {
                    Scanner input7 = new Scanner(System.in);
                    System.out.println("What is you'r favorite movie?");
                    CodeO = input7.next();
                }


                //Checking if given info already exists
                if (PasswordT.equals(PasswordO)) {

                    System.out.println("Invalid username or password, try again");
                    return;
                }
                if (UsernameT.equals(UsernameO)) {

                    System.out.println("Invalid username or password, try again");
                    return;
                }
            }

            if (AccountYN = true) {
                //Login System //Check for Security Questions problems
                Scanner input8 = new Scanner(System.in);
                System.out.println("Login: ");
                System.out.println("Username: ");
                String username = input8.next();

                Scanner input9 = new Scanner(System.in);
                System.out.println("Password: ");
                String password = input9.next();

                Scanner input10 = new Scanner(System.in);
                System.out.println("Answer to your security question is? ");
                String code = input10.next();

                if (username.equals(UsernameT) && password.equals(PasswordT) && code.equals(CodeT)) {

                    System.out.println("Access Granted! Welcome!");
                } else if (username.equals(UsernameT) && code == (CodeT) && password != (PasswordT)) {
                    System.out.println("Invalid Password!");
                } else if (password.equals(PasswordT) && code == (CodeT) && username != (UsernameT)) {
                    System.out.println("Invalid Username!");
                } else if (password.equals(PasswordT) && username == (UsernameT) && code != (CodeT)) {
                    System.out.println("Not the right answer...");
                    System.out.println("Try again later");
                } else {
                    if (username.equals(UsernameO) && password.equals(PasswordO) && code.equals(CodeO)) {

                        System.out.println("Access Granted! Welcome!");
                        break;
                    } else if (username.equals(UsernameO) && code.equals (CodeO) && username != (PasswordO)) {
                        System.out.println("Invalid Password!");
                        System.out.println("Try again later");
                        break;
                    } else if (password.equals(PasswordO) && code.equals (CodeO) && username != (UsernameO)) {
                        System.out.println("Invalid Username!");
                        System.out.println("Try again later");
                        break;
                    } else if (password.equals(PasswordO) && username.equals (UsernameO) && code !=(CodeO)) {
                        System.out.println("Not the right answer...");
                        System.out.println("Try again later");
                        break;
                    } else {
                        System.out.println("Invalid Username & Password!");
                        System.out.println("Try again later");
                        break;
                    }
                }
            }
        }
    }
}
