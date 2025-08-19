package me.gonzager.ex.operaciones.Drones;

import me.gonzager.ex.operaciones.Misiones.MisionRealizable;

public class DronSeguridad extends Dron {

    public DronSeguridad(Float autonomia, Integer nivelDeProcesamiento, MisionRealizable misionEnLaCiudad) {
        super(autonomia, nivelDeProcesamiento, misionEnLaCiudad);
       
    }

    @Override
    public boolean esAvanzadoSegunTipo() {
        return this.getNivelDeProcesamiento() > 50;
    }

    

    
}
