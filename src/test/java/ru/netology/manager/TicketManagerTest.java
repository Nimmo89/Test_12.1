package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.reposytory.TicketRepo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    private TicketRepo repo = new TicketRepo();
    private TicketManager manager = new TicketManager(repo);
    private Ticket t0 = new Ticket(10, 9000, "EB", "EP", 120);
    private Ticket t1 = new Ticket(1, 15000, "NW", "OM", 360);
    private Ticket t2 = new Ticket(2, 10000, "UH", "UA", 240);
    private Ticket t3 = new Ticket(3, 8000, "UR", "UMK", 90);
    private Ticket t4 = new Ticket(4, 11000, "UMK", "UW", 220);
    private Ticket t5 = new Ticket(5, 13000, "UMK", "UW", 150);
    private Ticket t6 = new Ticket(6, 15000, "RUS", "RUS", 240);
    private Ticket t7 = new Ticket(7, 17000, "RUS", "RUS", 720);
    private Ticket t8 = new Ticket(8, 16000, "RUS", "RUS", 130);
    private Ticket t9 = new Ticket(9, 14000, "RUS", "RUS", 190);

    @BeforeEach
    void setUP() {
//        manager.add(t0);
//        manager.add(t1);
//        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);
        manager.add(t7);
//        manager.add(t8);
        manager.add(t9);
    }

    @Test
    void findAll() {

        Ticket[] expected = new Ticket[]{t3, t4, t5, t6, t7, t9};
        Ticket[] actual = new Ticket[]{t7, t6, t9, t5, t4, t3};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}