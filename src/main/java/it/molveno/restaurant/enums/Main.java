package it.molveno.restaurant.enums;

public class Main {
    public static void main(String[] args) {
        Animal a = Animal.COW;
        System.out.println(a.getWeight());
        System.out.println(Animal.HORSE.getNurturingParent());
        System.out.println(Animal.SEAHORSE.getNurturingParent());

        switch(a){
            case SEAHORSE:
                System.out.println("OKE");
                break;
            case COW:
                System.out.println("NIET OKE");
                break;

        }
    }
}
