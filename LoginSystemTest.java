import java.util.Scanner;

public class FPLS {
    public static void main(String[] args) {

        //Strings + Integers
        String UsernameO;
        String PasswordO;
        String CodeO;
        String CodeT;
        String UsernameT;
        String PasswordT;
        int CodeN;
        int Verify;
        
        //Existing Info
        UsernameT = "Nadav1283";
        PasswordT = "Nadav2004";
        CodeT = "2004";

        //SignUp Info
        Scanner input1 = new Scanner(System.in);
        System.out.println("What do you want you'r username to be?");
        UsernameO = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("What do you want you'r password to be?");
        PasswordO = input2.next();

        //Verification Questions
        CodeN = (int)(Math.random()*6);
        if(CodeN == 1 ) {
            Scanner input3 = new Scanner(System.in);
            System.out.println("What was you'r first pet's name?");
            CodeO = input3.next();
        }
        else if(CodeN == 2) {
            Scanner input4 = new Scanner(System.in);
            System.out.println("What year were you born in?");
            CodeO = input4.next();
        }
        else if(CodeN == 3) {
            Scanner input5 = new Scanner(System.in);
            System.out.println("What is your favorite game? (it doesn't matter what kind of game)");
            CodeO = input5.next();
        }
        else if(CodeN == 4) {
            Scanner input6 = new Scanner(System.in);
            System.out.println("What is your favorite song?");
            CodeO = input6.next();
        }
        else if(CodeN == 5) {
            Scanner input7 = new Scanner(System.in);
            System.out.println("What is you'r favorite movie?");
            CodeO = input7.next();
        }



        //Checking if given info already exists
        if (PasswordT.equals (PasswordO)){

            System.out.println("Invalid username or password, try again");
            return;
        }
        if (UsernameT.equals (UsernameO)){

            System.out.println("Invalid username or password, try again");
            return;
        }

        //Login System
        Scanner input8 = new Scanner(System.in);
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
        }

        else if (username.equals(UsernameT) && code == (CodeT) && password != (PasswordT)){
            System.out.println("Invalid Password!");
        } else if (password.equals(PasswordT) && code == (CodeT) && username != (UsernameT)){
            System.out.println("Invalid Username!");
        } else if (password.equals(PasswordT) && username == (UsernameT) && code != (CodeT)){
            System.out.println("Wrong Answer!");
        } else {
            if (username.equals(UsernameO) && password.equals(PasswordO)) { //needs to find a way to add CodeO into this line. 

                System.out.println("Access Granted! Welcome!");
            }

            else if (username.equals(UsernameO)){
                System.out.println("Invalid Password!");
            } else if (password.equals(PasswordO)) {
                System.out.println("Invalid Username!");
            } else {
                System.out.println("Invalid Username & Password!");
            }
        }
    }
        }

