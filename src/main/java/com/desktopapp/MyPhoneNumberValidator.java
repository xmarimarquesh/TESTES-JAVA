package com.desktopapp;

public class MyPhoneNumberValidator {

    // Método para validar se um número de telefone é válido
    public static boolean validate(String phoneNumber) {
        // Regras simples para um número de telefone válido:
        // - Deve ter apenas números ou os caracteres especiais '+' ou '-'
        // - Deve ter entre 10 e 15 caracteres
        // - Pode começar com um '+' para números internacionais
        // - Não deve conter letras
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }

        // Verifica se começa com '+' e remove para validação de números
        if (phoneNumber.charAt(0) == '+') {
            phoneNumber = phoneNumber.substring(1);
        }

        // Verifica comprimento permitido
        if (phoneNumber.length() < 10 || phoneNumber.length() > 15) {
            return false;
        }

        // Verifica se só tem números ou '-'
        for (char c : phoneNumber.toCharArray()) {
            if (!Character.isDigit(c) && c != '-') {
                return false;
            }
        }

        return true;
    }
}
