package Activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Activity2 {
    public static void main(String[] args){
        //Initialize array with 6 numbers
        int a[]= {10,77,10,54,-11,10};
        //Initializing variables for sum and finding
        int toFind = 10;
        int Total = 30;
        int temp = 0;
        //Finding the value in array matches 10
        for(int n: a){
            if (n == toFind){
                //found= true;
                temp = temp+n;
                System.out.println(" Final Value of Temp is   "+ temp);
            }

            }
        //Print if the total value is 30
         if (temp == Total)
            System.out.println("Now the total value is matching   "+temp);


    }

}
