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

        setBounds(500, 500, 500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        miArea = new JTextArea(6, 20);
        add(new JScrollPane(miArea));
        tiempo = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                num_veces++;
                if (num_veces < 3) {
                    miArea.append("Este mensaje ha salido " + num_veces + " veces\n");
                } else if (num_veces >= 3 && num_veces < 7) {
                    miArea.append("Este mensaje ha salido " + num_veces + " veces\n");
                } else if (num_veces >= 7 && num_veces < 10) {
                    miArea.append("Este mensaje ha salido " + num_veces + " veces\n");
                } else if (num_veces == 10) {
                    miArea.append("Vaya, parece que has llegado al límite, cierra la ventana para apagar el programa\n");
                    tiempo.stop();
                }
            }
        });

        tiempo.start();

    }
}
