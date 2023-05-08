// Name       : Ammar bin Jamalludin
// Matric No. : A21EC0160
// Title      : Array of Primitive Datatype

import java.util.Scanner;

class CountArray
{
    public void method1 (int num) {
        num = num-5;
    }

    public void method2 (double[] number){
        System.out.println ("\nThe content of array data1:");
        //(i)Use enhanced for-loop to print the content of the array
        //passed [1 mark]
        for (double item: number)
            System.out.println (item);
    }

    public void method3 (int[] dArray){
        for (int i=0; i<dArray.length; i=i+2){
            dArray[i]= dArray[i]*2;
        }
    }
}

public class TestArray {
    public static void main (String[] args) {
        int size = 5;
        double [] data1 = new double [size];
        //(ii) declare another integer array named data2 using initializer 
        // list and initialized with values :3, 1, 5, 7, 4 and 12 [1 mark]
        int [] data2 = {3, 1, 5, 7, 4, 12};
        CountArray cA = new CountArray();

        //(iii) call method1 and pass the third element of array data2 [1 mark]
        cA.method1(data2[2]);
        Scanner in = new Scanner (System.in);

        for (int i=0; i<data1.length; i++)
        {
        System.out.print("Enter number: ");
        //(iv)assign input to element of data1 [1 mark]
        data1[i] = in.nextDouble();
        }


        //(v) call method2 and pass array data1 [1 mark]
        cA.method2(data1);

        //(vi) call method findMinimum to get the minimum value of array data2 [1 mark]
        findMinimum(data2);
        
        //(vii) call method3 and pass array data2 [1 mark]
        cA.method3(data2);
    }


    static void findMinimum (int []num){
    int min=num[0];
    //(viii) using enhanced for-loop, get the minimum value of the array passed [3 marks]
    for ( int val : num)
    {
        if(val < min)
            min = val;
    }
    System.out.println();
    System.out.println("The minimum value of array data2 is: " + min );
    }
}
