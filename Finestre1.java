/*
Nucci Maria 4inB 02.02.2017
Testo: Apertura di più finestre
 */

package finestre1;

import java.util.Scanner;
        
public class Finestre1 {
    
    public static void main(String[] args) {
    int n;
    Scanner input =new Scanner(System.in);
    do{
        System.out.println("Inserire il numero delle finestre da aprire: " );
        n=input.nextInt();
    }while((n<0)||(n>10));
    Finestra f;
    int px=150, py=150;
    for(int i=0;i<n;i++){
        f=new Finestra();
        f.setVisible(true);
        f.testo.setText("sono la finestra  "+(i+1));
        f.setLocation(px=px+125, py=py+125);
        f.setTitle("FINESTRA"+(i+1));
    }
    }
}
