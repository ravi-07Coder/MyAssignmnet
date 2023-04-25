package BasicDSa;
//
//
//Q1: Find out if the given number is an Armstrong number or not.

import java.util.Scanner;

//        Description :-
//
//        An Armstrong number of three digits is an integer, where the sum of the cubes
//        of its digits is equal to the number itself.
//
//        Consider the example: 371=> 3^3 + 7^3 + 1^3 = 371
//        ( If you add those all numbers, the final digit should be same as given number ).
//
//
//
//        Specifications:
//class ArmstrongOrNot {
//    public boolean armstrongCheck(int num) {}
//
//    public class Assignment1Q1 {
//        public static void main(String[] args) {}
//    }
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scanner.nextInt();
        ArmstrongNumber obj=new ArmstrongNumber();
        System.out.println(obj.armstrongCheck(n));
    }
    public boolean armstrongCheck(int num)
    {
        int temp=num;
        int newNum=0;
        int k=count(num);
        while (num>0)
        {
            int rem=num%10;
            newNum+=(int)Math.pow(rem,k);
            num=num/10;
        }
        return  temp==newNum;
    }
    public int count(int  n)
    {
        int c=0;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        return  c;
    }
}
