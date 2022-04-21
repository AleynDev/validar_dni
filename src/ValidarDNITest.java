import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la clase ValidarDNI
 * @Author Aleyn
 */
class ValidarDNITest {

    @org.junit.jupiter.api.Test
    void extraerLetraDNI() {
        String value = "45555555F";
        char expected = 'F';
        char actual = ValidarDNI.extraerLetraDNI(value);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void extraerNumeroDNI() {
        String value = "45555555F";
        int expected = 45555555;
        int actual = ValidarDNI.extraerNumeroDNI(value);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calcularLetraDNI() {
        int value = 45555555;
        char expected = 'F';
        char actual = ValidarDNI.calcularLetraDNI(value);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void validarDNI_12346K() {
        String value = "12346K";
        boolean expected = false;
        boolean actual = ValidarDNI.validarDNI(value);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void validarDNI_123456789K() {
        String value = "123456789K";
        boolean expected = false;
        boolean actual = ValidarDNI.validarDNI(value);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void validarDNI_123U5678K() {
        String value = "123U5678K";
        boolean expected = false;
        boolean actual = ValidarDNI.validarDNI(value);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void validarDNI_12345678K() {
        String value = "12345678K";
        boolean expected = false;
        boolean actual = ValidarDNI.validarDNI(value);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void validarDNI_12345678Z() {
        String value = "12345678Z";
        boolean expected = false;
        boolean actual = ValidarDNI.validarDNI(value);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void validarDNI_44743525S() {
        String value = "44743525S";
        boolean expected = false;
        boolean actual = ValidarDNI.validarDNI(value);
        assertEquals(expected, actual);
    }

}