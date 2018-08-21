import java.util.ArrayList;
import java.util.List;

public class Garden {
    private String name;
    private List<Plant> plants;

    public Garden(String name) {
        this.name = name;
        this.plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        this.plants.add(plant);
    }

    public void printInfo() {
        for (Plant plant : plants) {
            plant.printInfo();
        }
        System.out.println();
    }

    public void giveWater(double amountOfWater) {
        int numOfThirstyPlant = thirstyPlants();
        double portionOfWater = amountOfWater / numOfThirstyPlant;
        for (Plant plant : plants) {
            if (plant.isThirsty()) {
                plant.watering(portionOfWater);
            }
        }
    }

    private int thirstyPlants() {
        int numOfThirstyPlant = 0;
        for (Plant plant : plants) {
            if (plant.isThirsty()) {
                numOfThirstyPlant++;
            }
        }
        return numOfThirstyPlant;
    }

}
