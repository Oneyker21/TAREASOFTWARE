package modelado_Automovil;

public class Automovil {

    public static void main(String[] args) {
        Atributos_Automovil miAuto1 = new Atributos_Automovil("Toyota", 1987, 1.6, "Gasolina", "Deportivo", 2, 4, 150, "Negro", 120);
        miAuto1.Imprimir();
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");
        
        miAuto1.acelerar(20);
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");

        miAuto1.desacelerar(50);
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");

        miAuto1.frenar();
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");

    }
}
