public class Main {
    public static void main(String[] args) throws Exception {
        int[] intArray;
        intArray = new int[10];
        float fNum[] = {35f, 10f, 13f, 14f, 15f, 19f};
        char[] cArray = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < 10; i++) intArray[i] = i;
        for (int i = 0; i < 10; i++) System.out.println(intArray[i]);
        for (int i = 0; i < intArray.length; i++) intArray[i] = intArray[i] + 10;
        for (int i = 0; i < 10; i++) System.out.println(intArray[i]);


        System.out.println(fNum[4]);

        for (int val: intArray) System.out.println(val);
        System.out.println("\n");
        
        for (float fVal: fNum) System.out.println(fVal);
        System.out.println("\n");

        for (char cVal: cArray) System.out.println(cVal);
    }
}