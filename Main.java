
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roger
 */
public class Main {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nombre ");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese appellido ");
        String apellido = sc.nextLine();
        
        System.out.println("Ingrese su numero detelefono ");
        String telefono = sc.nextLine();
        
        System.out.println("Ingrese email ");
        String email = sc.nextLine();
        
        System.out.println("Ingrese su direccion: ");
        String direccion = sc.nextLine();
        
        System.out.println("-INFORMACIÓN DEL USUARIO-");
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Apellido del usuario: " + apellido);
        System.out.println("Numero Telefonico: " + telefono);
        System.out.println("Email:" + email);
        System.out.println("Dirección: " + direccion);
        
        suma();
        sc.close();        
       
    }
    
    public static void suma(){
        String i = "y";
        int total = 0;
        while(i.equals("y")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el primer numero: ");
            int var1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            int var2 = sc.nextInt();
            
            total = var1 + var2;
            System.out.println("El resultado de la suma es: " + total);
            System.out.println("Ingrese si desea continuar (y/n): ");
            i = sc.next();
        }
        System.out.println("Funcion de suma finalizada");
    }
}
