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

    void drinkSomeRum(int numberOfShots){
        for (int i = 0; i <numberOfShots ; i++) {
            this.lifeScore--;
            this.drunk++;
        }
    }

    void winParrot (){
        this.numberOfParrot++;
    }

    boolean isAlive() {
        return this.lifeScore > 0;
    }

}
