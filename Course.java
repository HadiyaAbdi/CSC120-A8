
public class Course { //Used Copilot fix to help create this
    private String name;

    private String code;

    private String schedule;



    public Course(String name, String code, String schedule) {

        this.name = name;

        this.code = code;

        this.schedule = schedule;

    }

    @Override

    public String toString() {

        return this.name + " (" + this.code + ") - " + this.schedule;
    }

}
