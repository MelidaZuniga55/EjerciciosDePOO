public class Masajista extends Persona {
    private String titulacion;
    private int añosExperiencia;

    public Masajista() {}

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int añosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " " + getApellidos() + " (masajista) se está preparando para asistir al equipo.");
    }

    public void darMasaje() {
        System.out.println("Masajista está dando un masaje.");
    }

    // Getters y setters
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}
