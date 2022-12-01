/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocolas;

import java.util.Scanner;

/**
 *
 * @author tamar
 */
public class Menu {
    
    private FuncionCola varFuncionCola;
    private Nodo varNodo ;
    
    
     public void MostrarMenu() {

        this.varFuncionCola = new FuncionCola();
        this.varNodo = new Nodo();

        this.varFuncionCola.InsertarAutomaticamente(this.varFuncionCola.Cola1, this.varFuncionCola.Cola2, this.varFuncionCola.Cola3,
                this.varFuncionCola.Cola4);
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Elige una opcion");
            System.out.println("1-Agregar Cliente");
            System.out.println("2-Atender Cliente");
            System.out.println("3-Mostrar Cajeros");
            System.out.println("4-SALIR.");
            opcion = entrada.nextInt();



            switch (opcion) {
                
                case 1:
                    System.out.println("Estas agregando datos");
                    
                    this.varFuncionCola.IntroducirCliente(this.varFuncionCola.Cola1, this.varFuncionCola.Cola2, 
                            this.varFuncionCola.Cola3, this.varFuncionCola.Cola4, entrada);
                    break;
                case 2:
                    System.out.println("Se atendio al cliente correctamente");
                    
                    this.varFuncionCola.AtenderCajeros(this.varFuncionCola.Cola1, this.varFuncionCola.Cola2, 
                            this.varFuncionCola.Cola3, this.varFuncionCola.Cola4);
                    
                    break;
                case 3:
                    System.out.println("Estas viendo los cajeros");
                    
                    this.varFuncionCola.MostrarCajeros(this.varFuncionCola.Cola1, this.varFuncionCola.Cola2, 
                            this.varFuncionCola.Cola3, this.varFuncionCola.Cola4);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 4);
    }
}
