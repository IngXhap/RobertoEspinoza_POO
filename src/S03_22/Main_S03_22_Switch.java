/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S03_22;

/**
 *
 * @author kanne
 */
public class Main_S03_22_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a = 2;
        switch (a) {
            case 1:
                System.out.println("opcion 1");
                break;
            case 2:
                System.out.println("opcion 2");
                break;
            default:

                System.out.println("no encontre las opciones");
        }

        String b = "pantalon";
        switch(b){
            case "polo":
                System.out.println("estas comprando un polo");
                break;
            case "short":
                System.out.println("estas comprando un short");
                break;
            case "chompa":
                System.out.println("estas comprando una chompa");
                break;
            default:
                System.out.println("no encontre las opciones");

        }
    }
    
}
