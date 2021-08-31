package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String apTo;
    private String apFrom;
    private int time;

    public int getId() {
        return id;
    }

    public String getApTo() {
        return apTo;
    }

    public String getApFrom() {
        return apFrom;
    }

    @Override
    public int compareTo(Ticket o) {
        return this.price - o.price;
    }
}

