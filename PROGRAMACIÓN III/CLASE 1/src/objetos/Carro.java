package objetos;

public class Carro {

    String placa;
    String color;
    int precio;
    int añoFabricacion;
    int cilindraje;
    
    public Carro(String placa, String color, int precio, int añoFabricacion, int cilindraje) {
        this.placa = placa;
        this.color = color;
        this.precio = 0;
        this.añoFabricacion = 0;
        this.cilindraje = 0;


    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getAñoFabricacion() {
        return añoFabricacion;
    }
    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void imprimir() {

        System.out.println("----------------------------------------");
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
        System.out.println("Año de Fabricación: " + añoFabricacion);
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("----------------------------------------");
    }

    
}
