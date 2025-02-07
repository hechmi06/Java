import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName ;

    public static void main(String[] args) {
        Zoo z = new Zoo("bouhech zoo" , "bomhal" , 20);
        Animal a = new Animal("siii" , "r9",20,true);
        Animal a1 = new Animal("a" , "r",20,true);
        Animal a2 = new Animal("p" , "9",20,true);
        Zoo z1 = new Zoo("zoo" , "mnihla" , 20);
        z.addAnimal(a);
        z1.addAnimal(a1);
        z1.addAnimal(a2);
        Zoo sup = new Zoo();
        z.displayZoo();
        if(z.isZooFull()) {
            System.out.println("Zoo Full");
        }
        else {
            System.out.println("Zoo Not Full");
        }
        sup= Zoo.comparerZoo(z,z1);

        System.out.println("**************************");
        System.out.println(sup);


    }
}
