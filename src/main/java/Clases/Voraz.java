package Clases;
import java.util.ArrayList;

/*
 * Este algoritmo se basa en ir seleccionando de la lista el alimento de la lista que tenga mayor aporte de 
 * calorias y menor peso y así ir cumpliendo con la X cantidad mínima calorias y el Y peso máximmo solicitado 
 * en la medida de lo posible
 */


public class Voraz 
{
    public static void solucionVoraz(ArrayList<Alimento> alimentos, int minCal, int maxPeso)
    {
        ArrayList<Alimento> solucion = new ArrayList<>(); //Array donde se van a guardar los alimentos que contienen la solucion
        int calTotal = 0; //variable para el total de calorias
        int pesoTotal = 0; //variable para el total de peso
        while(alimentos.isEmpty() != true)// ciclo para recorrer hasta que no queden aristas
        {
            if(calTotal < minCal || pesoTotal < maxPeso){ // condicion para limitar la cantidad de peso y calorias
                Alimento mejor = mejorAlimento(alimentos);// Función que trae el mejor alimento y lo guarda en la variable
                solucion.add(mejor); //Agregar el vertice a la lista de soluciones
                calTotal += mejor.getCalorias(); //sumar calorias
                pesoTotal += mejor.getPeso(); //sumar peso
                alimentos.remove(mejor); //Elimina el alimento encontrado anteriormente de la lista
            }
            else
                break;
        }
        System.out.println("\n" + "Cantidad mínima de calorias solicitadas: " + minCal + " Cantidad máxima de peso solicitado: " + maxPeso);
        System.out.println("\n"+"Alimentos de la solucion: ");
        for (Alimento alimento: solucion){
            System.out.println(alimento.toString());}//Imprime los vertices de la solucion  
        System.out.println("\n" + "Cantidad total de calorias: " + calTotal + " Cantidad total de peso: " + pesoTotal);
    } 
    
    public static Alimento mejorAlimento(ArrayList<Alimento> alimentos) //Funcion para sacar el alimento con mayor cantidad de calorias y menos peso
    { 
       Alimento escogido = alimentos.get(0); // Seleccionamos el alimento en la posición 0 de la lista para iniciar la comparación
       for(Alimento alimento: alimentos)// for para recorrer la lista
       {
           if(alimento.getCalorias() >= escogido.getCalorias() && alimento.getPeso() <= escogido.getPeso()){ //condicion para ver si el alimentro actual de la lista tiene mas calorias que el anteriormente escogido
               escogido = alimento; // asignacion del alimento con más calorias
           }
       }
       return escogido; //retornamos el alimento de la lista que finalmente tuviera mayor cantidad de calorias
    }
}
