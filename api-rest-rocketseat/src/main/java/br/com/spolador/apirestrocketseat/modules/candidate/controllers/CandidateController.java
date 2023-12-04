package br.com.spolador.apirestrocketseat.modules.candidate.controllers;

import br.com.spolador.apirestrocketseat.modules.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidate){
        System.out.println("Candidato: " + candidate.getEmail());
    }
}
