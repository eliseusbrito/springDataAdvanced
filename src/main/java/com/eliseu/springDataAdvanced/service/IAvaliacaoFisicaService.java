package com.eliseu.springDataAdvanced.service;

import com.eliseu.springDataAdvanced.model.AvaliacaoFisica;
import com.eliseu.springDataAdvanced.model.form.AvaliacaoFisicaUpdateForm;
import com.eliseu.springDataAdvanced.model.form.AvaliacaoFisicaForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);

}
