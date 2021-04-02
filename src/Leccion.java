public class Leccion {

    private String nombre;
    private int duracion;
    private TipoLeccion tipoLeccion;

    public Leccion(String n, int d, TipoLeccion tl){

        setNombre(n);
        setDuracion(d);
        setTipoLeccion(tl);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public TipoLeccion getTipoLeccion() {
        return tipoLeccion;
    }

    private void setTipoLeccion(TipoLeccion tipoLeccion) {
        this.tipoLeccion = tipoLeccion;
    }
}
