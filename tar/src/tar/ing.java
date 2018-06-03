/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tar;

/**
 *
 * @author Nis
 */
public class ing {
    //private int cant;
    private String clases;
    //private String alumn;
    //private int grado;
    private int nota;
    
    public ing(){
        //cant = 0;
        clases = "";
        //alumn = "";
        //grado = 0;
        nota = 0;
        
    }
    
    
    

    
    public ing(String c, int n ){
        //cant = 0;
        clases = c;
        //alumn = "";
        //grado = 0;
        nota = n;
        
    }
    
    public String getclases(){
        return clases;
    }
    
    public void setclases(String clases){
        this.clases = clases;
    }
    
    public int getnota(){
        return nota;
    }
    
    public void setnota(int nota){
        this.nota = nota;
    }
    

}


