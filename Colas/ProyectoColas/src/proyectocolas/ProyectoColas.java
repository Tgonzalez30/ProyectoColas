/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocolas;

import javax.swing.JOptionPane;

/**
 *
 * @author tamar
 */
public class ProyectoColas {

    /**
     * @param args the command line arguments
     */
    
   public static void main(String[] args) {
       
        Menu varMenu;
        varMenu = new Menu();

      /* FuncionCola varFuncionCola;
       varFuncionCola = new FuncionCola();
      
       varFuncionCola.InsertarAutomaticamente(Cola1, Cola2, Cola3, Cola4);
      */
        varMenu.MostrarMenu();

 
        //finalizar app
        System.exit(0);
    }
       
}
