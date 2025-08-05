public class Person {
//    public Person() {
//        this.name=name;
//        this.age=age;
//        this.adress=adress;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public Person(Address adress,int age,String name){
        this.adress=adress;
        this.name=name;
        this.age=age;
    }

    private String name;
    private int age;
    private Address adress;

//    public void displayInfo(){
//        System.out.println(name +" is the name");
//        System.out.println(age +" is the age");
//        System.out.println(adress.toString() +" is the adress");
//
//    }



}
