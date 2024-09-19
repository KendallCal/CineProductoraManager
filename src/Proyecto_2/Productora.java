
//Clase Productora.

package Proyecto_2;

public class Productora {
    //Variables.
    private static int contadorID = 1;
    private int id;
    private String descripcion;
    private Pelicula[] peliculas;
    private int cantidadPeliculas;
    private static final int capacidadMaxima = 100;

    //Constructor.
    public Productora(String descripcion) {
        this.id = contadorID++;
        this.descripcion = descripcion;
        this.peliculas = new Pelicula[capacidadMaxima];
        this.cantidadPeliculas = 0;
    }

    //Getters y Setters
    public int getTamanioPila() {
        return cantidadPeliculas;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Retorna solo las películas válidas
    public Pelicula[] getPeliculas() {
        Pelicula[] peliculasValidas = new Pelicula[cantidadPeliculas];
        for (int i = 0; i < cantidadPeliculas; i++) {
            peliculasValidas[i] = peliculas[i];
        }
        return peliculasValidas;
    }

    //Método para agregar Películas.
    public boolean agregarPelicula(Pelicula pelicula) {
        if (cantidadPeliculas < capacidadMaxima) {
            peliculas[cantidadPeliculas++] = pelicula;
            return true;
        } else {
            return false;
        }
    }
    
    //Método para eliminar Películas.
    public Pelicula eliminarPrimeraPelicula() {
        if (cantidadPeliculas > 0) {
            Pelicula peliculaEliminada = peliculas[0];
            
            //Desplazar todas las películas una posición hacia la izquierda.
            for (int i = 1; i < cantidadPeliculas; i++) {
                peliculas[i - 1] = peliculas[i];
            }
            peliculas[--cantidadPeliculas] = null;
            return peliculaEliminada;
        } else {
            return null;
        }
    }
}