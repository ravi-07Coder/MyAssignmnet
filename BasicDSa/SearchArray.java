package BasicDSa;

public class SearchArray {
    public static void main(String[] args) {
        int [] arr={7,61,19,551,19,45,465,56};
        int val=19;
        Main obj=new Main();
       boolean f= obj.searchArray(arr,val);
        if(f==true)
        {

            System.out.println(val+" is  present in array");
        }
        else {
            System.out.println(val+" is not present in array");
        }
    }
}
class Main
{
    public boolean searchArray(int [] arr,int checkValue)
    {
        for(int i:arr)
        {
            if(i==checkValue)
                return  true;
        }
        return  false;
    }
}
