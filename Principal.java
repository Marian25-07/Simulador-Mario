package com.mycompany.principal;
import java.util.Scanner;

public class Principal {

    static Personaje Mario;

    static void MarioAtaca() {
        int ataque = Mario.darPuno();
        System.out.println("Mario ataca con " + ataque + " de daño.");
        Mario.recibirGolpe(ataque);
        Mario.mostrarEstado();
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Mario = new Personaje("Mario", 100, 0.6, 30);

        char tecla = ' ';
        System.out.println("BIENVENIDO AL JUEGO DE MARIO BROS");
        
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("a. Mario ataca");
            System.out.println("d. Salir");
            tecla = lector.next().charAt(0);
            tecla = Character.toLowerCase(tecla);

            switch (tecla) {
                case 'a':
                    MarioAtaca();
                    break;
                case 'd':
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

            
            if (Mario.getVida() <= 0) {
                System.out.println("El juego terminó, Mario ha muerto.");
                tecla = 'd';
            }

        } while (tecla != 'd');
        
        lector.close();
    }
}
