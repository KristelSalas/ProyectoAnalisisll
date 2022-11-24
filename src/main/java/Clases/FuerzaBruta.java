package Clases;
import java.util.ArrayList;
import java.util.Collections;


/*
 * Este algoritmo se trata de buscar todas las combinaciones posibles e ir remplazando la solucion anterior encontrada
 * con una nueva que sea más eficiente que en este caso sería el conjunto de alimentos que contiene más nutrientes y menos
 * peso dentro de los rangos establecidos
 */

//ir poniendo en la posible solucion los alimentos que parecen dar las calorias y peso optimo y cambiarla por una nueva de haber ua mejor

public class FuerzaBruta 
{
    public static void algoritmoFuerzaBruta(ArrayList<Alimento> alimentos, int minCal, int maxPeso)
    {
        //Collections.shuffle(alimentos); desordena la lista
        ArrayList<Alimento> solucion = new ArrayList<>(); //Array donde se van a guardar  la solucion
        ArrayList<Alimento> posibleSolucion = new ArrayList<>(); //Array donde se van a guardar la posible solucion durante la ejecución
        int calTotal = 0; //variable para el total de calorias
        int pesoTotal = 0; //variable para el total de peso
        while(calTotal < minCal || pesoTotal < maxPeso){
            Alimento inicio = alimentos.get(0);
            for(Alimento alimento: alimentos){
            
            }
        }
    }
    
   
}
