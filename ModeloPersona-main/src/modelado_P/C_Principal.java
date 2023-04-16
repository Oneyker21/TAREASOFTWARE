package modelado_P;

public class C_Principal {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Denis Oneyker", "Castillo Galeano", "121-210504-1005D", 2004, "Nicaragua", 'H');
        persona.Imprimir();
        
        Persona persona_uno = new Persona("Nohemí Sarahí", "Reyes Montiel", "547-120303-17346M", 2003, "Peru", 'M');
        persona_uno.Imprimir();
    }
}
