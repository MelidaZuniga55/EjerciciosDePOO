public class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {}

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
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

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAñosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
