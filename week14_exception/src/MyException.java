public class MyException extends Exception {
    private int value;
    private String message;

    public MyException(int i) {
        value = i;
        message = new String("MyException occurs at value: " + value);
    }

    public String getMessage() {
        return message;
    }

}
