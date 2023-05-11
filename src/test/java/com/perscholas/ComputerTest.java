package com.perscholas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputerTest {
    @Test
    void add_method_should_return_added_value_given_two_int_number() {
        Computer computer = new Computer();
        int result = computer.add(4, 5);
        Assertions.assertEquals(9, result);
    }

    @Test
    void multiply_of_two_int() {
        Computer computer = new Computer();
        int result = computer.multiply(4, 5);
        Assertions.assertEquals(20, result);

    }

    @Test
    void subtraction_of_two_int() {
        Computer computer = new Computer();
        int res = computer.subtraction(4,5);
        Assertions.assertEquals(-1, res);
    }
}