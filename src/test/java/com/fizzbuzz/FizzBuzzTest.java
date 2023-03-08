package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    @Test
    public void test_fizz_return_divisble_3() {
        FizzBuzz myfizzBuzz = new FizzBuzz(1);
        myfizzBuzz.setNumber(12);
        assertEquals("fizz",myfizzBuzz.fizz());

    }

    @Test
    public void test_buzz_return_divisible_5() {
        FizzBuzz myfizzBuzz = new FizzBuzz(1);
        myfizzBuzz.setNumber(10);
        assertEquals("buzz",myfizzBuzz.buzz() null);
    }

    @Test
    public void test_fizzbuzz_return_divisible_3_and_5() {
        FizzBuzz myFizzBuzz = new FizzBuzz(1);
        myFizzBuzz.setNumber(30);
        assertEquals("fizzbuzz", myFizzBuzz.fizzbuzz());

    }
}
