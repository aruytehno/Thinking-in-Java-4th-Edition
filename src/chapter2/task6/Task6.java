package chapter2.task6;

public class Task6 {
    static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        System.out.println("bytes: " + storage("Hello World!"));
    }


}
