import java.util.ArrayList;

public class Red {

    private ArrayList<EquipoRed> equipos;

    public Red() {
        equipos = new ArrayList<>();
    }

    public void agregarEquipo(EquipoRed equipo) {
        if (equipo != null) {
            equipos.add(equipo);
        }
    }

    public EquipoRed buscarPorIP(String direccionIP) {
        for (EquipoRed equipo : equipos) {
            if (equipo.getDireccionIP().equals(direccionIP)) {
                return equipo;
            }
        }

        return null;
    }

    public int contarActivos() {
        int contador = 0;

        for (EquipoRed equipo : equipos) {
            if (equipo.isActivo()) {
                contador++;
            }
        }

        return contador;
    }

    public String mostrarEquipos() {
        String resultado = "===== EQUIPOS DE LA RED =====\n";

        if (equipos.isEmpty()) {
            return resultado + "No hay equipos registrados.";
        }

        for (EquipoRed equipo : equipos) {
            resultado += "\n-------------------------\n";
            resultado += equipo.mostrarInformacion() + "\n";
        }

        return resultado;
    }
}
