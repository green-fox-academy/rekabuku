public class Main {
    public static void main(String[] args) {

        Pirate pirate1 = new Pirate("Jack", 50, "captain", 32);
        Pirate pirate2 = new Pirate("John", 50, "sailor", 33);
        Pirate pirate3 = new Pirate("Jim", 50, "sailor", 34);
        Pirate pirate4 = new Pirate("Joe", 50, "sailor", 35);
        Pirate pirate5 = new Pirate("Phil", 50, "sailor", 36);
        Pirate pirate6 = new Pirate("Larry", 50, "sailor", 37);
        Pirate pirate7 = new Pirate("Bob", 50, "sailor", 25);
        Pirate pirate8 = new Pirate("Mickey", 50, "sailor", 26);
        Pirate pirate9 = new Pirate("Mike", 50, "sailor", 27);
        Pirate pirate10 = new Pirate("Sam", 50, "sailor", 28);

        pirate1.drinkSomeRum(31);
        System.out.println(pirate1.drunk);
        pirate1.brawl(pirate2);


    }
}
