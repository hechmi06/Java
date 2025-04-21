package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return family + " " + name + " " + age + " " + isMammal + " " + habitat;
    }

    // Méthode abstraite pour forcer la redéfinition dans les classes filles
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return age == aquatic.age &&
                name.equals(aquatic.name) &&
                habitat.equals(aquatic.habitat);
    }
}