public class Propietario {
    private String nome;
    private String apellidos;
    private String dni;
    private String telefono;
    private String email;

    public Propietario(String nome, String apellidos, String dni, String telefono, String email) {
        this.nome = nome;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNombre(String nome) {
        this.nome = nome;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   

}
