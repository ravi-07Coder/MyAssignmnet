package BasicDSa;

import java.util.Scanner;

//Q4. Supply marks of three subject and declare the result, result declaration is based on below conditions:
//
//              Condition 1: -All subjects marks is greater than 60 is Passed
//
//              Condition 2: -Any two subjects marks are greater than 60 is Promoted
//
//              Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.
//
//Description:-
//
//Specify the marks of 3 subjects and the results will be declared based on the conditions above and for reference go through the test cases for better understanding.
//
//
//Test cases:-
//
//              TestCase1:-
//
//                            Input:-     10          10          10
//
//                            Output:-  failed
//
//              TestCase2:-
//
//                            Input:-      70          10          10
//
//                            Output:-   failed
//
//              TestCase3:-
//
//                            Input:-      10          20          40
//
//                            Output:-   passed
//
//              TestCase4:-
//
//                             Input:-      10          30          40
//
//                            Output:-    Passed
//
//                                            promoted
//
//Specifications:
//
//class ResultDeclaration{
//    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {}
//}
//public class Assignment1Q4 {
//    public static void main(String[] args) {}
//}
public class ResultDeclaration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double marks1=scanner.nextDouble();
        double marks2=scanner.nextDouble();
        double marks3=scanner.nextDouble();
        System.out.println(declareResults(marks1, marks2, marks3));
    }
    public static String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {

        if(subject1Marks>60 && subject2Marks>60 && subject3Marks>60)
        {
            return "passed";
        }
        else  if((subject1Marks>60 && subject2Marks>60 && subject3Marks<60)||(subject1Marks>60 && subject2Marks<60 && subject3Marks>60)||(subject1Marks<60 && subject2Marks>60 && subject3Marks>60))
        {
            return "promoted";
        }
        else  if((subject1Marks<60 && subject2Marks<60 && subject3Marks<60)||(subject1Marks<60 && subject2Marks<60 && subject3Marks>60)||(subject1Marks<60 && subject2Marks>60 && subject3Marks<60) ||(subject1Marks>60 && subject2Marks<60 && subject3Marks<60) )

        {
            return "failed";
        }
        return null;
    }
}
