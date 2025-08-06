public class AnimalUtils {
    public void addAnimal(Animal animal){
        System.out.println("animal added - "+animal.getName());
        animal.makeNoise();

        if(animal instanceof bhalu){
            bhalu bhalu = (bhalu)animal;
            bhalu.sleep();
        }
        else if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.play();
        }
    }
}
