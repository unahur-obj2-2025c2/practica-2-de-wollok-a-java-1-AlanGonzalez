package me.gonzager.ex.operaciones.Misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.Drones.Dron;
import me.gonzager.ex.operaciones.Sensores.Escuadrones.Sensor;

public class MisionDeVigilancia implements MisionRealizable {
    private List<Sensor> sensores = new ArrayList<>();

    

    public MisionDeVigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }



    @Override
    public double calcularExtra() {
        return sensores.stream().mapToDouble(s -> s.eficienciaOperativa()).average().orElse(0.0);
    }

    public boolean esAvanzadoUnDron(Dron unDron){
        return sensores.stream().allMatch(s->s.esDuradero());
    }
}
