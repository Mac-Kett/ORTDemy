import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sitio {

    private ArrayList<ResultadosDeInscripcion> resultado;
    private ArrayList<Categoria> categorias;
    private ArrayList<Curso> cursos;
    private ArrayList<Usuario> usuarios;

    public Sitio(){

        this.resultado = new ArrayList<ResultadosDeInscripcion>();
        this.categorias = new ArrayList<Categoria>();
        this.cursos = new ArrayList<Curso>();
        this.usuarios = new ArrayList<Usuario>();
    }

    public ResultadosInscripcion suscribirseACurso(String a, String b){
        //TODO
        ResultadosInscripcion resu = null;
        Usuario alumno = buscarAlumno(a);
        Curso curso = buscarCurso(b);

        boolean esAutor = curso.buscarAutor(alumno);

        if(alumno == null){
            resu = ResultadosInscripcion.USUARIO_INEX;
        } else if(curso == null){
            resu = ResultadosInscripcion.CURSO_INEX;
        } else if(esAutor){
            resu = ResultadosInscripcion.ES_AUTOR;
        } else if(curso.buscarAlumno(alumno)){
            resu = ResultadosInscripcion.YA_SUSCRIPTO;
        } else if(){
            //TODO
            resu = ResultadosInscripcion.MAX_BECADOS;
        } else if(suscribirAlumno(alumno, curso)){
            resu = ResultadosInscripcion.SUSCRIPTO_OK;
        }
        return resu;
    }

    private Usuario buscarAlumno(String a){
        //TODO

        int i = 0;
        Usuario encontrado = null;
        Usuario aux;

        while( i < this.usuarios.size() && encontrado == null){
            aux = this.usuarios.get(i);

            if(aux.getNombre().equals(a)){
                encontrado = aux;
            }
            i++;
        }
        return encontrado;
    }

    private boolean buscarSiEsBecado(Usuario u){
        //TODO
        boolean esBecado = false;

        if(u.isBecado()){
            esBecado = true;
        }

        return esBecado;
    }

    private Curso buscarCurso(String a){
        //TODO

        int i = 0;
        Curso encontrado = null;
        Curso aux;

        while( i < this.cursos.size() && encontrado == null){
            aux = this.cursos.get(i);

            if(aux.getTitulo().equals(a)){
                encontrado = aux;
            }
            i++;
        }
        return encontrado;
    }

    private boolean suscribirAlumno(Usuario u, Curso curso){

        boolean pudo = false;
        //TODO
        pudo =  curso.agregarAListadoDeAlumnos(u);

        return pudo;
    }

}
