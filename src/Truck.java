package Transport;

public class Truck extends Transport implements Compating {
    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Грузовик %s %s начинает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Грузовик %s %s заканчивает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовик %s %s на пит-стопе",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время грузовика %s %s - 9 минут 10 секунд",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость грузовик %s %s - 110 км/ч",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }
}