import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите высоту фигуры: ");
        int h = readNum();
        checkNum(h);

        System.out.print("Введите ширину фигуры: ");
        int w = readNum();
        checkNum(w);

        printFigure(h, w);

    }

    private static int readNum() {
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    private static void checkNum(int x) {
        if (x < 1) {
            System.out.println("Ошибка! Введите число больше единицы. ");
            System.exit(1);
        }
    }

    public static void printFigure(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 1; j <= w; j++) {
                System.out.print("ab");

            }

            System.out.println();
        }
        System.exit(0);
    }

}
