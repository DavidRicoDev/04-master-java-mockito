package es.davidrico.mockito.repositorios;

import es.davidrico.mockito.modelos.Examen;

import java.util.List;

public interface ExamenRepository {
    Examen guardar(Examen examen);
    List<Examen> findAll();
}
