import javax.swing.*;

public class ValidarDNI {

    static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    static char extraerLetraDNI(String DNI) {
        return DNI.charAt(DNI.length() - 1);
    }

    static int extraerNumeroDNI(String DNI) {
        return Integer.parseInt(DNI.substring(0, DNI.length() - 1));  // cambiar el -5 por -1
    }

    static char calcularLetraDNI(int numerosDNI) {
        return LETRAS_DNI.charAt(numerosDNI % 23);
    }

    static boolean validarDNI(String DNI) {
        boolean check = false; // cree una variable boolean para quitar todos los return
        if (DNI.length() == 9) // cambiar != por ==
            check = true;
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(DNI.charAt(i)))
                check = false;
        }
        if (!Character.isLetter(DNI.charAt(8)))
            check = false;
        char letra = Character.toUpperCase(extraerLetraDNI(DNI));
        int numero = extraerNumeroDNI(DNI);
        if (calcularLetraDNI(numero) != letra) // cambie la comparacion, para comprarar la letra
            check = false;
                                // quite el else
        return check;  // retorno el valor de la variable
    }

    public static void main(String[] args) {
        String DNI = JOptionPane.showInputDialog(null, "Inserte el DNI a validar:");
        boolean valido = validarDNI(DNI);
        if (valido) // quite la comparación, pues no es necesaria
            JOptionPane.showMessageDialog(null, "El DNI indicado es válido");
        else
            JOptionPane.showMessageDialog(null, "El DNI indicado no es válido");
    }
}