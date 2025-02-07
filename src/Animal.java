public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    Animal(){}
    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name ;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return family + " " + name + " " + age + " " + isMammal;
    }

}
