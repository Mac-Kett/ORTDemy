import java.util.ArrayList;

public class Curso {

    public static final int MAX_BECADOS_X_CURSO = 10;
    private  String ID;
    private String titulo;
    private double precio;
    private int valorizacion;
    private Usuario docente;
    private ArrayList<Usuario> alumnosSuscriptos;
    private ArrayList<Leccion> lecciones;

    public Curso(String id, String t, double p, int v, Usuario d){
        setID(id);
        setTitulo(t);
        setPrecio(p);
        setValorizacion(v);
        setDocente(d);

        this.alumnosSuscriptos = new ArrayList<Usuario>();
        this.lecciones = new ArrayList<Leccion>();
    }

    public String getID() {
        return ID;
    }

    private void setID(String ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getValorizacion() {
        return valorizacion;
    }

    private void setValorizacion(int valorizacion) {
        this.valorizacion = valorizacion;
    }

    public Usuario getDocente() {
        return docente;
    }

    private void setDocente(Usuario docente) {
        this.docente = docente;
    }

    public boolean buscarAlumno(Usuario u){
        //TODO
        int i = 0;
        Usuario encontrado = null;
        Usuario aux;
        boolean pudo = false;

        while( i < this.alumnosSuscriptos.size() && encontrado == null){
            aux = this.alumnosSuscriptos.get(i);

            if(aux == a){
                encontrado = aux;
                pudo = true;
            }
            i++;
        }
        return pudo;
    }

    public boolean buscarAutor(Usuario u){

        boolean loEncontro = false;

            if(this.docente == u){
                loEncontro = true;
            }

        return loEncontro;
    }

    public boolean suscribirAlumno(Usuario u){
        //TODO
    }

    public boolean agregarAListadoDeAlumnos(Usuario u){
        //TODO
        boolean pudo = false;

        if(u != null && !buscarAutor(u)) {
            this.alumnosSuscriptos.add(u);
            pudo = true;
        }

        return pudo;
    }

}
