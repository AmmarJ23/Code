import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Initialise variables & Arrays
        int[] intArray;
        intArray = new int[10];
        float fNum[] = {34.5f, 12.5f, 11.2f, 15.0f, -10.5f, 101f, -1f};
        char[] cArray = {'a', 'e', 'i', 'o', 'u'};
        Scanner s = new Scanner(System.in);

        //Array for loop testing
        for (int i = 0; i < 10; i++) intArray[i] = i;
        for (int i = 0; i < 10; i++) System.out.println(intArray[i]);
        for (int i = 0; i < intArray.length; i++) intArray[i] = intArray[i] + 10;
        for (int i = 0; i < 10; i++) System.out.println(intArray[i]);

        //Enhanced for loop testing
        for (int val: intArray) System.out.println(val);
        System.out.println("\n");

        for (float fVal: fNum) System.out.println(fVal);
        System.out.println("\n");

        for (char cVal: cArray) System.out.println(cVal);

        //find largest element and its index
        float max = fNum[0];
        int maxIndex = 0;
        int index = 0;

        //find smallest element and its index
        float min = fNum[0];
        int minIndex = 0;
        index=0;
        for (float fVal: fNum)
        {
            
            if (min > fVal)
            {
                min = fVal;
                minIndex = index;
            }
            index++;
        }

        //Print out all information
        // System.out.println("\nLargest Element in fNum is " + max + " at index[" + maxIndex + "]");
        // System.out.println("Smallest Element in fNum is " + min + " at index[" + minIndex + "]");
        
        System.out.println("\n");

        //scanner test
        // String name = s.nextLine();
        // System.out.println(name);

        float fNum2[] = new float[10];
        int i=0;

        for (float temp : fNum2) 
        {
            System.out.println("Enter the value: ");    
            temp = s.nextFloat();
            fNum2[i] = temp;
            i++;
        }

        displayAll(fNum2);
        displayAll(cArray);

        float result = sumMethod(fNum2);
        System.out.println("Sum is :" + result);

        float maxE = findMax(fNum);
        System.out.println("Largest Element is: " + maxE);

        maxIndex = findMaxIndex(fNum);
        System.out.println("Index of largest element is  :" + maxIndex);

        minIndex = findMinIndex(fNum);
        System.out.println("Index of smallest elemetn is :" + minIndex);

        s.close();
    }

    //-----------------------------------pass array to method (float)-----------------------------------//
    private static void displayAll(float[] fArray)
    {
        for (float f : fArray) 
        {
            System.out.println(f);  
        }
    }

    //-----------------------------------pass array to method (char)-----------------------------------//
    private static void displayAll(char[] cArray)
    {
        for (char c : cArray) 
        {
            System.out.println(c);    
        }
    }

    //-----------------------------------sum method-----------------------------------//
    private static float sumMethod(float[] fArray)
    {
        float sum = 0f;
        for (float fVal: fArray) 
        {
            sum += fVal;   
        }
        return sum;
    }

    //-----------------------------------Find max Element method-----------------------------------//
    private static float findMax(float[] fArray)
    {
        float max = 0f;
        for (float f : fArray) {
            if(max < f)
            {
                max = f;
            }
        }
        return max;
    }

    //-----------------------------------Find max Element index method-----------------------------------//
    private static int findMaxIndex(float[] fArray)
    {
        float max = 0f;
        int maxIndex=0, index=0;
        for (float f : fArray) {
            if(max < f)
            {
                f = max;
                maxIndex = index;
            }
            index++;
        }
        return maxIndex;
    }

    //-----------------------------------Find mix Element index method-----------------------------------//
    private static int findMinIndex(float[] fArray)
    {
        float min = 0f;
        int minIndex=0, index=0;
        for (float f : fArray) {
            if(min > f)
            {
                f = min;
                minIndex = index;
            }
            index++;
        }
        return minIndex;
    }
}