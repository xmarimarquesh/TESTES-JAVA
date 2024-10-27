package com.desktopapp;

import java.time.LocalDate;

public class MyDateValidator {

    // Método para validar se uma data é válida
    public static boolean isValid(LocalDate date) {
        // Regras de validação:
        // - A data não pode ser nula
        // - A data deve estar no futuro ou no presente (não pode estar no passado)
        if (date == null) {
            return false;
        }

        // Verifica se a data é hoje ou no futuro
        return !date.isBefore(LocalDate.now());
    }
}
