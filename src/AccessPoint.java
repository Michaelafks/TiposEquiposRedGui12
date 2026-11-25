public class AccessPoint extends EquipoRed {

    private int cantidadClientes;

    public AccessPoint(String nombre, String direccionIP, boolean activo, int cantidadClientes) {
        super(nombre, direccionIP, activo);
        this.cantidadClientes = cantidadClientes;
    }

    @Override
    public String obtenerFuncion() {
        return "Proporciona conexión inalámbrica a los dispositivos.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Access Point" +
                "\nCantidad de clientes: " + cantidadClientes +
                "\nFunción: " + obtenerFuncion();
    }
}