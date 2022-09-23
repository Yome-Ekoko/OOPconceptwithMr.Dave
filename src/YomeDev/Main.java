package YomeDev;

public class Main {
    public static void main(String[] args){
        Staff x = new Staff("yome","female",30, 27537763,Roles.TEACHER);
        Student y = new Student("musty","male",14,StudentClass.SS1, false);


        System.out.println(x.expelAStudent(x,y));

    }
}
