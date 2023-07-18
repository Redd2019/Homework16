public class Car extends Vehicle{

    public Car(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}