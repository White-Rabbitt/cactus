public class Main {

    public static void main(String[] args) {
        Vasya vasya = new Vasya();
        Cactus cactus = new Cactus();
        Sensor sensor = new Sensor();

        vasya.inputDate();
        vasya.season(vasya.getStartDate());
        sensor.humidity();
        if (!cactus.getWatered()) {
            cactus.pour(vasya.getSeason(), vasya.getStartDate(), sensor.getIsDry());
        }
    }
}
