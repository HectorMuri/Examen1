/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamingapp;

import java.util.Scanner;

/**
 *
 * @author m_mur
 */
public class Extras extends StreamingMenu{


    @Override
    public void Seleccion() {
        Scanner consola = new Scanner(System.in);
        int selec,com = 0, capMarvel = 0, caliMarvel, capDisco = 0, caliDisco, capAP = 0, caliAP;

        do {
            do {
                System.out.println("Ingrese el Extra que desea ver:");
                System.out.println("1. MarvelBackstage");
                System.out.println("2. Discovery");
                System.out.println("3. AnimalPlanet");
                System.out.println("4. Salir");
                selec = consola.nextInt();

                if (selec >= 1 && selec <= 4) {
                    com = 1;
                } else {
                    
                    System.out.println("Opcion No Disponible, Vuelva a intentar");
                    
                }
            } while (com == 0);

            if (selec == 1) {
                ++capMarvel;
                System.out.println("Valoramos su opinion, califique la serie del 1 al 5: ");
                caliMarvel = consola.nextInt();
                while (caliMarvel > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliMarvel = consola.nextInt();
                }
                System.out.println("La calificacion del episodio: " + caliMarvel + " Capitulo visto: " + capMarvel);

            } else if (selec == 2) {
                ++capDisco;
                System.out.println("Valoramos su opinion, califique la serie del 1 al 5: ");
                caliDisco = consola.nextInt();
                while (caliDisco > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliDisco = consola.nextInt();
                }
                System.out.println("La calificacion del episodio: " + caliDisco + " Capitulo visto: " + capDisco);
              
            } else if (selec == 3) {
                ++capAP;
                System.out.println("Valoramos su opinion, califique la serie del 1 al 5: ");
                caliAP = consola.nextInt();
                while (caliAP > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliAP = consola.nextInt();
                }
                System.out.println("La calificacion del episodio: " + caliAP + " Capitulo visto: " + capAP);
                
            } else if (selec == 4) {
                
                System.out.println("Muchas Gracias por su preferencia");
                
                com = 2;
            }
        } while (com != 2);

        
    }
}
  
    

