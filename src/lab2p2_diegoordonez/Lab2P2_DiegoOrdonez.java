package lab2p2_diegoordonez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_DiegoOrdonez {

    static Scanner sc = new Scanner(System.in);
    static Scanner scs = new Scanner(System.in);
    static ArrayList<jugador> jugadores = new ArrayList();
    static ArrayList<Carro> cars = new ArrayList();

    public static void main(String[] args) {

        int opcion = 0;
        do {
            System.out.println("1. Agregar Jugadores");
            System.out.println("2. Modificar Jugadores");
            System.out.println("3. Listar Jugadores");
            System.out.println("4. Eliminar Jugadores");
            System.out.println("5. Agregar Carros");
            System.out.println("6. Tuniar");
            System.out.println("7. Listar Carros");
            System.out.println("8. Eliminar Carros");
            System.out.println("9. Compra y venta");
            System.out.println("10. salir");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1: {
                    Agjugador();
                    break;
                }
                case 2: {
                    listjugadores();
                    System.out.println("ingrese pos a mod");
                    int pos = sc.nextInt();

                    System.out.println("1. Mod nombre");
                    System.out.println("2. Mod Pr ");
                    System.out.println("3. Mod Money");
                    System.out.println("Ingrese att a mod");

                    int op = sc.nextInt();
                    switch (op) {

                        case 1: {
                            String nam2;
                            System.out.println("Ingrese nombre ");
                            nam2 = scs.nextLine();
                            jugadores.get(pos).setNombre(nam2);

                            break;
                        }
                        case 2: {

                            System.out.println("Ingrese el numero de puntos de reputacion");
                            int pr2 = sc.nextInt();
                            jugadores.get(pos).setPR(pr2);
                            break;
                        }
                        case 3: {
                            System.out.println("Ingrese cantidad de dinero ");
                            int money2 = sc.nextInt();
                            jugadores.get(pos).setDinero(money2);
                            break;
                        }

                    }
                    System.out.println("Se ha modificado exitosamente!");
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
                    Agcarro();
                }
                case 6: {
                    liscarjug();
                    System.out.println("Ingrese car a mod");
                    int pos2 = sc.nextInt();
                    
                    System.out.println("1. mod marca");
                    System.out.println("2. mod model");
                    System.out.println("3. color");
                    System.out.println("4. mod precio");
                    int op2 = sc.nextInt();
                    switch(op2){
                    
                        case 1:{
                            String marca2 ;
                            System.out.println("Ingrese marca");
                            marca2= scs.nextLine();
                            cars.get(op2).setMarca(marca2);
                        }
                        case 2:{
                            String mode2;
                            System.out.println("Ingrese model");
                            mode2 = scs.nextLine();
                            cars.get(op2).setModelo(mode2);
                        }
                        case 3:{
                        }
                        case 4:{
                            int precio2;
                            System.out.println("INgrese precio");
                            precio2 = sc.nextInt();
                            cars.get(op2).setPrecio(precio2);
                        }
                        
                    }

                }
                case 7: {
                    listcar();
                }
                case 8: {
                    Elicarro();
                }
                case 9: {
                    listjugadores();
                    System.out.println("Seleccione su jugador");
                    int posi = sc.nextInt();
                    jugador player = jugadores.get(posi);

                    System.out.println("1. Comprar");
                    System.out.println("2. Vender");
                    int op = sc.nextInt();
                    switch (op) {

                        case 1: {
                            listcar();
                            System.out.println("Seleccione el carro que desea");
                            int pos = sc.nextInt();
                            Carro car = cars.get(pos);
                            player.getDinero();
                            car.getPrecio();
                            if (player.getDinero() < car.getPrecio()) {
                                System.out.println("El dinero es insuficiente");
                            } else {
                                player.getCarcan().add(car);
                                cars.remove(car);
                            }

                            break;
                        }
                        case 2: {
                            liscarjug();
                            System.out.println("Seleccione el carro que desea vender");
                            

                            break;
                        }
                    }

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
        jugador player = new jugador(nom, can, pr, money);
        jugadores.add(player);
    }

    public static void Agcarro() {
        System.out.println("Ingrese la marca del carro");
        String marca = scs.nextLine();
        System.out.println("Ingrese el modelo del carro");
        String model = scs.nextLine();
        System.out.println("Ingrese el color del carro");
        Color color = JColorChooser.showDialog(null, "Escoja el color", Color.yellow);
        System.out.println("Ingrese el precio del carro");
        double price = sc.nextInt();
        System.out.println("1.Reconstruido, 2. Agencia");
        int type = sc.nextInt();

        cars.add(new Carro(marca, model, color, price, type));
    }

    public static void listjugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("El garaje esta vacio");
        } else {
            int cont = 0;
            for (jugador jugadores : jugadores) {
                System.out.println(cont + ") " + jugadores.toString());
                cont++;
            }
        }
    }

    public static void listcar() {
        if (cars.isEmpty()) {
            System.out.println("El consecionario esta vacio");
        } else {
            int cont = 0;
            for (Carro Carro : cars) {
                System.out.println(cont + ") " + cars.toString());
                cont++;
            }
        }
    }

    public static void liscarjug() {
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getClass().getSimpleName().equals("double")) {
                System.out.println(
                        jugadores.indexOf(jugadores.get(i)) + "-" + jugadores.get(i)
                );

            }
        }
    }

    public static void Elijugadores() {
        if (jugadores.isEmpty()) {

        } else {
            System.out.println(jugadores);
            int pos = sc.nextInt();
            jugadores.remove(pos - 1);
        }

    }

    public static void Elicarro() {
        if (cars.isEmpty()) {

        } else {
            System.out.println(cars);
            int pos = sc.nextInt();
            cars.remove(pos - 1);
        }
    }
}
