public class Main {
    public static void main(String[] args) throws Exception {
        int[] list = new int[5];

        for (int i : list) {
            System.out.println(i);
        }

        reverse(list);
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; 
             i < list.length; i++, j--) {
          result[j] = list[i];
        }
        return result;
    }
          
      
}