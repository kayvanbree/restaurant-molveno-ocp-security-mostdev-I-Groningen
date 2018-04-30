package it.molveno.restaurant.innerclasses;

public class Table {
    private TableLeg[] legs = new TableLeg[4];

    private String woodType;
    private double price;

    public Table(int legs) {
        for (int i = 0; i < legs; i++) {
            this.legs[i] = new TableLeg(70);
        }
    }

    public void doSomething() {
        for (int i = 0; i < this.legs.length; i++) {
            legs[i].walk();
        }
    }

    private class TableLeg {
        // Length in cm
        int length;

        public TableLeg(int length) {
            this.length = length;
        }

        public void walk() {
            Table.this.price++;
            System.out.println("Something!");
        }
    }
}
