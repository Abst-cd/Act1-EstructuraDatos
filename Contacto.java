public class Contacto extends Persona {
    private String direccion;
    private String telefono;

    public Contacto(String nombre, String fechaNacimiento, String direccion, String telefono) {
        super(nombre, fechaNacimiento);
        this.direccion = direccion;
        this.telefono = telefono;
}


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   @Override
    public String toString() {
        return super.toString() + ", Direccion: " + direccion + ", Telefono: " + telefono;
    }
}
