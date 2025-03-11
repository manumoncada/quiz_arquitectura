package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Auto {
    private String marca;
    private String placa;
    private String modelo;
    private int anio;
    private double kilometraje;
    private String estado;

    public Auto() {
    }

    public Auto(String marca, String placa, String modelo, int anio, double kilometraje, String estado) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static List<Auto> getCarro() {
        return carro;
    }

    public static void setCarro(List<Auto> carro) {
        Auto.carro = carro;
    }

    public static List<Auto> carro = new ArrayList<>();
    private static void nuevoCarro(Scanner scanner) {
        System.out.println("registre su vehiculo");
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();

        System.out.println("ingrese la placa");
        String placa = scanner.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        System.out.print("Ingrese el kilometraje: ");
        double kilometraje = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Ingrese el estado: ");
        String estado = scanner.nextLine();

        Auto nuevoAuto = new Auto(marca, placa, modelo, anio, kilometraje, estado);
        carro.add(nuevoAuto);

        System.out.println("Auto agregado exitosamente.");
    }
    private static void mostrarDetalles(Scanner scanner) {
            System.out.print("Ingrese la placa del su auto: ");
            String placasregistradas = scanner.nextLine();

            for (Auto auto : carro) {
                if (auto.getPlaca().equalsIgnoreCase(placasregistradas)) { // Comparar placas ignorando mayúsculas/minúsculas
                    auto.notifyAll();
                    return;
                }
            }

            System.out.println("No se encontró un auto con la placa: " + placasregistradas);
        }

    public void actualizarKm(double nuevoKm) {
        System.out.println("ingrese el nuevo kilometraje");
        double kilometraje= Scanner;
        if (nuevoKm >= kilometraje) {
            this.kilometraje = nuevoKm;
            System.out.println("el kilometraje registrado es: " + kilometraje + " km");
        } else {
            System.out.println("El kilometraje no es posble de registrar.");
        }
    }
    private static void verificarAntiguedad(Scanner scanner) {
        if (carro.isEmpty()) {
            System.out.println("No hay autos registrados.");
            return;
        }

        System.out.print("Ingrese la placa del auto a verificar: ");
        String placaBuscada = scanner.nextLine();

        for (Auto vehiculo: carro) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placaBuscada)) { // Comparar placas ignorando mayúsculas/minúsculas
                if () {
                    System.out.println("El auto con placa " + placaBuscada + " es antiguo.");
                } else {
                    System.out.println("El auto con placa " + placaBuscada + " no es antiguo.");
                }
                return; // Salir del método después de encontrar el auto
            }
        }

        System.out.println("No se encontró un auto con la placa: " + placaBuscada);
    }
}
