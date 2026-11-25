public class Switch extends EquipoRed {

    private int cantidadPuertos;

    public Switch(String nombre, String direccionIP, boolean activo, int cantidadPuertos) {
        super(nombre, direccionIP, activo);
        this.cantidadPuertos = cantidadPuertos;
    }

    @Override
    public String obtenerFuncion() {
        return "Conecta dispositivos dentro de una misma red local.";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Switch" +
                "\nCantidad de puertos: " + cantidadPuertos +
                "\nFunción: " + obtenerFuncion();
    }
}