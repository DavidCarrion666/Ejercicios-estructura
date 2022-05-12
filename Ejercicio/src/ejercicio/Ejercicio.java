/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // integrantes 
        // Jeremy Jaramillo
        // Pablo Costa
        // David Carrión 

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        try {

            File file = new File("C:\\Users\\SALA A\\Desktop\\Actividad\\"
                    + "Practica1.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado:" + file.getName());

            } else {
                System.out.println("El archivo ya existe");
            }

        } catch (IOException e) {
            System.out.println("Error.");
        }
        try ( FileWriter myWriter = new FileWriter("C:\\Users\\SALA A\\Desktop"
                + "\\Actividad\\"
                + "Practica1.txt", true)) {

            String a = "Cual es el nombre del usuario\n";
            String b = "Escriba el apellido del usuario\n";
            String c = "Escriba donde vive el usuario\n";
            String d = "Escriba un hobby del usuario\n";
            String e = "Escriba su animal favorito\n";

            System.out.println(a);
            String nombre = entrada.nextLine();
            myWriter.write(a);
            myWriter.write(nombre + "\n");
            System.out.println(b);
            String apellidos = entrada.nextLine();
            myWriter.write(b);
            myWriter.write(apellidos+ "\n");
            System.out.println(c);
            String direccion = entrada.nextLine();
            myWriter.write(c);
            myWriter.write(direccion+ "\n");
            System.out.println(d);
            String hobby = entrada.nextLine();
            myWriter.write(d);
            myWriter.write(hobby+ "\n");
            System.out.println(e);
            String animal = entrada.nextLine();
            myWriter.write(e);
            myWriter.write(animal+ "\n");

            myWriter.close();
            System.out.println("EL archivo ha sido escrito.");
           

        } catch (IOException e) {
            System.out.println("Error de escritura.");
//e.printStackTrack();
        }
        System.out.println("Leemos el archivo:");
        try ( FileReader myReader = new FileReader("C:\\Users\\SALA A\\Desktop"
                + "\\Actividad\\Practica1.txt")) {
            File file = new File("C:\\Users\\SALA A\\Desktop\\Actividad\\"
                    + "Practica1.txt");
            int i;
            while ((i = myReader.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("La longitud del texto es: " + file.length());
        } catch (IOException e) {
            System.out.println("error de lectura.");

        }
    }

}
