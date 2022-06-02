/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerpunto;

import primerpunto.Persona;
import java.util.Scanner;

/**
 *
 * @author mono-
 */
public class gestionpersona {

    static Persona persona1 = new Persona("David", 19, 1.70);
    static Persona persona2 = new Persona("Laura", 20, 1.50);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1) Saludar ");
        System.out.println("2) Cambiar Nombre ");
        System.out.println("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                saludar();
                break;
            case 2:
                cambiarNombre();
                break;
        }
    }

    public static void saludar() {
        persona1.saludarPersona(persona1.getnombre());
        System.out.println(persona1.toString());
    }

    public static void cambiarNombre() {
        String nombreAnt = persona1.getnombre();
        System.out.println("Ingrese el nuevo nombre: ");   
        persona1.setNombre(sc.next());
        System.out.println("El nombre anterior era: " + nombreAnt);
        System.out.println("El nuevo nombre es : " + persona1.getnombre());
        System.out.println(persona1.toString());
    }

}
