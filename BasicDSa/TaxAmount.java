package BasicDSa;

import java.util.Scanner;

//Q5. Calculate the income tax on the basis of following table.
//
//              Note:-Assume slab is consider for Male, Female as well as Senior citizen
//
//                             Slab                                   Income Range                             Tax payable in Percentage
//
//                             Slab A                               0-1,80,000                                                                  Nil
//
//                             Slab B                               1,81,001-3,00,000                                                    10%
//
//                             Slab C                               3,00,001-5,00,000                                                    20%
//
//                             Slab D                               5,00,001-10,00,000                                                 30%
//
//              Accept CTC from user and display tax amount
//
//Description:-
//
//Given 4 different types of slabs along with the percentage of tax payable in association with income ranges which are applicalble to Male,Female as well as Senior citizen.You need to specify the CTC to display the taxable amount using the above slab rates.
//
//Specifications:
//
//class TaxAmount{
//    public double calculateTaxAmount(int ctc){}
//}
//public class Assignment1Q5 {
//    public static void main(String args[]) {}
//}
public class TaxAmount {
    public static void main(String[] args) {
        Scanner scannner=new Scanner(System.in);
        System.out.println("please enter the ctc");
        int n= scannner.nextInt();
             double ans=calculateTaxAmount(n);
             if (ans==0.0)
             {
                 System.out.println("Nil");
             }
             else
             {
                 System.out.println( ans);
             }
    }
    public static double calculateTaxAmount(int ctc){
             double ans=0.0;
               if(ctc>1 && ctc<=80000)
               {
                   ans=0.0;
                   return  ans;
               }
               else
               if(ctc>181000 && ctc<=500000)
               {
                   ans=10.0;
                   return  ans;
               }

               else
               if(ctc>300001 && ctc<=500000)
               {
                   ans=20.0;
                   return  ans;
               }

               else
               if(ctc>5000001 && ctc<=1000000)
               {
                   ans=30.0;
                   return  ans;
               }
             return  ans;
    }
}
