package Clases;
import java.util.ArrayList;
import java.util.Set;


/*
 * Este algoritmo se basa en ir seleccionando de la lista el alimento de la lista que tenga mayor aporte de 
 * calorias y menor peso y así ir cumpliendo con la X cantidad mínima calorias y el Y peso máximmo solicitado 
 * en la medida de lo posible
 */


public class Voraz 
{
    public static void solucionVoraz(ArrayList<Alimento> alimentos, int minCal, int MaxPeso)
    {
        ArrayList<Alimento> solucion = new ArrayList<>(); //Array donde se van a guardar los alimentos que contienen la solucion
        while(alimentos.isEmpty() != true)// ciclo para recorrer hasta que no queden aristas
        {
            Alimento A = mejorAlimento(alimentos);// Función que trae el mejor alimento y lo guarda en la variable
            solucion.add(A); //Agregar el vertice a la lista de soluciones
            System.out.println("\n"+"Alimento con mayor cantidad de calorías y menor cantidad de peso: " + A);
            alimentos.remove(A); //Elimina el alimento encontrado anteriormente de la lista
            System.out.println("\n"+"----------- LISTA REDUCIDA -----------");
            for (Alimento alimento: alimentos){
            System.out.println(alimento.toString());}
            System.out.println("--------------------------------------");
        }
        System.out.println("\n"+"Alimentos de la solucion: " + solucion.toString()); //Imprime los vertices de la solucion  
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
       return escogido; //retornamos el alimento de la lista que fonalmente tuviera mayor cantidad de calorias
    }
}
