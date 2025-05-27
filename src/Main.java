public class Main {
    public static void main(String[] args) {
        // Crear un objeto Futbolista
        Futbolista futbolista = new Futbolista(1, "Luis", "Díaz", 27, 10, "Defensa");
        System.out.println("=== FUTBOLISTA ===");
        System.out.println("Nombre: " + futbolista.getNombre() + " " + futbolista.getApellidos());
        System.out.println("Edad: " + futbolista.getEdad());
        futbolista.concentrarse();
        futbolista.viajar();

        System.out.println();

        // Crear un objeto Entrenador
        Entrenador entrenador = new Entrenador(2, "Marcelo", "Hernández", 68, "Ofensiva total");
        System.out.println("=== ENTRENADOR ===");
        System.out.println("Nombre: " + entrenador.getNombre() + " " + entrenador.getApellidos());
        System.out.println("Edad: " + entrenador.getEdad());
        entrenador.concentrarse();
        entrenador.viajar();

        System.out.println();

        // Crear un objeto Masajista
        Masajista masajista = new Masajista(3, "Carlos", "Gómez", 45, "Fisioterapia deportiva", 15);
        System.out.println("=== MASAJISTA ===");
        System.out.println("Nombre: " + masajista.getNombre() + " " + masajista.getApellidos());
        System.out.println("Edad: " + masajista.getEdad());
        System.out.println("Titulación: " + masajista.getTitulacion());
        System.out.println("Años de experiencia: " + masajista.getAñosExperiencia());
        masajista.concentrarse();
        masajista.viajar();
    }
}
