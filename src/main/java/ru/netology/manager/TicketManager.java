package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.reposytory.TicketRepo;

import java.util.Arrays;

public class TicketManager {
    private TicketRepo repository;

    public void add(Ticket ticket) {
        repository.save(ticket);
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (ticket.getApFrom().equalsIgnoreCase(from) && ticket.getApTo().equalsIgnoreCase(to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public TicketManager(TicketRepo repository) {
        this.repository = repository;
    }

}
