/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tar;

import java.util.Scanner;

/**
 *
 * @author Nis
 */
public class Tar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner tec = new Scanner(System.in);
        int opc;
        
        System.out.println("Ingrese cantidad de clases =  ");
        opc = tec.nextInt();
        
        
            
        
         ing a [] = new ing [opc];
         
         tec.nextLine();
        
        for(int y = 1; y <= a.length ; y++){
            
            /*if(y == 1){
                 System.out.print("ingrese nombre del alumno =  ");
                 String name = tec.nextLine();
                 a[0].setalumn(name);
                 
                  System.out.print("ingrese grado =    ");
                 int grado = tec.nextInt();
                 a[0].setgrado(grado);
                 
                 
            }*/
            
            System.out.print("Ingrese clase" + y + "=  ");
            String clase = tec.nextLine();
            
            //tec.nextLine();
            
            
            
            System.out.println();
            
            System.out.print("Ingrese nota " + clase + "= ");
            int nota = tec.nextInt();
           
           
            
            
             System.out.println();
             
             tec.nextLine();
             
             a[y] = new ing(clase, nota);
             
        }
        
        for(int y = 1; y <= a.length ; y++){
            System.out.println(a[y].getclases() + " " + a[y].getnota() + " ");
        }
        
    }
    
}
