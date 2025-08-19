package me.gonzager.ex.operaciones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public interface MisionRealizable {
    double calcularExtra();
    boolean esAvanzadoUnDron(Dron unDron);
}
