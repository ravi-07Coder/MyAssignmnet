package BasicDSa;

import java.util.Scanner;

//Q3. Find out the simple as well as the compound interest of supplied value
//
//Description:-
//
//Simple Interest:- Generally, simple interest paid or received over a certain period is a fixed percentage of the principal amount that was borrowed or lent
//
//              Simple Interest = (P×r×n)/100
//
//              where:
//
//              P            =            Principal amount
//
//              r             =            Annual interest rate
//
//              n            =            Term of loan, in years
//
//​Compound Interest:-Compound interest accrues and is added to the accumulated interest of previous periods; it includes interest on interest, in other words.
//
//              Compound Interest = P(1+r)^t-P
//
//              Where:
//
//              P=Principal amount
//
//              r=Annual interest rate
//
//              t=Number of years interest is applied
//
//Specifications:
//class SiCi {
//    public double simpleInterest(double principalAmount,int time,double interestRate){}
//    public double compoundInterest(double principalAmount,int time,double interestRate){}
//}
//public class Assignment1Q3 {
//    public static void main (String args[]) {}
//}
public class Scifi {
    public static void main(String[] args) {
        Scifi obj=new Scifi();
        Scanner scanner=new Scanner(System.in);
        double principal=scanner.nextDouble();
        int time=scanner.nextInt();
        double rate=scanner.nextDouble();
        System.out.println(obj.simpleInterest(principal, time, rate));
        System.out.println(obj.compoundInterest(principal, time, rate));

    }
    public double simpleInterest(double principalAmount,int time,double interestRate){
        return (principalAmount*time*interestRate)/100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        return principalAmount*Math.pow(1+interestRate,time)-principalAmount;
    }
}
