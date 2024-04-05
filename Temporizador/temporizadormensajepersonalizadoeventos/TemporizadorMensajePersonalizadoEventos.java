package temporizadormensajepersonalizadoeventos;

import javax.swing.JFrame;

public class TemporizadorMensajePersonalizadoEventos {

    public static void main(String[] args) {

       Temporizador mitiempo = new Temporizador();
      mitiempo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       try {
            Thread.sleep(25000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
                
        
    
    }

}
