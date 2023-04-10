public class Main {
    public static void main(String[] args) throws Exception {
        //Initialise variables & Arrays
        int[] intArray;
        intArray = new int[10];
        float fNum[] = {35f, 10f, 13f, 14f, 15f, 19f, -10f, 12.5f, -13.6f};
        float sum = 0f;
        char[] cArray = {'a', 'e', 'i', 'o', 'u'};

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

        for (float fVal: fNum) sum += fVal;

        //find largest element and its index
        float max = fNum[0];
        int maxIndex = 0;
        int index = 0;
        for (float fVal: fNum)
        {
            if(max < fVal) 
            {
                max = fVal;
                maxIndex = index;
            }
            index++;
        }

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
        System.out.println("\nLargest Element in fNum is " + max + " at index[" + maxIndex + "]");
        System.out.println("Smallest Element in fNum is " + min + " at index[" + minIndex + "]");
        System.out.println("Sum of fNum: " + sum);
        System.out.println("\n");

    }
}