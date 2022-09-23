package YomeDev;

public class Student extends Personnel {

    private StudentClass studentClass;
    private Boolean goodBehaviour = true;


    public Student(String name, String sex, int age, StudentClass studentClass, Boolean goodBehaviour) {
        super(name, sex, age);
        this.studentClass = studentClass;
        this.goodBehaviour = goodBehaviour;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public Boolean getGoodBehaviour() {
        return goodBehaviour;
    }

    public void setGoodBehaviour(Boolean goodBehaviour) {
        this.goodBehaviour = goodBehaviour;
    }
}
