public class Main {
    public static void main (String[] args) {
        Student John = new Student("John", 20, "male", "BME");
        Student JohnCloned = (Student) John.clone();
        JohnCloned.introduce();
    }
}
