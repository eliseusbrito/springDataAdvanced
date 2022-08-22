package com.eliseu.springDataAdvanced.service;

import com.eliseu.springDataAdvanced.model.Aluno;
import com.eliseu.springDataAdvanced.model.AvaliacaoFisica;
import com.eliseu.springDataAdvanced.model.form.AlunoForm;
import com.eliseu.springDataAdvanced.model.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
