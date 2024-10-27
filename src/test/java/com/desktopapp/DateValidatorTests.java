package com.desktopapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateValidatorTests {

    @Test
    void validateInvalidDates() {
        // Testa datas que devem ser consideradas inválidas
        assertEquals(MyDateValidator.isValid(null), false); // Data nula
        assertEquals(MyDateValidator.isValid(LocalDate.of(2000, 1, 1)), false); // Data no passado
        assertEquals(MyDateValidator.isValid(LocalDate.now().minusDays(1)), false); // Ontem
    }

    @Test
    void validateValidDates() {
        // Testa datas que devem ser consideradas válidas
        assertEquals(MyDateValidator.isValid(LocalDate.now()), true); // Hoje
        assertEquals(MyDateValidator.isValid(LocalDate.now().plusDays(1)), true); // Amanhã
        assertEquals(MyDateValidator.isValid(LocalDate.of(2100, 12, 31)), true); // Data no futuro distante
    }
}
