public class Main {

    public static void main(String[] args) {

        // Crear equipos independientemente
        EquipoRed e1 = new Router("R1", "10.0.0.1", true, 12);

        EquipoRed e2 = new Switch("SW1", "10.0.0.2", true, 24);

        EquipoRed e3 = new AccessPoint("AP1", "10.0.0.3", true, 35);

        EquipoRed e4 = new Firewall("FW1", "10.0.0.4", false, 50);

        // Crear red
        Red red = new Red();

        // Agregar equipos
        red.agregarEquipo(e1);
        red.agregarEquipo(e2);
        red.agregarEquipo(e3);
        red.agregarEquipo(e4);

        // Mostrar equipos
        System.out.println("===== EQUIPOS REGISTRADOS =====");
        System.out.println(red.mostrarEquipos());

        // Mostrar funciones
        System.out.println("\n===== FUNCIONES DE LOS EQUIPOS =====");
        System.out.println("Router: " + e1.obtenerFuncion());
        System.out.println("Switch: " + e2.obtenerFuncion());
        System.out.println("Access Point: " + e3.obtenerFuncion());
        System.out.println("Firewall: " + e4.obtenerFuncion());

        // Buscar IP existente
        System.out.println("\n===== BÚSQUEDA DE IP EXISTENTE =====");
        EquipoRed encontrado = red.buscarPorIP("10.0.0.1");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Equipo no encontrado.");
        }

        // Buscar IP inexistente
        System.out.println("\n===== BÚSQUEDA DE IP INEXISTENTE =====");
        encontrado = red.buscarPorIP("10.0.0.99");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Equipo no encontrado.");
        }

        // Contar equipos activos
        System.out.println("\n===== CONTEO DE EQUIPOS ACTIVOS =====");
        System.out.println("Equipos activos: " + red.contarActivos());
    }
}
