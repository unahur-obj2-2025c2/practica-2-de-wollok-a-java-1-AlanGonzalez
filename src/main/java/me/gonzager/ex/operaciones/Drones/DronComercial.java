package me.gonzager.ex.operaciones.Drones;

import me.gonzager.ex.operaciones.Misiones.MisionRealizable;

public class DronComercial extends Dron{

    public DronComercial(Float autonomia, Integer nivelDeProcesamiento, MisionRealizable misionEnLaCiudad) {
        super(autonomia, nivelDeProcesamiento, misionEnLaCiudad);
        
    }

    @Override
    public double eficienciaOperativa() {
        return super.eficienciaOperativa() * 1.1;
    }

    @Override
    public boolean esAvanzadoSegunTipo() {
        return false;
    }

    
    
}
