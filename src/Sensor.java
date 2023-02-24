import java.util.Random;

public class Sensor {

    private boolean isDry;

    public void humidity() {
        int random = new Random().nextInt(1, 100);
        if (random < 30) {
            isDry = true;
        } else {
            isDry = false;
        }
    }

    public boolean getIsDry() {
        return isDry;
    }
}
