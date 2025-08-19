package me.Sensores.Escuadrones;

public class Sensor {
    private Integer capacidad;
    private Integer durabilidad;
    private boolean mejorasTegnologicas;

    public Sensor(Integer capacidad, Integer durabilidad, boolean mejorasTegnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTegnologicas = mejorasTegnologicas;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getDurabilidad() {
        return durabilidad;
    }

    public boolean isMejorasTegnologicas() {
        return mejorasTegnologicas;
    }

    
    public double eficienciaOperativa() {
        if (mejorasTegnologicas) {
            return capacidad * 2;
        } else {
            return capacidad;
        }
    }

    public boolean esDuradero() {
        return this.getDurabilidad() > this.getCapacidad() * 2;
    }

    
}
