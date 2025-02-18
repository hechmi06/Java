package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal(){}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name ;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return family + " " + name + " " + age + " " + isMammal;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean isMammal(){
        return isMammal;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        while(age < 0){
            this.age = age;
        }
    }
    public void setMammal(boolean isMammal){
        this.isMammal = isMammal;
    }

}
