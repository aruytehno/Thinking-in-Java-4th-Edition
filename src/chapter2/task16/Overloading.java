package chapter2.task16;

/**
 * Tree - Класс дерева
 */
class Tree {
    int height;

    /**
     * Tree - Конструктор без параметров
     */
    Tree() {
        System.out.print("Сажаем росток");
        height = 0;
    }

    /**
     * Tree - Конструктор
     * @param initialHeight - высота посаженного дерева
     */
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Создание нового дерева высотой " + height + " м.");
    }

    /**
     * info - вывод информации
     */
    void info() {
        System.out.println("Дерево высотой " + height + " м.");
    }

    /**
     * info - вывод информации с аргументом
     * @param s - дополнительное сообщение
     */
    void info(String s) {
        System.out.println(s + ": Дерево высотой " + height + " м.");
    }
}

/**
 * Overloading - Демонстрация перегрузки
 */
public class Overloading {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перегруженный метод");
        }
        // Перегруженный конструктор
        new Tree();
    }
}

// Указать папку для документации: -d docs
// javadoc -d docs .\Overloading.java