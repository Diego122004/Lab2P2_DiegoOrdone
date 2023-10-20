package lab2p2_diegoordonez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_DiegoOrdonez {

    static Scanner sc = new Scanner(System.in);
    static Scanner scs = new Scanner(System.in);
    static ArrayList<jugadores> jugador = new ArrayList();

    public static void main(String[] args) {

        int opcion = 0;
        do {
            System.out.println("1. Agregar Jugadores");
            System.out.println("2. Modificar Jugadores");
            System.out.println("3. Listar Jugadores");
            System.out.println("4. Eliminar Jugadores");
            System.out.println("5. Carros");
            System.out.println("6. Carros");
            System.out.println("7. Carros");
            System.out.println("8. Carros");
            System.out.println("9. Compra y venta");
            System.out.println("10.salir");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1: {
                    Agjugador();
                    break;
                }
                case 2: {
                    listjugadores();
                    
                    System.out.println("1. Mod nombre");
                    System.out.println("2. Mod Pr ");
                    System.out.println("3. Mod Money");
                    int op = sc.nextInt();
                    switch(op){
                    
                        case 1:{
                        break;
                        }
                        case 2:{
                        break;
                        }
                        case 3:{
                        break;
                        }
                        
                    
                    }
                }
                case 3: {
                    listjugadores();
                    
                    
                    break;
                }
                case 4: {
                    Elijugadores();
                    break;
                }
                case 5: {
                }
                case 6: {
                }
                case 7: {
                }
                case 8: {
                }
                case 9: {
                }
                case 10: {
                }

            }

        } while (opcion != 10);

    }

    public static void Agjugador() {
        System.out.println("Ingrese el nombre del usuario");
        String nom = scs.nextLine();
        System.out.println("Ingre sus puntos de reputacion");
        double pr = sc.nextInt();
        System.out.println("Ingrese su dinero en banco");
        double money = sc.nextInt();
        int can = 0;
        jugadores player = new jugadores(nom, can, pr, money);
        jugador.add(player);
    }

    public static void listjugadores() {
        if (jugador.isEmpty()) {
            System.out.println("El garaje esta vacio");
        } else {
            for (jugadores jugadores : jugador) {
                System.out.println(jugador);
            }
        }
    }

    public static void Elijugadores() {
        if (jugador.isEmpty()) {
            
        } else {
            System.out.println(jugador);
            int pos = sc.nextInt();
            jugador.remove(pos-1);
        }

    }
}
