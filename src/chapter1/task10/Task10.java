package chapter1.task10;

public class Task10 {

    // java .\Task10.java arg1 arg2 arg3
    public static void main(String[] args) {
        System.out.println("Переданных аргументов: " + args.length);
        for (String arg: args) {
            System.out.println(arg);
        }
    }
}
