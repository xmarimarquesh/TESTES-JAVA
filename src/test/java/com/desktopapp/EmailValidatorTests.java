package com.desktopapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EmailValidatorTests {

    @Test
    void validateInvalidEmails() {
        // Testa e-mails inválidos que não seguem as regras
        assertEquals(MyEmailValidator.validate(""), false); // vazio
        assertEquals(MyEmailValidator.validate("email.com"), false); // falta '@'
        assertEquals(MyEmailValidator.validate("@example.com"), false); // '@' no início
        assertEquals(MyEmailValidator.validate("example@.com"), false); // '.' logo após '@'
        assertEquals(MyEmailValidator.validate("example@com."), false); // '.' no final
        assertEquals(MyEmailValidator.validate("example@com"), false); // falta '.'
    }

    @Test
    void validateValidEmails() {
        // Testa e-mails válidos que seguem as regras
        assertEquals(MyEmailValidator.validate("user@example.com"), true);
        assertEquals(MyEmailValidator.validate("my.email@domain.org"), true);
        assertEquals(MyEmailValidator.validate("name.surname@company.co"), true);
        assertEquals(MyEmailValidator.validate("test.email+filter@domain.com"), true);
    }
}
