package org.TpInscripciones;

import java.util.ArrayList;
import java.util.List;



public class Alumno{
    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriasAprobadas(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

}






