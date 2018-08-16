import java.util.Random;

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

    void fight(int hits) {
        for (int i = 0; i < hits; i++) {
            this.lifeScore--;
        }
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

    void die() {
        this.drinkSomeRum(this.drunk);
        for (int i = 0; i < this.drunk; i++) {
        }
        System.out.println("he's dead");
    }

    void brawl(Pirate enemy) {
        Random rand = new Random();
        int random = rand.nextInt(20);
        if (this.lifeScore > 0 && enemy.lifeScore > 0) {
            System.out.println("Fight!");
        }
        if (drunk > 30) {
            System.out.println("You are too drunk to fight");
        } else {
            fight(random);
            enemy.fight(random);
        }
    }

    void winParrot() {
        this.numberOfParrot++;
    }

    boolean isAlive() {
        return this.lifeScore > 0;
    }

}
