package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTestAPI {

    @Test
    public void calculateRemainIfLessThan1000() {
        int amount = 900;
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainIfMoreThan1000() {
        int amount = 1001;
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateRemainIfEqual1000() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
