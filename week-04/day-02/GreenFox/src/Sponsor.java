import com.company.Person;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire() {
        this.hiredStudents++;
    }

}
