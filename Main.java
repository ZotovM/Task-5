import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту фигуры: ");
        int h = scanner.nextInt();

        if (h < 1) {
            System.out.println("Ошибка! Введите число больше единицы. ");
            System.exit(1);
        }
        
        System.out.print("Введите ширину фигуры: ");
        int w = scanner.nextInt();

        if (w < 1) {
            System.out.println("Ошибка! Введите число больше единицы. ");
            System.exit(1);
        }

        printFigure(h, w);

    }

    public static void printFigure( int h, int w) {
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++){
                if(i == 0 || j == 0) {
                    System.out.print("a");
                }
                else {
                    System.out.print("b");
                }
            }
            System.out.println();
        }
        System.exit(0);

    }
}