package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    private String name;
    private String city;
    private final int NBR_CAGES = 25;

    public Zoo(){}
    public Zoo(String name,String city){
        this.name = name ;
        this.city = city ;
        this.animals = new Animal[NBR_CAGES];
    }
    public void setName(String name){
        while(name.equals("")){
            this.name = name ;
        }
    }
    public void displayZoo(){
        System.out.println(name + " " + city + " " + NBR_CAGES);
        for(int i = 0; i < animals.length; i++){
            if (animals[i] != null){
                System.out.println(animals[i]);
            }
        }
    }
    public String toString(){
        return name + " " + city + " " + NBR_CAGES;

    }
    public boolean addAnimal(Animal animal){
        for (int i=0 ; i< NBR_CAGES ; i++) {
            if (isZooFull()==false) {
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
    public int searchAnimal(Animal animal){
        for (int i=0 ; i<NBR_CAGES ; i++){
            if(animals[i]!=null && animals[i].getName().equals(animal.getName())){
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int pos = searchAnimal(animal);
        for (int i=0 ; i<NBR_CAGES ; i++){
            if(i==pos){
                animals[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull(){
        int cont = 0;
        for(int i=0;i<animals.length;i++){
            if(animals[i]!=null){
                cont++;
            }
        }
        if(cont == NBR_CAGES){
            return true;
        }
        return false;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        int count1=0;
        int count2=0;
        for(int i=0;i<z1.animals.length;i++){
            if(z1.animals[i]!=null){
                count1++;
            }
        }
        for(int i=0;i<z2.animals.length;i++){
            if(z2.animals[i]!=null){
                count2++;
            }
        }
        if(count1>count2){
            return z1;
        }
        else if(count1<count2){
            return z2;
        }
        else{
            return null;
        }
    }
}
