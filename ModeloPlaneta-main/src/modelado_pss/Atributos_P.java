package modelado_pss;

public class Atributos_P {

    String nombre;
    int CantidadSatelites;
    double MasaKilogramos;
    double VolumenKilometrosCbc;
    int DiametroKilometros;
    int DistanciaKilometros;
    int Tamanio;
    boolean Vista;

    public Atributos_P(String nombre, int CantidadSatelites, double MasaKilogramos, double VolumenKilometrosCbc, int DiametroKilometros, int DistanciaKilometros, int Tamanio, boolean Vista) {
        this.nombre = nombre;
        this.CantidadSatelites = CantidadSatelites;
        this.MasaKilogramos = MasaKilogramos;
        this.VolumenKilometrosCbc = VolumenKilometrosCbc;
        this.DiametroKilometros = DiametroKilometros;
        this.DistanciaKilometros = DistanciaKilometros;
        this.Tamanio = Tamanio;
        this.Vista = Vista;
    }
    
    void Imprimir(){
        System.out.println("\nNombre : " + nombre +
                "\nCantidad de satelites : " + CantidadSatelites +
                "\nMasa : " + MasaKilogramos +
                "\nVolumen : " + VolumenKilometrosCbc +
                "\nDiametro : " + DiametroKilometros + 
                "\nDistancia : " + DistanciaKilometros +
                "\nTamaño : " + Tamanio() + 
                "\nObservable : " + Vista +
                "\nDensidad : " + CalcularDensidad() +
                "\nPlaneta Exterior : " + DeterminarCinturon());
        System.out.println("----------------------------------------");
    }
    
    public double CalcularDensidad(){
        double Masa = MasaKilogramos;
        double Volumen = VolumenKilometrosCbc; 
        double densidad;
        densidad = Masa / Volumen;
        return densidad;
    }
    
    public String Tamanio(){
        String Tipo = "";
        double tamanio = VolumenKilometrosCbc;
        if(tamanio <= 1.80 && tamanio >= 1.65){
            Tipo = String.valueOf("Gaseoso " + tamanio);
        }else if(tamanio <= 1.65 && tamanio >= 1.05){
            Tipo = String.valueOf("Terrestre " + tamanio);
        }else if(tamanio <= 1.05 && tamanio >= 1.01){
            Tipo = String.valueOf("Enano " + tamanio);
        }else{
            Tipo = String.valueOf("Error!!.");
        }
        return Tipo;
    }
    public boolean DeterminarCinturon(){
        return (DistanciaKilometros / 149597870) > 3.4 ;
    }
}