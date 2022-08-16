/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streamingapp;

/**
 *
 * @author m_mur
 */
import java.util.Scanner;

/**
 *
 * @author m_mur
 */
public class LOG extends StreamingMenu {

    Scanner entrada = new Scanner(System.in);

    public boolean login() {
        Login login = new Login("admin", "1234");
        System.out.println("Porfavor ingrese su user");
        String username = entrada.nextLine();
        System.out.println("Porfavor ingrese su contrasena");
        String password = entrada.nextLine();

        if (username.equals(login.getUsername()) && password.equals(login.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public void stapp() {

        LOG log = new LOG();

        if (log.login()) {
            System.out.println("Acceso correcto");
            log.Seleccion();
        } else {
            System.out.println("Datos incorrectos, ingrese denuevo");
            log.stapp();
        }

    }

    @Override
    public void Seleccion() {
        int seleccionar, comodin = 0;

        System.out.println("Bienvenido, Estos son los generos disponibles a stremear: ");
        genero = entrada.nextLine();

        do {
            do {
                System.out.println("Selecciona tu genero de opcion favorita:");
                System.out.println("    1. Series");
                System.out.println("    2. Peliculas");
                System.out.println("    3. Extras");
                System.out.println("    4. Salir del Sistema.");
                seleccionar = entrada.nextInt();

                if (seleccionar >= 1 && seleccionar <= 4) {
                    comodin = 1;
                } else {
                    System.out.println("No Disponible, Seleccione denuevo");
                }
            } while (comodin == 0);

            switch (seleccionar) {
                case 1:
                    {
                        StreamingMenu SR = new Series();
                        SR.Seleccion();
                        break;
                    }
                case 2:
                    {
                        StreamingMenu SR = new Peliculas();
                        SR.Seleccion();
                        break;
                    }
                case 3:
                    {
                        StreamingMenu SR = new Extras();
                        SR.Seleccion();
                        break;
                    }
                case 4:
                    System.out.println("Muchas Gracias por su preferencia");
                    comodin = 2;
                    break;
                default:
                    break;
            }

    }
    while (comodin != 2);    
    
    }
}
