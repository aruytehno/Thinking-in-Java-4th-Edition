package chapter2.task7;

public class Incrementable {
    static void increment () {
        StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}