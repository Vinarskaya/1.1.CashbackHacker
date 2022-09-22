package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateRemainIfLessThan1000() {
        int amount = 900;
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainIfMoreThan1000() {
        int amount = 1001;
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void calculateRemainIfEqual1000() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}