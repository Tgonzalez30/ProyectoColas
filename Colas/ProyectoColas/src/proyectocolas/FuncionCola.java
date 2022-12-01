/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocolas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author tamar
 */
public class FuncionCola {
   
    Queue<String> Cola1 = new LinkedList();
    Queue<String> Cola2 = new LinkedList();
    Queue<String> Cola3 = new LinkedList();
    Queue<String> Cola4 = new LinkedList();
     
   public void InsertarAutomaticamente(Queue<String> Cola1, Queue<String> Cola2, Queue<String> Cola3, Queue<String> Cola4) {
        Cola1.add("1");
        Cola1.add("2");
        Cola1.add("3");
        
        Cola2.add("4");
        Cola2.add("5");
        Cola2.add("6");
        Cola2.add("7");
        
        Cola3.add("8");
    }

    public void IntroducirCliente(Queue<String> Cola1, Queue<String> Cola2, Queue<String> Cola3, Queue<String> Cola4,Scanner entrada) {

       
        
        System.out.println("Ingrese el dato");

        
        if (Cola1.size() < Cola2.size()&&Cola1.size() < Cola3.size()&&Cola1.size() < Cola4.size()) {
            Cola1.add(entrada.next());
        } else {
            if (Cola2.size() < Cola1.size()&&Cola2.size() < Cola3.size()&&Cola2.size() < Cola4.size()) {
                Cola2.add(entrada.next());
            } else {
                if (Cola3.size() < Cola1.size()&&Cola3.size() < Cola2.size()&&Cola3.size() < Cola4.size()) {
                    Cola3.add(entrada.next());
                } else {
                    if (Cola4.size() < Cola1.size()&&Cola4.size() < Cola2.size()&&Cola4.size() < Cola3.size()) {
                        Cola4.add(entrada.next());
                    } else {
                        if (Cola1.size() == Cola2.size()) {
                            Cola1.add(entrada.next());
                        } else {
                            if (Cola1.size() == Cola3.size()) {
                                Cola1.add(entrada.next());
                            } else {
                                if (Cola1.size() == Cola4.size()) {
                                    Cola1.add(entrada.next());
                                } else {
                                    if (Cola2.size() == Cola3.size()) {
                                        Cola2.add(entrada.next());
                                    } else {
                                        if (Cola2.size() == Cola4.size()) {
                                            Cola2.add(entrada.next());
                                        } else {
                                            if (Cola3.size() == Cola4.size()) {
                                                Cola3.add(entrada.next());
                                            }else{
                                                Cola4.add(entrada.next());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

   /* public void reversequeue(Queue<String> Cola1)
    {
        Stack<String> stack = new Stack<>();
        while (!Cola1.isEmpty()) {
            stack.add(Cola1.peek());
            Cola1.remove();
        }
        while (!stack.isEmpty()) {
            Cola1.add(stack.peek());
            stack.pop();
        }
    }
    */
    public void MostrarCajeros(Queue<String> Cola1, Queue<String> Cola2, Queue<String> Cola3, Queue<String> Cola4) {

        /*
        reversequeue(Cola1);
        System.out.println("Cajero 1 : " + Cola1);
        
        
       /* System.out.println("Cajero 1 : ");
        for (String item : Cola1) {
            System.out.print(item + " ");
        }
        
        Collections.reverse((List<?>) Cola1);
        System.out.println("Cajero 1 : "+ Cola1);
        Collections.reverse((List<?>) Cola2);
        System.out.println("Cajero 2 : "+ Cola2);
        Collections.reverse((List<?>) Cola3);
        System.out.println("Cajero 3 : "+ Cola3);
        Collections.reverse((List<?>) Cola4);
        System.out.println("Cajero 4 : "+ Cola4);
       */ 
        System.out.println("Cajero 1 : ");
        for (String s : Cola1) {
            System.out.println(s);
        }
        System.out.println("Cajero 2 : ");
        for (String s : Cola2) {
            System.out.println(s);
        }
        System.out.println("Cajero 3 : ");
        for (String s : Cola3) {
            System.out.println(s);
        }
        System.out.println("Cajero 4 : ");
        for (String s : Cola4) {
            System.out.println(s);
        }

       /* System.out.println("Cajero 1 : " + Cola1);
        System.out.println("Cajero 2 : " + Cola2);
        System.out.println("Cajero 3 : " + Cola3);
        System.out.println("Cajero 4 : " + Cola4);
*/    
}
    
    public void AtenderCajeros(Queue<String> Cola1, Queue<String> Cola2, Queue<String> Cola3, Queue<String> Cola4) {

        if (Cola1.size() > Cola2.size() && Cola1.size() > Cola3.size() && Cola1.size() > Cola4.size()) {
            System.out.println("Se atendio el elemento : " + Cola1.remove());
        } else {
            if (Cola2.size() > Cola1.size() && Cola2.size() > Cola3.size() && Cola2.size() > Cola4.size()) {
                System.out.println("Se atendio el elemento : " + Cola2.remove());
            } else {
                if (Cola3.size() > Cola1.size() && Cola3.size() > Cola2.size() && Cola3.size() > Cola4.size()) {
                    System.out.println("Se atendio el elemento : " + Cola3.remove());
                } else {
                    if (Cola4.size() > Cola1.size() && Cola4.size() > Cola2.size() && Cola4.size() > Cola3.size()) {
                        System.out.println("Se atendio el elemento : " + Cola4.remove());
                    } else {
                        if (Cola1.size() == Cola2.size()) {
                            System.out.println("El Cajero 1 y Cajero 2 tienen la misma cantidad, "
                                    + "por lo que se atendio al cliente del Cajero 1: " + Cola1.remove());
                        } else {
                            if (Cola1.size() == Cola3.size()) {
                                System.out.println("El Cajero 1 y Cajero 3 tienen la misma cantidad, "
                                        + "por lo que se atendio al cliente del Cajero 1: " + Cola1.remove());
                            } else {
                                if (Cola1.size() == Cola4.size()) {
                                    System.out.println("El Cajero 1 y Cajero 4 tienen la misma cantidad, "
                                            + "por lo que se atendio al cliente del Cajero 1: " + Cola1.remove());
                                } else {
                                    if (Cola2.size() == Cola3.size()) {
                                        System.out.println("El Cajero 2 y Cajero 3 tienen la misma cantidad, "
                                                + "por lo que se atendio al cliente del Cajero 2: " + Cola2.remove());
                                    } else {
                                        if (Cola2.size() == Cola4.size()) {
                                            System.out.println("El Cajero 2 y Cajero 4 tienen la misma cantidad, "
                                                    + "por lo que se atendio al cliente del Cajero 2: " + Cola2.remove());
                                        } else {
                                            if (Cola3.size() == Cola4.size()) {
                                                System.out.println("El Cajero 3 y Cajero 4 tienen la misma cantidad, "
                                                        + "por lo que se atendio al cliente del Cajero 3: " + Cola3.remove());
                                            } else {
                                                System.out.println("Se eliminó el elemento : " + Cola4.remove());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}//cierre class