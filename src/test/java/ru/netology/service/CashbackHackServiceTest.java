package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashbackHackServiceTest {
    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected, "Actual amount not equals expected");
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected, "Actual amount not equals expected");
    }
}