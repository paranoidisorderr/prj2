package by.ivan.lesson2.rainbow;

public class Rainbow {
    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int LIGHT_BLUE = 5;
    private static final int BLUE = 6;
    private static final int PURPLE = 7;

//  privateант B. Отдельный диапазон номеров

    private static final int RED_ORANGE = 101;
    private static final int ORANGE_YELLOW = 102;
    private static final int YELLOW_GREEN = 103;
    private static final int GREEN_LIGHT_BLUE = 104;
    private static final int LIGHT_BLUE_BLUE = 105;
    private static final int BLUE_PURPLE = 106;

    public boolean isColor(int number) {
        if (number >= RED && number <= PURPLE) {
            return true;
        }
    }

    public boolean isMixedColor (int number) {
        if (number >= RED_ORANGE && number <= BLUE_PURPLE) {
            return true;
        }
    }

    public void colorPrint() {
        switch (number) {
            case RED:
                System.out.println("red");
                break;
            case ORANGE:
                System.out.println("orange");
                break;
            case YELLOW:
                System.out.println("yellow");
                break;
            case GREEN:
                System.out.println("green");
                break;
            case LIGHT_BLUE:
                System.out.println("light blue");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            case PURPLE:
                System.out.println("purple");
                break;
            default:
                System.out.println("number doesn't found");
        }
    }

    public void mixedColorPrint() {
        switch (number) {
            case RED_ORANGE:
                System.out.println("red-orange");
                break;
            case ORANGE_YELLOW:
                System.out.println("orange-yellow");
                break;
            case YELLOW_GREEN:
                System.out.println("yellow-green");
                break;
            case GREEN_LIGHT_BLUE:
                System.out.println("green-blue");
                break;
            case LIGHT_BLUE_BLUE:
                System.out.println("light blue-blue");
                break;
            default:
                System.out.println("number doesn't found.");
        }
    }

    public static void color(int number) {
        if


    }

}
