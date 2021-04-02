public class Usuario {

    private String ID;
    private String nombre;
    private String mail;
    private boolean becado;

    public Usuario(String id, String n, String m, boolean b){

        setID(id);
        setNombre(n);
        setMail(m);
        setBecado(b);
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

    public String getMail() {
        return mail;
    }

    private void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isBecado() {
        return becado;
    }

    private void setBecado(boolean becado) {
        this.becado = becado;
    }
}
