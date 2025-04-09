package org.TpInscripciones;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Inscripcion{

    private Alumno alumnoAInscribir;
    private List<Materia> materiasAInscribir;
    private Set<Materia> correlativas;

    public Inscripcion() {
        this.materiasAInscribir = new ArrayList<>();
        this.correlativas = new HashSet<>();
    }

    public void cargarMateriasAInscripciones(Materia ... materias){
        Collections.addAll(this.materiasAInscribir, materias);}


    public void getCorrelativasNecesarias(Materia ... materias) {
        this.cargarMateriasAInscripciones(materias);
        this.correlativas = this.materiasAInscribir.stream().
                flatMap(m ->m.getCorrelativas().stream())
                .collect(Collectors.toSet());

    }

    public Boolean aprobada(Alumno alumno, Materia ... materias){
        this.alumnoAInscribir = alumno;
        List<Materia> materiasAprobadas = alumno.getMateriasAprobadas();
        this.getCorrelativasNecesarias(materias);
        return correlativas.stream().allMatch(m->materiasAprobadas.contains(m));

    }
}
