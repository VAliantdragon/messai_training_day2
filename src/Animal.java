import javax.xml.transform.Source;

public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

//    public Animal(){
//        System.out.println("unparameterized animal");
//    }

    public Animal(String name){
        this.name=name;
//        System.out.println(name);
    }
    public  void eat(){
        System.out.println(name+" cat is eating");
    }

    public  void makeNoise(){
        System.out.println(name+" cat is making noise");
    }

    public  void sleep(){
        System.out.println(name+" cat is sleeping");
    }

    public  void roam(){
        System.out.println(name+" cat is roaming");
    }

    public void hybrid(){

    }

}
