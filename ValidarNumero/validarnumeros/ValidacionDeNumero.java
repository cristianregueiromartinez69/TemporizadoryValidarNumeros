package validarnumeros;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ValidacionDeNumero {
    
    
   
    IValido valido = new IValido(){
        @Override
        public boolean numeroParOImpar(int num) {
            
            try{
               
                    if(num % 2 == 0){
                        System.out.println("El numero es par");
                        return true;
                    }
                    else if(num % 2 != 0){
                        System.out.println("El numero es impar");
                        
                    }   
                
            }catch(NumberFormatException e){
                System.out.println("Esto no es un numero, vuelve a intentarlo");
            }
            return true;
        }
        
        
    };
       
}