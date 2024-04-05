package temporizadormensajepersonalizadoeventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temporizador extends JFrame {

    int delay = 2000;
    int num_veces = 0;
    Timer tiempo;
    JTextArea miArea;
   
    

    public Temporizador() {
        setBounds(500,500,500,500);
        setVisible(true);
        miArea = new JTextArea(6, 20);
        add(new JScrollPane(miArea));
        tiempo = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                num_veces++;
                if (num_veces < 3) {
                    miArea.setText("No has llegado a las 3 veces");
                } else if (num_veces >= 3 && num_veces < 7) {
                    miArea.setText("No has llegado a las 7 veces");
                } else if (num_veces > 7 && num_veces < 10) {
                   miArea.setText("No has llegado a las 10 veces");
                } else if (num_veces == 10) {
                    miArea.setText("has llegado al limite");
                    tiempo.stop();
                }
            }
        });

        tiempo.start();
    }
}
