package it.molveno.restaurant.enums;

/**
 * WTF IS DIT ALLEMAAL?!
 */
public enum Animal {
    COW(900),
    SHEEP(80),
    HORSE(1500),
    CAT(5),
    DOG(10),
    LIZARD(1),
    DRAGON(5000),
    GOAT(30),
    PIG(60),
    SEAHORSE(1){
        @Override
        public Sex getNurturingParent() {
            return Sex.MALE;
        }
    };

    private double weight;

    private Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public Sex getNurturingParent() {
        return Sex.FEMALE;
    }
}

enum Sex {
    FEMALE, MALE
}