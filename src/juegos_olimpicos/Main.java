/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos_olimpicos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Velasquez y Nicolas David Velasquez Fuentes
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Delegacion> paisCompe = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int decision = -1;
        while (decision != 0) {
            System.out.println("Menu: (Ingrese el número de la opción)\n"
                    + "1. Ingresar una nueva delegación.\n"
                    + "2. Consultar Delegación.\n"
                    + "3. Cambiar la cantidad de medallas de una delegación.\n"
                    + "4. Identificar la delegación con más medallas\n"
                    + "0. Salir del Programa.");

            ArrayList<Delegacion> delegacions = new ArrayList<>();
            decision = sc.nextInt();

            switch (decision) {
                case 1:

                    System.out.println("Ingrese Nombre del pais: ");
                    String pais = sc.next();
                    Delegacion delegacion = new Delegacion(pais, 0, 0, 0);
                    for (int i = 0; i < 2; i++) {

                        System.out.print("Ingrese el Grupo #" + (i + 1) + ": \nNombre del Grupo: ");
                        String nombreGrupo = sc.next();
                        Grupo grupo = new Grupo(nombreGrupo);
                        int salir = 0;
                        System.out.println("Ingrese Deportistas:");
                        int temp = 0;

                        String salida = "";
                        
                        while (temp <= 10) {

 
                            if (salida.toLowerCase().equals("salir") && temp >= 2) {
                                break;
                            } else {
                                System.out.print("Digita el nombre: ");
                                String nombre = sc.next();
                                System.out.print("Digita el Apellido: ");
                                String apellido = sc.next();
                                Deportista deportista = new Deportista(nombre, apellido);
                                grupo.anadirDeportista(deportista);
                                temp = temp + 1;

                            }
                            System.out.println("Para continuar con el siguiente grupo escriba 'Salir' si no 'Continuar'");
                            salida = sc.next();

                        }
                        delegacion.anadirGrupo(grupo);
                        paisCompe.add(delegacion);
                    }

                    break;

                case 2:
                    System.out.println("Ingrese el nombre del deporte:");
                    String deporteBuscar = sc.next();
                    for (Delegacion delegacion2 : paisCompe) {
                        delegacion2.buscarDeporte(deporteBuscar);
                    }
                    break;
                case 3:
                    
                    System.out.println("Tipo de Medalla a cambiar:\n"
                            + "1. Medallas de Oro"
                            + "2. Medallas de Plata"
                            + "3. Medallas de Bronce");
                    int tipoMedalla = sc.nextInt();
                    switch (tipoMedalla) {
                        case 1:

                            break;

                        default:
                            break;
                    }
                    break;

                case 4:
                    System.out.println("La delegacióin con mas medallas es: " + maxMedallas(paisCompe));
                    break;

                default:
                    break;
            }
        }
        sc.close();

    }

    private static String maxMedallas(ArrayList<Delegacion> delegacions) {
        int max = 0;
        String delegacion = "";
        for (int i = 0; i < delegacions.size(); i++) {
            int tmp = delegacions.get(i).getMedallasbronce()
                    + delegacions.get(i).getMedallasoro()
                    + delegacions.get(i).getMedallasplata();
            if (tmp > max) {
                max = tmp;
                delegacion = delegacions.get(i).getPais() + " con"
                        + delegacions.get(i).getMedallasoro() + "Medallas de Oro, "
                        + delegacions.get(i).getMedallasplata() + "Medallas de Plata, "
                        + delegacions.get(i).getMedallasbronce() + "Medallas de Bronce";
            }
        }
        return delegacion;
    }

    private static void CambioMedalla(int tipoMedalla, int numeroMedalla, String pais) {
       
    }
}