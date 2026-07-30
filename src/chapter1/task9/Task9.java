package chapter1.task9;

public class Task9 {
    public static void main(String[] args) {
        // До упаковки
        int i = 47;
        System.out.println("Значение i: " + i);

        // Автоупаковка
        System.out.println("Автоупаковка int -> Integer");
        Integer x = i;
        System.out.println("Значение x: " + x);
        System.out.println("Тип x: " + x.getClass().getSimpleName());

        // Автораспаковка
        System.out.println("Автораспаковка Integer -> int");
        i = x;
        System.out.println("Значение i = x: " + i);
    }
}
