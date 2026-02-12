public class Persona {
    int edad;
    String nombre;
    String apellidos;

    public Persona(String datos) {
        this.nombre = datos.split(";")[0].strip();
        this.apellidos = datos.split(";")[1].strip();
        this.edad = Integer.parseInt(datos.split(";")[2].strip());
    }

    public String serialize(){
        return String.format("%s;%s;%d%n", nombre,apellidos,edad);
    }
    @Override
    public String toString() {
        return String.format("""
                Nombre: %s
                Apellidos: %s
                Edad: %d
                """, nombre, apellidos, edad);
    }
}
