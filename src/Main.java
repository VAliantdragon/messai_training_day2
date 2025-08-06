public class Main {

    public static void main(String[] args) {
//        Animal a=new Animal();
        bhalu bhalu = new bhalu("bhalu");

//        Animal b= new Animal("bhalu");
//        Human h=new Human("ramesh","suresh");

//        Human h=new Human();

//        b.eat();
//        b.makeNoise();
//        b.sleep();
//        b.roam();
//        h(h);o
//        bhalu.makeNoise();

//        Address address = new Address();
//        address.setBlock("lake side");
//        address.setNumber("8267237262");
//        address.setCity("bhopal");
//        Employee emp = new Employee(address, 20, "ramesh");
//        emp.setEmpCode(4567);
//        emp.setDesignation("employee");
//        emp.setSalary(33434);
//        emp.displayInfo();
//        System.out.println();
//
//        Student s = new Student(address, 20, "suresh");
//        s.setGrade("A");
//        s.setRoll_no(10);
//        s.displayInfo();
//        Student student=new Student()

        AnimalUtils animalUtils = new AnimalUtils();


        Animal myBhalu = new bhalu("Balu");
        animalUtils.addAnimal(myBhalu);

        // This will work correctly because the object is a Dog
        Animal myDog = new Dog("Buddy");
        animalUtils.addAnimal(myDog);

    }

    static void h(Human h) {
        System.out.println(h.toString());
    }
}