import java.util.Scanner;

/**
 * Ejemplo Satelite JavaDOC
 * @author Jorge
 * @version 23.9.2323
 */

public class Main {
    public static void main(String[] args) {

    /* Declaro los dos numeros como short */
        short num1;
        short num2;

    /* Creo un objeto de tipo scaner para poder añadir los numeros por teclado */
        Scanner obx1 = new Scanner(System.in);
        System.out.println("Teclee el primer numero");
        num1 = obx1.nextShort();
        Scanner obx2 = new Scanner(System.in);
        System.out.println("Teclee el segundo numero");
        num2 = obx2.nextShort();

        CondicionalCompuesto obx = new CondicionalCompuesto();
        obx.consultarNumero(num1, num2);
    }

}