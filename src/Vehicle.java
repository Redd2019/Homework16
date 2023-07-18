public abstract class Vehicles {
    private final int wheelsCount;
    private final String modelName;

    public Vehicles(int wheelsCount, String modelName) {
        this.wheelsCount = wheelsCount;
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
}