package chapter1.task8;

class StaticTest {
    static int i = 47;
}

public class Task8 {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        // Оба объекта видят одно и то же значение
        System.out.println("st1.i: " + st1.i);
        System.out.println("st2.i: " + st2.i);

        st1.i = 100; // Меняем через первый объект

        // Значение изменилось для обоих
        System.out.println("st1.i: " + st1.i);
        System.out.println("st2.i: " + st2.i);

        st2.i = 200; // Меняем через второй объект

        // Снова изменилось для обоих
        System.out.println("st1.i: " + st1.i);
        System.out.println("st2.i: " + st2.i);

        // Доступ через класс - тоже самое значение
        System.out.println("StaticTest.i: " + StaticTest.i);
    }
}
