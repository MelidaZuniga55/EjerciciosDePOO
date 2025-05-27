public class Entrenador extends Persona {
    private String federacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String federacion) {
        super(id, nombre, apellidos, edad);
        this.federacion = federacion;
    }

    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }

    public void dirigirPartido() {
        System.out.println("Entrenador está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Entrenador está dirigiendo un entrenamiento.");
    }
}
