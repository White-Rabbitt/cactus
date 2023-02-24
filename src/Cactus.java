import java.util.Date;

public class Cactus {

    private boolean watered;

    public void pour(String season, Date startDate, boolean isDry) {
        String result;
        if (season == "весна-осень") {
            if (startDate.getDate() > 15) {
                startDate.setMonth(startDate.getMonth() + 1);
                startDate.setDate(14 - (30 - startDate.getDate()));
                result = (startDate.getYear() + "-" + (startDate.getMonth()) + "-" + (startDate.getDate()));
            } else {
                result = (startDate.getYear() + "-" + (startDate.getMonth()) + "-" + (startDate.getDate() + 14));
            }
            System.out.println("Дата следующего полива: " + result);
        }
        else if (season == "зима") {
            result = (startDate.getYear() + "-" + (startDate.getMonth() + 1) + "-" + startDate.getDate());
            System.out.println("Дата следующего полива: " + result);
        } else {
            if (season == "лето" && isDry && !watered) {
                System.out.println("Сегодня нужно полить кактус!");
                watered = true;
            } else {
                System.out.println("Сегодня поливать не нужно");
                watered = false;
            }
        }
    }

    public boolean getWatered() {
        return watered;
    }
}
