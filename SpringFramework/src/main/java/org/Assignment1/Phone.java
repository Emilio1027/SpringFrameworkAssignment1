package org.Assignment1;

public class Phone {

    private String mob;

    public Phone() {
    }

    public Phone(String s) {
    }


    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}

