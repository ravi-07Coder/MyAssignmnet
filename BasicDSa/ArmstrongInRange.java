package BasicDSa;

import java.util.ArrayList;

//Q2. Find out all the Armstrong numbers falling in the range of 100-999
//
//Description :-
//
//An Armstrong number of three digits is an integer, where the sum of the cubes of its digits is equal to the number itself.
//
//Consider the example: 371=> 3^3 + 7^3 + 1^3 = 371 ( If you add those all numbers, the final digit should be same as given number ).
//
//Find the Armstrong numbers between 100 to 999.
//
//Test cases:
//
//              Output : 153 370 371 407
//
//Specifications:
//class ArmstrongNumBetweenRange{
//    public int[] armstrongNumbersInRange(int min , int max){}
//}
//
//public class Assignment1Q2 {
//    public static void main (String [] args) {
//
//       int min = 100;int max = 999;
//
//    }
//}
public class ArmstrongInRange {
    public static void main(String[] args) {
      ArmstrongInRange obj=new ArmstrongInRange();
        ArrayList<Integer> arrayList=new ArrayList<>();
        int min=100;
        int max=999;
        for (int i = min; i <=max ; i++) {
            if (obj.armstrongCheck(i))
                arrayList.add(i);
        }
        System.out.println(arrayList);
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
