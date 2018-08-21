public class Plant {
    private String type;
    private String color;
    private int minimalWater;
    private double waterStatus;
    private double waterAbsorption;

    public Plant(String type, String color, int minimalWater, double waterAbsorption) {
        this.type = type;
        this.color = color;
        this.minimalWater = minimalWater;
        this.waterAbsorption = waterAbsorption;
        this.waterStatus = 0;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getMinimalWater() {
        return minimalWater;
    }

    public double getWaterStatus() {
        return waterStatus;
    }

    public double getWaterAbsorption() {
        return waterAbsorption;
    }

    public void watering(double amount) {
        waterStatus += amount * waterAbsorption;
    }

    public boolean isThirsty() {
        if (waterStatus < minimalWater) {
            return true;
        } else {
            return false;
        }
    }

    public void printInfo() {
        if (isThirsty()) {
            System.out.println("The " + color + " " + type + " needs water");
        } else {
            System.out.println("The " + color + " " + type + " doesn't need water");
        }
    }

}
