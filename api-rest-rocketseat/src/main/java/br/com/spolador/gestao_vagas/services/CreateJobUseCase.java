package br.com.spolador.gestao_vagas.services;

import br.com.spolador.gestao_vagas.entities.JobEntity;
import br.com.spolador.gestao_vagas.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity){
        return this.jobRepository.save(jobEntity);
    }
}
