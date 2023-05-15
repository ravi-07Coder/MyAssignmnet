package BasicDSa;

import java.util.Scanner;

class Login {
    String userId = "Ravi", password = "password";
    public String loginUser(String user, String pass){
        Scanner sc = new Scanner(System.in);
        if(user.equals(userId) && pass.equals(password)){
            return "Welcome " + user;
        }
        else{
            int numOfAttempts = 1;
            while(numOfAttempts++ <= 2){
                System.out.println("Enter userId");
                String newUser = sc.next();
                System.out.println("Enter password");
                String newPass = sc.next();
                if(newUser.equals(userId) && newPass.equals(password)){
                    return "Welcome " + newUser;
                }

            }
        }
        return "Contact Admin";
    }
}
public class Solution6 {
    public static void main(String[] args) {
        Login obj = new Login();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userId");
        String user = sc.next();
        System.out.println("Enter password");
        String pass = sc.next();
        System.out.println(obj.loginUser(user, pass));
    }
}