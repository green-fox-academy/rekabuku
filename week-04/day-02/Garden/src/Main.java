public class Main {

    public static void main(String[] args) {
        Garden garden1 = new Garden("myGraden");
        Flower flower1 = new Flower("yellow");
        Flower flower2 = new Flower("blue");
        Tree tree1 = new Tree("orange");
        Tree tree2 = new Tree("purple");

        garden1.addPlant(flower1);
        garden1.addPlant(flower2);
        garden1.addPlant(tree1);
        garden1.addPlant(tree2);

        garden1.printInfo();
        garden1.giveWater(40);
        garden1.printInfo();
        garden1.giveWater(70);
        garden1.printInfo();
    }
}
