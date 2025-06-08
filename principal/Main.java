package principal;

import entidades.Perro;
import entidades.Circulo;
import entidades.Figura;
import entidades.Vehiculo;
import entidades.Auto;

public class Main {
    public static void main(String[] args) {

        // HERENCIA
        System.out.println("=== HERENCIA ===");
        Perro miPerro = new Perro("Firulais");
        miPerro.hacerSonido();

        // ABSTRACCIÓN
        System.out.println("\n=== ABSTRACCIÓN ===");
        Figura miCirculo = new Circulo(5); 
        System.out.println("Área del círculo: " + miCirculo.calcularArea());

        // POLIMORFISMO
        System.out.println("\n=== POLIMORFISMO ===");
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Auto(); // Polimorfismo: objeto de tipo Auto visto como Vehiculo

        v1.moverse(); // Sale: El vehículo se está moviendo.
        v2.moverse(); // Sale: El auto acelera sobre el asfalto.
    }
}