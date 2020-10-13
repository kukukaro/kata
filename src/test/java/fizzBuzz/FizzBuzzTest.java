package fizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void isFizzReturnTrue() {
        assertEquals(true, FizzBuzz.isFizz(3));
    }

    @Test
    public void isFizzReturnFalse() {
        assertEquals(false, FizzBuzz.isFizz(1));
    }


    @Test
    public void isBuzzReturnTrue() {
        assertEquals(true, FizzBuzz.isBuzz(5));
    }

    @Test
    public void isBuzzReturnFalse() {
        assertEquals(false, FizzBuzz.isFizz(1));
    }



}