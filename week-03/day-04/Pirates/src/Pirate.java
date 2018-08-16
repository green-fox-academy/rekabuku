public class Pirate {
    String name;
    int lifeScore;
    String title;
    int age;
    int drunk;



    Pirate(String name, int lifeScore, String title, int age, int drunk) {
        this.name = name;
        this.lifeScore = lifeScore;
        this.title = title;
        this.age = age;
        this.drunk = drunk;

    }

    void fight() {
        this.lifeScore--;
    }

    void drink() {
        this.lifeScore--;
        this.drunk++;
    }

    boolean isAlive() {
        return this.lifeScore > 0;
    }

}
