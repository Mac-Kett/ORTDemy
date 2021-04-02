import java.util.ArrayList;

public class Categoria {

    private String ID;
    private String nombre;
    private ArrayList<Curso> cursosDeLaCategoria;

    public Categoria(String id, String n){

        setID(id);
        setNombre(n);

        this.cursosDeLaCategoria = new ArrayList<Curso>();
    }

    public String getID() {
        return ID;
    }

    private void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso buscarCurso(String a){
        //TODO

        int i = 0;
        Curso encontrado = null;
        Curso aux;

        while( i < this.cursosDeLaCategoria.size() && encontrado == null){
            aux = this.cursosDeLaCategoria.get(i);

            if(aux.getTitulo().equals(a)){
                encontrado = aux;
            }
            i++;
        }
        return encontrado;
    }

}
