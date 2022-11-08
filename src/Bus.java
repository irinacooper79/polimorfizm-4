package Transport;

public class Bus extends Transport implements Compating {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Автобус %s %s начинает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Автобус %s %s заканчивает движение",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s на пит-стопе",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void bestLapTime() {
        System.out.printf("Лучшее время автобуса %s %s - 10 минут 11 секунд",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость автобуса %s %s - 90 км/ч",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }
}