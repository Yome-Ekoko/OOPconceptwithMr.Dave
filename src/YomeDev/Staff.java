package YomeDev;

public class Staff extends Personnel{

    private long id;
    private Roles role;

    public Staff(String name, String sex, int age, long id, Roles role) {
        super(name, sex, age);
        this.id = id;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean teachACourse(Staff staff){
        if (staff.getRole().equals(Roles.TEACHER)) {
            return true;
        }
        else {
            return false;

        }
    }
    public String expelAStudent(Staff staff, Student student){
        if (staff.getRole().equals(Roles.PRINCIPAL) && student.getGoodBehaviour().equals(false)) {
            return "you have been expelled";
        }
        else if (!staff.getRole().equals(Roles.PRINCIPAL)){
            return "access denied";
        }
        else {
            return "";
        }
    }
    public String admitApplicant(Staff staff, Applicant applicant){
        if(staff.getRole().equals(Roles.PRINCIPAL) && applicant.getAge()>=11 && applicant.getAge() <=16){
            return "congratulations you have been admitted";
        }
        else if (!staff.getRole().equals(Roles.PRINCIPAL)){
            return "Access denied!!";
        }
        else{
            return "sorry application denied due to age";
        }
    }

}
