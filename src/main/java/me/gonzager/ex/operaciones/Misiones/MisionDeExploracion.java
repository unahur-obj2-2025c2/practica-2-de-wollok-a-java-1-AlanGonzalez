package me.gonzager.ex.operaciones.Misiones;

import me.gonzager.ex.operaciones.Drones.Dron;

public class MisionDeExploracion implements MisionRealizable {
    
    @Override
    public double calcularExtra() {
        return 0;
    }

    public boolean esAvanzadoUnDron(Dron unDron){
        return  unDron.eficienciaOperativa() % 2 == 0;
    }

}
