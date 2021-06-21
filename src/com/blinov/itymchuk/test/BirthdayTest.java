package com.blinov.itymchuk.test;


import com.blinov.itymchuk.three.Birthday;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BirthdayTest {
    private final Birthday bd = new Birthday();
//    Birthday bd2 = new Birthday(29, 12, 1985);

    @ParameterizedTest
    @MethodSource("listBirthday")
    void testBirthday(String expected, int day, int month, int year){
        bd.setBirthday(day, month, year);
        assertEquals(expected, bd.toString());
    }

    static Stream<Arguments> listBirthday(){
        return Stream.of(
               arguments("29-12-1985", 29, 12, 1985),
                arguments("21-10-1991", 21, 10, 1991),
                arguments("0-0-0", 27, 15, 1985),
                arguments("29-2-2000", 29, 2, 2000),
                arguments("0-0-0", 29, 2, 2100),
                arguments("0-0-0", 69, 96, 2100)
        );
    }

}
