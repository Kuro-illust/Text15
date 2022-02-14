package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Nested
    class getColor {
        @Test
        void success() {
            assertEquals("Ô", Sample.getColor(1));
            assertEquals("•", Sample.getColor(2));
            assertEquals("Â", Sample.getColor(3));
        }

        @Test
        @DisplayName("ˆø”ƒGƒ‰[")
        void fail() {
        	Throwable exception = assertThrows(
        			IllegalArgumentException.class,
                    () -> Sample.getColor(99));
        }
        	/*
        }
            try {
                Sample.getColor(99);
                fail();
            } catch (IllegalArgumentException e) {
            }
        }
        */
    }
}