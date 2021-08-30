package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String apIn;
    private String apOut;
    private int time;

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Ticket o) {
        return this.price - o.price;
    }
}

