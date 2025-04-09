package org.TpInscripciones;

import java.util.ArrayList;
import java.util.List;

public class Materia{
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

}

