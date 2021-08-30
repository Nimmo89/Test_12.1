package ru.netology.reposytory;

import ru.netology.domain.Ticket;

public class TicketRepo {
    private Ticket[] tickets = new Ticket[0];

    public void save(Ticket item) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = item;
        tickets = tmp;
    }

    public Ticket[] findAll() {
        return tickets;
    }

//    public Ticket[] findById(int id) {
//        for (Ticket item : tickets) {
//            if (item.getId() == id) {
//                return new Ticket[]{item};
//            }
//        }
//        return null;
//    }

    public void removeById(int id) {
//        if (findById(id) == null){
//            throw new NotFoundException("Element with id: " + id + " not found");
//        } else {
            int length = tickets.length - 1;
            Ticket[] tmp = new Ticket[length];
            int index = 0;
            for (Ticket item : tickets) {
                if (item.getId() != id) {
                    tmp[index] = item;
                    index++;
                }
            }
        tickets = tmp;
        }
//    }

    public TicketRepo() {
    }
}
