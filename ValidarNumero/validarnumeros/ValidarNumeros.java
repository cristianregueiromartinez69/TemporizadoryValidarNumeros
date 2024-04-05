package validarnumeros;

import java.util.Scanner;
import javax.swing.*;

public class ValidarNumeros {

    static final int numeroFinal = 0;

    public static void main(String[] args) {

        System.out.println("Introduce un número");
        Scanner sc = new Scanner(System.in);
        ValidacionDeNumero v = new ValidacionDeNumero();
        int num = sc.nextInt();
        while (num != numeroFinal) {
            System.out.println("Introduce un número");
            
                    num = sc.nextInt();
            v.valido.numeroParOImpar(num);
        }

    }

}
