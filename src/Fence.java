import java.util.InputMismatchException;
import java.util.Scanner;

public class Fence {

    public static void main(String[] args) {

        int threeLetter = 62;
        int space = 12;
        int length = (threeLetter * 5) + (space * 3);

        System.out.println("Введите длину забора в сантиметрах:");

        try {
            int fence = new Scanner(System.in).nextInt();
            if (length < fence) {
                System.out.println("Фраза помещается на заборе");
            } else {
                System.out.println("Фраза не помещается. Не хватает " + (length - fence) + "см");
            }
        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод");
        }
    }
}

