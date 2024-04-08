package validarnumeros;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;

public class ValidacionDeNumero extends JFrame{

    JButton botonEnter;
    JTextField campoNum;
    JTextArea resultadoValidacion;
    private static final int numeroFinal = 0;
    private int num;

    public ValidacionDeNumero() {

        setBounds(600, 600, 500, 500);
        setLayout(new FlowLayout());
        setVisible(true);

        botonEnter = new JButton("Pulsame");
        campoNum = new JTextField(20);
        add(campoNum);

        resultadoValidacion = new JTextArea(2, 20);
        add(new JScrollPane(resultadoValidacion));

        botonEnter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String textoNum = campoNum.getText();
                    num = Integer.parseInt(textoNum);
                    IValido paroimpar = new IValido() {
                        @Override
                        public boolean numeroParOImpar() {
                            if (num % 2 == 0 && num!=0) {
                                resultadoValidacion.setText("El número es par");
                                return true;
                            } else if (num % 2 != 0) {
                                resultadoValidacion.setText("El número es impar");
                                return false;
                            } else if (num == numeroFinal) {

                                resultadoValidacion.setText(
                                        "Has acertado el numero final, cierra la ventana para cerrar el programa");
                                return true;
                            }
                            return rootPaneCheckingEnabled;

                        }
                    };
                    paroimpar.numeroParOImpar();

                } catch (NumberFormatException ex) {
                    resultadoValidacion.setText("Numero introducido incorrecto, vuelve a intentarlo");
                }

            }

        });

        add(botonEnter);

    }
}