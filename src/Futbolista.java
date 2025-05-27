public class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    public Futbolista() {}

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " " + getApellidos() + " (futbolista) se está concentrando para el partido.");
    }

    public void jugarPartido() {
        System.out.println("Futbolista está jugando un partido.");
    }

    public void entrenar() {
        System.out.println("Futbolista está entrenando.");
    }

    // Getters y setters
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
}
