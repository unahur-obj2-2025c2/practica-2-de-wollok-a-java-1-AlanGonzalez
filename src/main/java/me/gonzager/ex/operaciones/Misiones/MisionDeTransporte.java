package me.gonzager.ex.operaciones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public class MisionDeTransporte implements MisionRealizable {

    @Override
    public double calcularExtra() {
        return 100;
    }

    public boolean esAvanzadoUnDron(Dron unDron) {
        return unDron.getAutonomia() > 50;
    }
}
