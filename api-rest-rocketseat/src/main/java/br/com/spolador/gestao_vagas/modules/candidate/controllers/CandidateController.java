package br.com.spolador.gestao_vagas.modules.candidate.controllers;

import br.com.spolador.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.spolador.gestao_vagas.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class
CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping
    public CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity){
        return this.candidateRepository.save(candidateEntity);
    }
}