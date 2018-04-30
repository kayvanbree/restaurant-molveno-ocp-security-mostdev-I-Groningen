package it.molveno.restaurant.enums;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Beer {

    private BeerSize size;

    public Beer(BeerSize size){
        this.size = size;
    }

    public static void main(String[] args) {
        Beer beer = new Beer(BeerSize.BIG);
        Beer beer2 = new Beer(BeerSize.HUMONGOUS);
        System.out.println(beer.getSize());
        System.out.println(beer2.getSize());
    }

    public BeerSize getSize() {
        return this.size;
    }

    enum BeerSize {
        SMALL(250),
        MEDIUM(500),
        BIG(750),
        HUMONGOUS(1000);

        private double cc;

        BeerSize(double cl) {
            this.cc = cl;
        }

        public double getCl() {
            return this.cc;
        }

        @Override
        public String toString() {
            return super.toString() + " (" + this.cc + " cc)";
        }
    }
}

/**
 * Zo kun je zorgen dat een enum als string opgeslagen wordt in de database
 */
@Entity
class BeerDrinker {
    @Enumerated(EnumType.STRING)
    private Beer.BeerSize beerSize;
}