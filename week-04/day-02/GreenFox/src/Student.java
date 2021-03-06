import com.company.Person;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "The school of Life";
        this.skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + this.previousOrganization + " who skipped " +
                this.skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }

}
