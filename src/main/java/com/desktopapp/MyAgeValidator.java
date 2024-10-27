package com.desktopapp;

import java.time.LocalDate;
import java.time.Period;

public class MyAgeValidator {

    // Método para validar se a pessoa tem pelo menos 18 anos
    public static boolean isAtLeast18YearsOld(LocalDate birthDate) {
        // Se a data de nascimento for nula, a validação falha
        if (birthDate == null) {
            return false;
        }

        // Calcula a idade da pessoa com base na data de nascimento
        Period age = Period.between(birthDate, LocalDate.now());

        // Retorna verdadeiro se a idade for igual ou maior que 18 anos
        return age.getYears() >= 18;
    }
}
