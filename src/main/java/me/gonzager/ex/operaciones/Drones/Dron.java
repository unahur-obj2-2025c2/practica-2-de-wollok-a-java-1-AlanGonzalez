package me.gonzager.ex.operaciones.Drones;

import me.gonzager.ex.operaciones.Misiones.MisionRealizable;

public abstract class Dron {
    private Float autonomia;
    private Integer nivelDeProcesamiento;
    private MisionRealizable misionEnLaCiudad;
    
    public Dron(Float autonomia, Integer nivelDeProcesamiento, MisionRealizable misionEnLaCiudad) {
        this.autonomia = autonomia;
        this.nivelDeProcesamiento = nivelDeProcesamiento;
        this.misionEnLaCiudad = misionEnLaCiudad;
    }

    public Float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Float autonomia) {
        this.autonomia = autonomia;
    }

    public Integer getNivelDeProcesamiento() {
        return nivelDeProcesamiento;
    }

    public void setNivelDeProcesamiento(Integer nivelDeProcesamiento) {
        this.nivelDeProcesamiento = nivelDeProcesamiento;
    }

    public MisionRealizable getMisionEnLaCiudad() {
        return misionEnLaCiudad;
    }

    public void setMisionEnLaCiudad(MisionRealizable misionEnLaCiudad) {
        this.misionEnLaCiudad = misionEnLaCiudad;
    }

    public abstract boolean esAvanzadoSegunTipo();

    public double eficienciaOperativa() {
        return this.autonomia * 10 + misionEnLaCiudad.eficienciaOperativa();
    }


    
}
