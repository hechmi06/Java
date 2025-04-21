package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    private String name;
    private String city;
    private final int NBR_CAGES = 25;
    private Aquatic[] aquaticAnimals = new Aquatic[10];

    public Zoo() {}

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println(aquatic.getName() + " a été ajouté au zoo.");
                return;
            }
        }
        System.out.println("Le tableau des animaux aquatiques est plein !");
    }

    public void displaySwim() {
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }

    public void setName(String name) {
        while (name.equals("")) {
            this.name = name;
        }
    }

    public void displayZoo() {
        System.out.println(name + " " + city + " " + NBR_CAGES);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }

    public String toString() {
        return name + " " + city + " " + NBR_CAGES;
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < NBR_CAGES; i++) {
            if (!isZooFull()) {
                if (animals[i] == null) {
                    if (searchAnimal(animal) == -1) {
                        animals[i] = animal;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < NBR_CAGES; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int pos = searchAnimal(animal);
        for (int i = 0; i < NBR_CAGES; i++) {
            if (i == pos) {
                animals[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        int cont = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                cont++;
            }
        }
        return cont == NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < z1.animals.length; i++) {
            if (z1.animals[i] != null) {
                count1++;
            }
        }
        for (int i = 0; i < z2.animals.length; i++) {
            if (z2.animals[i] != null) {
                count2++;
            }
        }
        if (count1 > count2) {
            return z1;
        } else if (count1 < count2) {
            return z2;
        } else {
            return null;
        }
    }
}