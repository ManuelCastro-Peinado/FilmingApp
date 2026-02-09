package es.studium.filmingapp_4;

public class Series {
    private final int imagen;
    private final String nombre;
    private final String director;
    private final String reparto;
    private final String sinopsis;
    private final int estrellas;
    private final int temporadas;

    public Series(int imagen, String nombre, String director, String reparto,
                  String sinopsis, int estrellas, int temporadas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.director = director;
        this.reparto = reparto;
        this.sinopsis = sinopsis;
        this.estrellas = estrellas;
        this.temporadas = temporadas;
    }

    // Getters
    public int getImagen() { return imagen; }
    public String getNombre() { return nombre; }
    public String getDirector() { return director; }
    public String getReparto() { return reparto; }
    public String getSinopsis() { return sinopsis; }
    public int getEstrellas() { return estrellas; }
    public int getTemporadas() { return temporadas; }
}
