package chapter1.task11;

// Все цвета радуги
class AllTheColorsOfTheRainbow {
    // Целое число, представляющее цвета
    int anIntegerRepresentingColors;
    // Изменяет оттенок Цвета
    void changeTheHueOfTheColor (int newHue) {
        // ...
        anIntegerRepresentingColors = newHue;
        System.out.print((char) 27 + "[" + newHue + "mWarning! " + (char)27 + "[0m");
    }
    // ...
    int getColor(){
        return anIntegerRepresentingColors;
    }
}

public class Task11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        int[] rainbowColors = {91, 33, 93, 92, 94, 34, 35};

        System.out.println("Rainbow colors");

        for (int colorCode : rainbowColors) {
            allTheColorsOfTheRainbow.changeTheHueOfTheColor(colorCode);
            System.out.println("Current color code: " + allTheColorsOfTheRainbow.getColor());
        }
    }
}
