package com.desktopapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PhoneNumberValidatorTests {

    @Test
    void validateInvalidPhoneNumbers() {
        // Testa números de telefone que devem ser considerados inválidos
        assertEquals(MyPhoneNumberValidator.validate(""), false); // vazio
        assertEquals(MyPhoneNumberValidator.validate("12345"), false); // muito curto
        assertEquals(MyPhoneNumberValidator.validate("1234567890123456"), false); // muito longo
        assertEquals(MyPhoneNumberValidator.validate("phone12345"), false); // contém letras
        assertEquals(MyPhoneNumberValidator.validate("123-456-ABCD"), false); // contém letras
        assertEquals(MyPhoneNumberValidator.validate("+1234-5678-901@"), false); // contém caracteres especiais inválidos
    }

    @Test
    void validateValidPhoneNumbers() {
        // Testa números de telefone válidos
        assertEquals(MyPhoneNumberValidator.validate("1234567890"), true);
        assertEquals(MyPhoneNumberValidator.validate("987-654-3210"), true);
        assertEquals(MyPhoneNumberValidator.validate("+123456789012"), true); // Número internacional válido
        assertEquals(MyPhoneNumberValidator.validate("+12-3456-789012"), true); // Com traços
    }
}
