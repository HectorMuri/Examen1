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
public class Series extends StreamingMenu{
    
  
    
    @Override
    public void Seleccion(){
        Scanner consola = new Scanner(System.in);
        int selec, capWanda = 0, caliWanda, com = 0, capMarvel = 0, caliMarvel, capLoki = 0, caliLoki;

        do {
            do {
                System.out.println("Ingrese la serie que desea ver:");
                System.out.println("1. WandaVision");
                System.out.println("2. Loki");
                System.out.println("3. MsMarvel");
                System.out.println("4. Salir");
                selec = consola.nextInt();

                if (selec >= 1 && selec <= 4) {
                    com = 1;
                } else {
                    
                    System.out.println("Opcion No Disponible, Vuelva a intentar");
                    
                }
            } while (com == 0);

            if (selec == 1) {
                ++capWanda;
                System.out.println("Valoramos su opinion, califique la serie del 1 al 5: ");
                caliWanda = consola.nextInt();
                while (caliWanda > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliWanda = consola.nextInt();
                }
                System.out.println("La calificacion del episodio: " + caliWanda + " Capitulo visto: " + capWanda);

            } else if (selec == 2) {
                ++capMarvel;
                System.out.println("Valoramos su opinion, califique la serie del 1 al 5: ");
                caliMarvel = consola.nextInt();
                while (caliMarvel > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliMarvel = consola.nextInt();
                }
                System.out.println("La calificacion del episodio: " + caliMarvel + " Capitulo visto: " + capMarvel);
              
            } else if (selec == 3) {
                ++capLoki;
                System.out.println("Por favor califique la serie del 1 al 5: ");
                caliLoki = consola.nextInt();
                while (caliLoki > 5) {
                    System.out.println("Solo numeros del 1 al 5");
                    caliLoki = consola.nextInt();
                }
                System.out.println("La calificacion del episodio: " + caliLoki + " Capitulo visto: " + capLoki);
                
            } else if (selec == 4) {

                System.out.println("Gracias por su preferencia");
                
                com = 2;
            }
        } while (com != 2);

        
    }

}
        
  
    

