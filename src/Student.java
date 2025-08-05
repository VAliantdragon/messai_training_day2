public class Student extends Person{
    public Student(Address adress, int age, String name) {
        super(adress, age, name);
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private int roll_no;
    private String grade;

    public void displayInfo(){
        System.out.println("you "+getName()+" | address : "+getAdress()+" | age : "+getAge()+" | rollno : "+roll_no+" | grade : "+grade);
    }


}
