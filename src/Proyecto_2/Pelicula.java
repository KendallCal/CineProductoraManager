
//Clase Película.

package Proyecto_2;

//Imports.
import java.util.UUID;

public class Pelicula {
    //Variables.
    private UUID dni;
    private String nombre;
    private String genero;
    private String tipoAudiencia;
    private Productora productora;
    
    //Constructor.
    public Pelicula(String nombre, String genero, String tipoAudiencia) {
        this.dni = UUID.randomUUID(); 
        this.nombre = nombre;
        this.genero = genero;
        this.tipoAudiencia = tipoAudiencia;
    }
    
    //Getters and Setters.
    public UUID getDni() {
        return dni;
    }

    public void setDni(UUID dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoAudiencia() {
        return tipoAudiencia;
    }

    public void setTipoAudiencia(String tipoAudiencia) {
        this.tipoAudiencia = tipoAudiencia;
        
    }
    
    public void setProductora(Productora productor) {
        this.productora = productora;
    }
}
