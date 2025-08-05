public class Employee extends Person{
    public Employee(Address adress, int age, String name) {
        super(adress, age, name);
    }

    private int empCode;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    private String designation;
    private float salary;

    public void applyforleave(){
        System.out.println("you applied for leave");
    }

    public void displayInfo(){
        System.out.println("you- "+empCode+" applied for leave | designation : "+designation+" | salary : "+salary);
        System.out.println(getName() +" : is the name");
        System.out.println(getAge() +" : is the age");
        System.out.println(getAdress().toString() +" : is the adress");
    }

}
