public class EquipoRed {

    private String nombre;
    private String direccionIP;
    private boolean activo;

    public EquipoRed(String nombre, String direccionIP, boolean activo) {
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = activo;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean isActivo() {
        return activo;
    }

    public String obtenerFuncion() {
        return "Equipo encargado de formar parte de una red.";
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre +
                "\nDirección IP: " + direccionIP +
                "\nEstado: " + (activo ? "Activo" : "Inactivo");
    }
}