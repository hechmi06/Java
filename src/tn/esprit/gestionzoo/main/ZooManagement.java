package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo z = new Zoo("Bouhech Zoo", "Bomhal");
        Zoo z1 = new Zoo("Zoo Mnihla", "Mnihla");
        Aquatic aqua1 = new Aquatic("Siii", "R9", 20, true,"sokra");
        Dolphin d = new Dolphin("Siii", "R9", 20, true,"sokra",150);
        Penguin p = new Penguin("Siii", "R9", 20, true,"sokra",50);
        Terrestrial ters = new Terrestrial("A", "R", 20, true,4);
        Animal a = new Animal("Siii", "R9", 20, true);
        Animal a1 = new Animal("A", "R", 20, true);
        Animal a2 = new Animal("P", "9", 20, true);

        z.addAnimal(a);
        z1.addAnimal(a1);
        z1.addAnimal(a2);

        z.displayZoo();

        if (z.isZooFull()) {
            System.out.println("Zoo Full");
        } else {
            System.out.println("Zoo Not Full");
        }

        Zoo sup = Zoo.comparerZoo(z, z1);
        System.out.println("**************************");
        System.out.println("Zoo with more animals: " + sup);
        System.out.println("************************** Aquatic ");
        System.out.println(aqua1);
        System.out.println(d);
        System.out.println(p);
        System.out.println(ters);
        System.out.println("************************** Swim part ");
        aqua1.swim();
        d.swim();
        p.swim();
    }


}
