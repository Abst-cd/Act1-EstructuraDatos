  public class Persona{
            private String nombre;
            private String fechaNacimiento;

            public Persona(String nombre, String fechaNacimiento){
                this.nombre = nombre;
                this.fechaNacimiento = fechaNacimiento;
            }

            @Override
            public String toString(){
                return "Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento;
            }
        }