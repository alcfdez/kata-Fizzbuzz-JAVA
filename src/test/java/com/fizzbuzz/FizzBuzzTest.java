package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    @Test
    public void test_fizzbuzz_example() {
        assertEquals(2, 2);
    }
    @Test
    public void test_fizzbuzz_with_number(){
        FizzBuzz myFizzBuzz = new FizzBuzz(52);

        String respuest = myFizzBuzz.TestFizzBuzz(myFizzBuzz.getTestNumber());

        assertEquals("Buzz", respuest);
    }

}
