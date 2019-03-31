package gunju;

public class Hello {

    public String getMessage() {
        return "Hello World";
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.getMessage());
    }
}
