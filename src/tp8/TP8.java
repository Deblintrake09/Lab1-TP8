/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

/**
 *
 * @author jackd
 */
public class TP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Materia ingles =new Materia(1,"Ingles",1);
        Materia mates =new Materia(2,"Matemáticas",1);
        Materia lab1 =new Materia(3, "Laboratorio 1",1);
        
        Alumno a1= new Alumno(1001, "López", "Martín");
        Alumno a2= new Alumno(1002, "Martínez", "Brenda");
        
        a1.agregarMateria(ingles);
        a1.agregarMateria(mates);
        a1.agregarMateria(lab1);
        System.out.println(a1.getApellido()+" está inscripto en "+a1.cantidadMaterias()+ " materias");
        
        a2.agregarMateria(ingles);
        a2.agregarMateria(mates);
        a2.agregarMateria(lab1);
        a2.agregarMateria(lab1);
        System.out.println(a2.getApellido()+" está inscripto en "+a1.cantidadMaterias()+ " materias");
    }
    
}
