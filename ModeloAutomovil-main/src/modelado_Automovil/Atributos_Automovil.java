package modelado_Automovil;

import java.util.Date;

public class Atributos_Automovil {

    private String marca;
    private int modelo;
    private double motor;
    private String tipoCombustible;
    private String tipoAutomovil;
    private int numPuertas;
    private int numAsientos;
    private int velocidadMaxima;
    private String color;
    private int velocidadActual;

    public Atributos_Automovil(String marca, int modelo, double motor, String tipoCombustible, String tipoAutomovil, int numPuertas, int numAsientos, int velocidadMaxima, String color, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void acelerar(int velocidad) {
        int nuevaVelocidad = velocidadActual + velocidad;
        if (nuevaVelocidad <= velocidadMaxima) {
            velocidadActual = nuevaVelocidad;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad máxima permitida.");
        }
    }
     public void desacelerar(int velocidad) {
        int nuevaVelocidad = velocidadActual - velocidad;
        if (nuevaVelocidad >= 0) {
            velocidadActual = nuevaVelocidad;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        }
    }
    public void frenar() {
        velocidadActual = 0;
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }
     public double calcularTiempoEstimado(double distancia) {
        return distancia / velocidadActual;
    }
     public void Imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automóvil: " + tipoAutomovil);
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Cantidad de asientos: " + numAsientos);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
         System.out.println("---------------------------------------------");
    }
}
