package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        // Création des zoos
        Zoo z = new Zoo("Bouhech Zoo", "Bomhal");
        Zoo z1 = new Zoo("Zoo Mnihla", "Mnihla");
        Zoo zoo = new Zoo("Océanarium", "Marseille");

        // Création des animaux
        Aquatic aqua1 = new Aquatic("Siii", "R9", 20, true, "sokra");
        Dolphin d = new Dolphin("Siii", "R9", 20, true, "sokra", 150);
        Penguin p = new Penguin("Siii", "R9", 20, true, "sokra", 50);
        Terrestrial ters = new Terrestrial("A", "R", 20, true, 4);

        Animal a = new Animal("Siii", "R9", 20, true);
        Animal a1 = new Animal("A", "R", 20, true);
        Animal a2 = new Animal("P", "9", 20, true);

        Aquatic dauphin = new Aquatic("Dauphin", "Eau salée");
        Aquatic requin = new Aquatic("Requin", "Eau salée");

        // Ajout des animaux aux zoos
        z.addAnimal(a);
        z1.addAnimal(a1);
        z1.addAnimal(a2);

        // Ajout des animaux aquatiques
        zoo.addAquaticAnimal(dauphin);
        zoo.addAquaticAnimal(requin);

        // Affichage des zoos
        System.out.println("\n************** Affichage du Zoo **************");
        z.displayZoo();
        z1.displayZoo();
        zoo.displayZoo();

        // Vérification si le zoo est plein
        System.out.println("\n************** Vérification du Zoo **************");
        if (z.isZooFull()) {
            System.out.println("Le zoo " + z.getName() + " est plein.");
        } else {
            System.out.println("Le zoo " + z.getName() + " n'est pas plein.");
        }

        // Comparaison des zoos
        System.out.println("\n************** Comparaison des Zoos **************");
        Zoo sup = Zoo.comparerZoo(z, z1);
        if (sup != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + sup);
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }

        // Affichage des animaux aquatiques et terrestres
        System.out.println("\n************** Animaux Aquatiques et Terrestres **************");
        System.out.println(aqua1);
        System.out.println(d);
        System.out.println(p);
        System.out.println(ters);

        // Test de la méthode swim()
        System.out.println("\n************** Test de nage des animaux aquatiques **************");
        aqua1.swim();
        d.swim();
        p.swim();
    }
}
