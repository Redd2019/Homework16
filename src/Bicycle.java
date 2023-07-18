public class Bicycle extends Vehicles{

    public Bicycle(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}