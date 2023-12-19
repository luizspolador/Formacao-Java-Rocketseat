package br.com.spolador.gestao_vagas.controllers;

import br.com.spolador.gestao_vagas.entities.JobEntity;
import br.com.spolador.gestao_vagas.services.CreateJobUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private CreateJobUseCase createJobUseCase;

    @PostMapping
    public JobEntity create (@Valid @RequestBody JobEntity jobEntity){
        return this.createJobUseCase.execute(jobEntity);
    }
}
