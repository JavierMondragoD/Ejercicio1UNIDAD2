
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class Ejercicio1UNIDAD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicio1UNIDAD2 objElElev = new Ejercicio1UNIDAD2();
        objElElev.bajarElElevador(50);
    }
    public void bajarElElevador(int pisos){
         if (pisos ==0){
             System.out.println("Has terminado de bajar los pisos ");
         }else{
             try {
                 Thread.sleep(400);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Ejercicio1UNIDAD2.class.getName()).log(Level.SEVERE, null, ex);
             }
             System.out.println("Bajando los pisos  " + pisos);
             bajarElElevador( pisos - 1);
   } 
 }
}
