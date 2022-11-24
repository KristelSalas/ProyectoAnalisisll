package Clases;

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        /**
         * Fecha de inicio: 11 de noviembre
         * Fecha última modificación: 22 de noviembre
         **/
                
        /** Alimentos definidos **/
        Alimento alimento1 = new Alimento("Pan Integral", 313, 100);
        Alimento alimento2 = new Alimento("Uva", 201, 300);
        Alimento alimento3 = new Alimento("Manzana", 104, 200);
        Alimento alimento4 = new Alimento("Brocoli", 34, 100);
        Alimento alimento5 = new Alimento("Pescado", 129, 100);
        Alimento alimento6 = new Alimento("Zanahoria", 164, 400);
        Alimento alimento7 = new Alimento("Tomate", 108, 600);
        Alimento alimento8 = new Alimento("Lechuga", 75, 500);
        Alimento alimento9 = new Alimento("Papa", 172, 200);
        Alimento alimento10 = new Alimento("Espinaca", 69, 300);
        Alimento alimento11 = new Alimento("Garbanzos", 364, 100);
        Alimento alimento12 = new Alimento("Pollo", 239, 100);
        Alimento alimento13 = new Alimento("Chayote", 57, 300);
        Alimento alimento14 = new Alimento("Remolacha", 86, 200);
        Alimento alimento15 = new Alimento("Huevo", 230, 200);
        Alimento alimento16 = new Alimento("Queso", 402, 100);
        
        
        
        /** Lista de 6 alimentos **/
        /**ArrayList<Alimento> alimentos1 = new ArrayList<>();
        alimentos1.add(alimento2);
        alimentos1.add(alimento4);
        alimentos1.add(alimento6);
        alimentos1.add(alimento8); 
        alimentos1.add(alimento11);
        alimentos1.add(alimento15); **/
        
        
        /** Lista de 8 alimentos **/
        ArrayList<Alimento> alimentos2 = new ArrayList<>();
        alimentos2.add(alimento1);
        alimentos2.add(alimento4);
        alimentos2.add(alimento6);
        alimentos2.add(alimento8);
        alimentos2.add(alimento10);
        alimentos2.add(alimento12);
        alimentos2.add(alimento15);
        alimentos2.add(alimento16);
        
        
        /** Lista de 12 alimentos **/
        /**ArrayList<Alimento> alimentos3 = new ArrayList<>();
        alimentos3.add(alimento3);
        alimentos3.add(alimento4);
        alimentos3.add(alimento5);
        alimentos3.add(alimento6);
        alimentos3.add(alimento7);
        alimentos3.add(alimento8);
        alimentos3.add(alimento9);
        alimentos3.add(alimento10);
        alimentos3.add(alimento11);
        alimentos3.add(alimento12);
        alimentos3.add(alimento13);
        alimentos3.add(alimento14); **/
        
       
        /** Lista de 16 alimentos **/
        /**ArrayList<Alimento> alimentos4 = new ArrayList<>();
        alimentos4.add(alimento1);
        alimentos4.add(alimento2);
        alimentos4.add(alimento3);
        alimentos4.add(alimento4);
        alimentos4.add(alimento5);
        alimentos4.add(alimento6);
        alimentos4.add(alimento7);
        alimentos4.add(alimento8);
        alimentos4.add(alimento9);
        alimentos4.add(alimento10);
        alimentos4.add(alimento11);
        alimentos4.add(alimento12);
        alimentos4.add(alimento13);
        alimentos4.add(alimento14);
        alimentos4.add(alimento15);
        alimentos4.add(alimento16); **/
        
        
        
        
        /**System.out.println("\n" + "°°||°°*°°------------------------------- HEURISTICA VORAZ --------------------------------°°*°°||°°");
        
        System.out.println("\n"+"-------- LISTA DE 6 ALIMENTOS --------");
        for (Alimento alimento: alimentos1){
            System.out.println(alimento.toString());
        }
        System.out.println("-------------------------------------");
        
        Voraz.solucionVoraz(alimentos1, 600, 700); **/
        
        
        /**System.out.println("\n"+"-------- LISTA DE 8 ALIMENTOS --------");
        for (Alimento alimento: alimentos2){
            System.out.println(alimento.toString());
        }
        System.out.println("-------------------------------------");
        
        Voraz.solucionVoraz(alimentos2, 900, 400); **/
        
        
        /**System.out.println("\n"+"-------- LISTA DE 12 ALIMENTOS --------");
        for (Alimento alimento: alimentos3){
            System.out.println(alimento.toString());
        }
        System.out.println("-------------------------------------");
        
        Voraz.solucionVoraz(alimentos3, 600, 700); **/
        
        
        /**System.out.println("\n"+"-------- LISTA DE 16 ALIMENTOS --------");
        for (Alimento alimento: alimentos4){
            System.out.println(alimento.toString());
        }
        System.out.println("-------------------------------------");
        
        Voraz.solucionVoraz(alimentos4, 600, 700); **/
        
        
        
        //System.out.println("\n" + "°°||°°*°°------------------------------- FUERZA BRUTA --------------------------------°°*°°||°°");
        
        /**System.out.println("\n"+"-------- LISTA DE 6 ALIMENTOS --------");
        for (Alimento alimento: alimentos1){
            System.out.println(alimento.toString());
        }
        System.out.println("-------------------------------------");
        
        FuerzaBruta.algoritmoFuerzaBruta(alimentos2, 900, 400); **/
        
        
        System.out.println("\n"+"-------- LISTA DE 8 ALIMENTOS --------");
        for (Alimento alimento: alimentos2){
            System.out.println(alimento.toString());
        }
        System.out.println("-------------------------------------");
        
        FuerzaBruta.algoritmoFuerzaBruta(alimentos2, 900, 400);
        
        
        /**System.out.println("\n"+"-------- LISTA DE 12 ALIMENTOS --------");
        for (Alimento alimento: alimentos3){
            System.out.println(alimento.toString());
        }
        System.out.println("-------------------------------------");
        
        FuerzaBruta.algoritmoFuerzaBruta(alimentos2, 900, 400); **/
        
        
        /**System.out.println("\n"+"-------- LISTA DE 16 ALIMENTOS --------");
        for (Alimento alimento: alimentos4){
            System.out.println(alimento.toString());
        }
        System.out.println("-------------------------------------");
        
        FuerzaBruta.algoritmoFuerzaBruta(alimentos2, 900, 400); **/
       
        
    }
    
}
