package com.perscholas;
import org.junit.jupiter.api.*;

class ComputerTest {

     private Computer computer;
    @BeforeEach
    void beforeEach() {
        computer = new Computer();
        System.out.println("This is before each method");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("This is before all method");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("This is after all method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("This is after each method");
    }

    @Test
    @DisplayName("adding integer method")
    void add_method_should_return_added_value_given_two_int_number() {
        Computer computer = new Computer();
        int result = computer.add(4, 5);
        Assertions.assertEquals(9, result);
    }

    @Test
    @Disabled
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