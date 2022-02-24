/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author Sergio
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo Java");
        System.out.println("\n");
        
        //Primer objeto persona
        Persona per1 = new Persona();
        per1.setNombre("Sergio ZSM ");
        System.out.println("Nombre: " + per1.getNombre() );
        per1.comer("Hamburguesa Hawaiana");
        System.out.println("\n");
        
        //Segundo objeto persona
        Persona per2 = new Persona();
        per2.setNombre("Felipe ");
        System.out.println("Nombre: " + per2.getNombre() );
        per2.comer("Pizza Hawaiana");
        System.out.println("\n");
        
        //Primer objeto automovil
        Automovil miBocho=new Automovil();
        System.out.println("El automovi es un: Bocho");
        miBocho.setMarca("VW");
        System.out.println("Marca " + miBocho.getMarca());
        miBocho.setSubMarca("Sedan");
        System.out.println("SubMarca " + miBocho.getSubMarca());
        miBocho.setModelo(1970);
        System.out.println("Modelo " + miBocho.getModelo());
        miBocho.setColor(Color.blue);
        System.out.println("Color " + miBocho.getColor());
        System.out.println("\n");
        
        //Segundo objeto automovil
        Automovil miMustang=new Automovil();
        System.out.println("El automovi es un: Mustang");
        miMustang.setMarca("Ford");
        System.out.println("Marca " + miMustang.getMarca());
        miMustang.setSubMarca("Mustan");
        System.out.println("SubMarca " + miMustang.getSubMarca());
        miMustang.setModelo(2010);
        System.out.println("Modelo " + miMustang.getModelo());
        miMustang.setColor(Color.yellow);
        System.out.println("Color " + miMustang.getColor());
        System.out.println("\n");
        
        //Tercer objeto automovil
        Automovil miAkura=new Automovil();
        System.out.println("El automovi es un: Acura");
        miAkura.setMarca("Honda");
        System.out.println("Marca " + miAkura.getMarca());
        miAkura.setSubMarca("ILX");
        System.out.println("SubMarca " + miAkura.getSubMarca());
        miAkura.setModelo(2013);
        System.out.println("Modelo " + miAkura.getModelo());
        miAkura.setColor(Color.gray);
        System.out.println("Color " + miAkura.getColor());
    }
    
}
