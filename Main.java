import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите высоту фигуры: ");
        int h = readValue();
        checkValue(h);

        System.out.print("Введите ширину фигуры: ");
        int w = readValue();
        checkValue(w);

        printFigure(h, w);

    }

    private static int readValue() {
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    private static void checkValue(int x) {
        if (x < 1) {
            System.out.println("Ошибка! Введите число больше единицы. ");
            System.exit(1);
        }
    }

    public static void printFigure(int h, int w) {
        for (int rep = h; rep >= 1; rep--) {
            System.out.println();
            for (int weight = w; weight >= 1;) {
                for (char ab = 'a'; ab <= 'b'; ab++) {
                    for (int i = 0; i < rep; i++) {
                        if (weight == 0) {
                            break;
                        }
                        System.out.print(ab);
                        weight--;
                    }
                }
            }
        }
    }
}



