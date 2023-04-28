public class Vehiculo {
    private String placa;
    private String color;
    private String linea;
    private int modelo;
    private String propietario;

    public Vehiculo(String placa, String color, String linea, int modelo, String propietario) {
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public Vehiculo(){

    }

    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public String getLinea() {
        return linea;
    }

    public int getModelo() {
        return modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
