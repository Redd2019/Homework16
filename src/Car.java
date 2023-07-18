public class Car extends Vehicles{

    public Car(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}