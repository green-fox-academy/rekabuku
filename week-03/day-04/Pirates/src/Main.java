public class Main {
    public static void main(String[] args) {

        Pirate pirate1 = new Pirate("Jack", 100, "captain", 32, 0);
        Pirate pirate2 = new Pirate("John", 100, "sailor", 33, 0);
        Pirate pirate3 = new Pirate("Jim", 100, "sailor", 34,0);
        Pirate pirate4 = new Pirate("Joe", 100, "sailor", 35,0);
        Pirate pirate5 = new Pirate("Phil", 100, "sailor", 36,0);
        Pirate pirate6 = new Pirate("Larry", 100, "sailor", 37,0);
        Pirate pirate7 = new Pirate("Bob", 100, "sailor", 25,0);
        Pirate pirate8 = new Pirate("Mickey", 100, "sailor", 26,0);
        Pirate pirate9 = new Pirate("Mike", 100, "sailor", 27,0);
        Pirate pirate10 = new Pirate("Sam", 100, "sailor", 28,0);

        pirate1.drink();
        System.out.println(pirate1.lifeScore);
    }
}
