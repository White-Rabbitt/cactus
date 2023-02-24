import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vasya {
    private String season;
    private Date startDate;

    public void inputDate() {
        try {
            System.out.println("Введите дату последнего полива в формате ГГГГ/ММ/ДД:");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите год:");
            int year = scanner.nextInt();
            System.out.println("Введите месяц:");
            int month = scanner.nextInt();
            System.out.println("Введите день:");
            int day = scanner.nextInt();
            startDate = new Date(year, month, day);

        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод");
            System.exit(0);
        }
    }

    public Date getStartDate() {
        return startDate;
    }

    public String season(Date startDate) {
        if (startDate.getMonth() == 3 ||
                startDate.getMonth() == 4 ||
                startDate.getMonth() == 5 ||
                startDate.getMonth() == 9 ||
                startDate.getMonth() == 10 ||
                startDate.getMonth() == 11) {
            season = "весна-осень";
        } else if (startDate.getMonth() == 6 || startDate.getMonth() == 7 || startDate.getMonth() == 8) {
            season = "лето";
        } else {
            season = "зима";
        }
        return season;
    }

    public String getSeason() {
        return season;
    }
}
