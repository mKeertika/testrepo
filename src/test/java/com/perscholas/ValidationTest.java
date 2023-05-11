package com.perscholas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {
    @Test
    void check_valid_user_name() {
                Boolean result= Validation.isValid("Keertika");
        Assertions.assertEquals(true, result);
    }

    @Test
    void false_test() {
        Boolean res = Validation.isValid("$34kjh");
        Assertions.assertEquals(false, res);
    }
}