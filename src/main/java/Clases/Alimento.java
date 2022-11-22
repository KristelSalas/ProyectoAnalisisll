package Clases;

public class Alimento 
{
    private String nombre;
    private int calorias;
    private int peso;

    public Alimento(String nombre, int calorias, int peso) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre + ", calorias = " + calorias + ", peso = " + peso;
    }
    
    
}
