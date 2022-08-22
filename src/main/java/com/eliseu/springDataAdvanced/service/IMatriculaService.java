package com.eliseu.springDataAdvanced.service;

import com.eliseu.springDataAdvanced.model.Matricula;
import com.eliseu.springDataAdvanced.model.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);

}
