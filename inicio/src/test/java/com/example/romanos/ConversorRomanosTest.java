package com.example.romanos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConversorRomanosTest {

    @Test
    public void deve_converter_o_simbolo_I() {
        // Arrange
        String simbolo = "I";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(1, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_V() {
        // Arrange
        String simbolo = "V";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(5, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_M() {
        // Arrange
        String simbolo = "M";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(1000, valorConvertido);

    }

    @Test
    public void deve_converter_o_simbolo_II() {
        // Arrange
        String simbolo = "II";

        // Act
        ConversorRomanos conversor = new ConversorRomanos();
        int valorConvertido = conversor.converter(simbolo);

        // Assert
        Assertions.assertEquals(2, valorConvertido);
    }

     @Test
     public void deve_converter_o_simbolo_IV() {
         // Arrange
         String simbolo = "IV";

         // Act
         ConversorRomanos conversor = new ConversorRomanos();
         int valorConvertido = conversor.converter(simbolo);

         // Assert
         Assertions.assertEquals(4, valorConvertido);
     }
}
