public class Firewall extends EquipoRed {

    private int cantidadReglas;

    public Firewall(String nombre, String direccionIP, boolean activo, int cantidadReglas) {
        super(nombre, direccionIP, activo);
        this.cantidadReglas = cantidadReglas;
    }

    @Override
    public String obtenerFuncion() {
        return "Supervisa y controla el tráfico de red según reglas de seguridad.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Firewall" +
                "\nCantidad de reglas: " + cantidadReglas +
                "\nFunción: " + obtenerFuncion();
    }
}