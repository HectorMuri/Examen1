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
public class Peliculas extends StreamingMenu {
    
 
    @Override
    public void Seleccion() {
        Scanner consola = new Scanner(System.in);
        int selec,com = 0, capInt = 0, caliInt, capFG = 0, caliFG, capGK = 0, caliGK;

        do {
            do {
                System.out.println("Ingrese la pelicula que desea ver:");
                System.out.println("1. Interstellar");
                System.out.println("2. Forest Gump");
                System.out.println("3. Godzilla vs King Kong");
                System.out.println("4. Salir");
                selec = consola.nextInt();

                if (selec >= 1 && selec <= 4) {
                    com = 1;
                } else {
                    
                    System.out.println("Opcion No Disponible, Vuelva a intentar");
                    
                }
            } while (com == 0);

            if (selec == 1) {
                ++capInt;
                System.out.println("Valoramos su opinion, califique la pelicula del 1 al 5: ");
                caliInt = consola.nextInt();
                while (caliInt > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliInt = consola.nextInt();
                }
                System.out.println("La calificacion de la pelicula: " + caliInt + " Pelicula vista: " + capInt);

            } else if (selec == 2) {
                ++capFG;
                System.out.println("Valoramos su opinion, califique la pelicula del 1 al 5: ");
                caliFG = consola.nextInt();
                while (caliFG > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliFG = consola.nextInt();
                }
                System.out.println("La calificacion de la pelicula: " + caliFG + " Pelicula vista: " + capFG);
              
            } else if (selec == 3) {
                ++capGK;
                System.out.println("Valoramos su opinion, califique la pelicula del 1 al 5: ");
                caliGK = consola.nextInt();
                while (caliGK > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliGK = consola.nextInt();
                }
                System.out.println("La calificacion de la pelicula: " + caliGK + " Pelicula vista: " + capGK);
                
            } else if (selec == 4) {
                
                System.out.println("Muchas Gracias por su preferencia");
                
                com = 2;
            }
        } while (com != 2);

        
    }

}
    
    

