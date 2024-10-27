package com.desktopapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AgeValidatorTests {

    @Test
    void validateUnderage() {
        // Testa datas de nascimento para pessoas menores de 18 anos
        assertEquals(MyAgeValidator.isAtLeast18YearsOld(LocalDate.now().minusYears(17)), false); // Exatamente 17 anos
        assertEquals(MyAgeValidator.isAtLeast18YearsOld(LocalDate.now().minusYears(17).minusDays(364)), false); // 17 anos e 364 dias
        assertEquals(MyAgeValidator.isAtLeast18YearsOld(LocalDate.now()), false); // Hoje (recém-nascido)
        assertEquals(MyAgeValidator.isAtLeast18YearsOld(LocalDate.now().minusYears(10)), false); // 10 anos
    }

    @Test
    void validateAdult() {
        // Testa datas de nascimento para pessoas de 18 anos ou mais
        assertEquals(MyAgeValidator.isAtLeast18YearsOld(LocalDate.now().minusYears(18)), true); // Exatamente 18 anos
        assertEquals(MyAgeValidator.isAtLeast18YearsOld(LocalDate.now().minusYears(19)), true); // 19 anos
        assertEquals(MyAgeValidator.isAtLeast18YearsOld(LocalDate.of(1990, 1, 1)), true); // Pessoa nascida em 1990
        assertEquals(MyAgeValidator.isAtLeast18YearsOld(LocalDate.now().minusYears(50)), true); // 50 anos
    }

    @Test
    void validateNullDate() {
        // Testa se a validação falha para uma data nula
        assertEquals(MyAgeValidator.isAtLeast18YearsOld(null), false);
    }
}