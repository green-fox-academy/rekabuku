public class Pirate {
    String name;
    int lifeScore;
    String title;
    int age;
    int drunk;
    int numberOfParrot;


    Pirate(String name, int lifeScore, String title, int age) {
        this.name = name;
        this.lifeScore = lifeScore;
        this.title = title;
        this.age = age;
    }

    void fight() {
        this.lifeScore--;
    }

    void drinkSomeRum(int numberOfShots) {
        for (int i = 0; i < numberOfShots; i++) {
            this.lifeScore--;
            this.drunk++;
        }
    }

    void howsItGoingMate(int numberOfShots) {
        this.drinkSomeRum(numberOfShots);
        if (this.drunk <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    void winParrot() {
        this.numberOfParrot++;
    }

    boolean isAlive() {
        return this.lifeScore > 0;
    }

}
