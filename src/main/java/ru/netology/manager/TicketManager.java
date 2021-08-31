package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.reposytory.TicketRepo;

public class TicketManager {
    private TicketRepo repository;

    public void add(Ticket ticket) {
        repository.save(ticket);
    }

//    public boolean matches(Ticket ticket, String search) {
//        if (ticket instanceof Ticket) { // если в параметре ticket лежит объект класса Ticket
//            Ticket ticket = (Ticket) ticket; // положем его в переменную типа Ticket чтобы пользоваться методами класса Ticket
//            if (ticket.getApIn().contains(search) & ticket.getApOut().contains(search)) { // проверим есть ли поисковое слово в данных об аэропорте
//                return true;
//            }
//            if (ticket.getApOut().contains(search)) {
//                return true;
//            }
//            return false;
//        }
//        if (ticket instanceof Ticket) { // если в параметре product лежит объект класса Smartphone
//            Ticket ticket = (Ticket) product; // положем его в переменную типа Smartphone чтобы пользоваться методами класса Smartphone
//            if (ticket.getProducer().contains(search)) { // проверим есть ли поисковое слово в данных об производителе
//                return true;
//            }
//            if (ticket.getName().contains(search)) {
//                return true;
//            }
//            return false;
//        }
//        return false;
//    }

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
        return result;
    }

    public TicketManager(TicketRepo repository) {
        this.repository = repository;
    }

}
