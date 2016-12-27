/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nucci_perimetro;

/**
 *
 * @author Nucci Maria 4inB 
 */
public class Nucci_perimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lato1=4;
        int lato2=10;
        int perimetro;
        int area;
        perimetro=(lato1+lato2)*2;
        area=lato1*lato2;
        System.out.println("Il perimetro del rettangolo con lati "+lato1+" e "+lato2+" e': "+perimetro);
        System.out.println("L'area: "+area);
    }
    
}
