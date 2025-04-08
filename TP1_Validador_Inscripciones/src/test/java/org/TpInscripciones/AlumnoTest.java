package org.TpInscripciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    @Test
    public void inscripcionTest() {
        Inscripcion inscripcion = new Inscripcion();
        Materia algoritmos = new Materia("algoritmos");
        Materia paradigmas = new Materia("paradigmas");
        Alumno alumno = new Alumno("Lucas", "Verdaguer");
        paradigmas.agregarCorrelativa(algoritmos);
        alumno.agregarMateriasAprobadas(paradigmas);
        alumno.agregarMateriasAprobadas(algoritmos);
        assertTrue(inscripcion.aprobada(alumno, paradigmas));
    }

    @Test
    public void inscripcionTest2() {
        Inscripcion inscripcion = new Inscripcion();
        Materia algoritmos = new Materia("algoritmos");
        Materia paradigmas = new Materia("paradigmas");
        Alumno alumno = new Alumno("Lucas", "Verdaguer");
        paradigmas.agregarCorrelativa(algoritmos);
        assertFalse(inscripcion.aprobada(alumno, paradigmas));
    }
    @Test
    public void inscripcionTest3() {
        Inscripcion inscripcion = new Inscripcion();
        Materia algoritmos = new Materia("algoritmos");
        Materia paradigmas = new Materia("paradigmas");
        Materia logica = new Materia("Logica");
        Alumno alumno = new Alumno("Lucas", "Verdaguer");
        paradigmas.agregarCorrelativa(algoritmos);
        paradigmas.agregarCorrelativa(logica);
        alumno.agregarMateriasAprobadas(algoritmos);
        assertFalse(inscripcion.aprobada(alumno, paradigmas));
    }
    @Test
    public void inscripcionTest4() {
        Inscripcion inscripcion = new Inscripcion();
        Materia algoritmos = new Materia("algoritmos");
        Materia paradigmas = new Materia("paradigmas");
        Materia logica = new Materia("Logica");
        Alumno alumno = new Alumno("Lucas", "Verdaguer");
        paradigmas.agregarCorrelativa(algoritmos);
        paradigmas.agregarCorrelativa(logica);
        alumno.agregarMateriasAprobadas(algoritmos);
        alumno.agregarMateriasAprobadas(logica);
        assertTrue(inscripcion.aprobada(alumno, paradigmas));
    }
    @Test
    public void inscripcionTest5() {
        Inscripcion inscripcion = new Inscripcion();
        Materia algoritmos = new Materia("algoritmos");
        Materia paradigmas = new Materia("paradigmas");
        Materia diseño = new Materia("Diseño");
        Materia logica = new Materia("Logica");
        Alumno alumno = new Alumno("Lucas", "Verdaguer");
        paradigmas.agregarCorrelativa(algoritmos);
        //paradigmas.agregarCorrelativa(logica);
        diseño.agregarCorrelativa(paradigmas);
        alumno.agregarMateriasAprobadas(paradigmas);
        alumno.agregarMateriasAprobadas(algoritmos);
        assertTrue(inscripcion.aprobada(alumno, diseño,paradigmas));
    }

    @Test
    public void inscripcionTest6() {
        Inscripcion inscripcion = new Inscripcion();
        Materia algoritmos = new Materia("algoritmos");
        Materia paradigmas = new Materia("paradigmas");
        Materia diseño = new Materia("Diseño");
        Materia logica = new Materia("Logica");
        Alumno alumno = new Alumno("Lucas", "Verdaguer");
        paradigmas.agregarCorrelativa(algoritmos);
        paradigmas.agregarCorrelativa(logica);
        diseño.agregarCorrelativa(paradigmas);
        alumno.agregarMateriasAprobadas(paradigmas);
        alumno.agregarMateriasAprobadas(algoritmos);
        assertFalse(inscripcion.aprobada(alumno, diseño,paradigmas));
    }

}