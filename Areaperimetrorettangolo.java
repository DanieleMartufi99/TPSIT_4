/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrorettangolo;
import java.util.Scanner;

/**
 *
 * @author Studente
 */
public class Areaperimetrorettangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int b;
        int h;
        int A;
        int P;
        System.out.println("Inserisci la base del rettangolo");
        b=input.nextInt();
        System.out.println("Inserisci l'altezza del rettangolo");
        h=input.nextInt();
        
        P=2*(b+h);
        A=(b*h);
        
        System.out.println("Perimetro del rettangolo:"+P);
        System.out.println("Area del rettangolo:"+A);
        // TODO code application logic here
    }
    
}
