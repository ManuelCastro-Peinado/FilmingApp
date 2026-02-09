package es.studium.filmingapp_4;

public class Peliculas {

    private int imagen;
    private String nombre;
    private String director;
    private String reparto;
    private String sinopsis;
    private int estrellas;

    public Peliculas(int imagen, String nombre, String director,
                     String reparto, String sinopsis, int estrellas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.director = director;
        this.reparto = reparto;
        this.sinopsis = sinopsis;
        this.estrellas = estrellas;
    }

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public String getReparto() {
        return reparto;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getEstrellas() {
        return estrellas;
    }
}
