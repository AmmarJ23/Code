public class Main {
    public static void main(String[] args) throws Exception {
        int[] intArray;
        intArray = new int[10];

        for (int i = 0; i < 10; i++) intArray[i] = i;

        for (int i = 0; i < 10; i++) System.out.println(intArray[i]);

        for (int i = 0; i < intArray.length; i++) intArray[i] = intArray[i] + 10;

        for (int i = 0; i < 10; i++) System.out.println(intArray[i]);

        float fNum[] = {35f, 10f, 13f, 14f, 15f, 19f};

        System.out.println(fNum[4]);


    }
}