package br.com.spolador.gestao_vagas.services;

import br.com.spolador.gestao_vagas.exceptions.UserFoundException;
import br.com.spolador.gestao_vagas.entities.CandidateEntity;
import br.com.spolador.gestao_vagas.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidateUseCase {
    @Autowired
    private CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity){
        this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail()).ifPresent((user) -> {
            throw new UserFoundException("Usuário já existe!");
        });
        return this.candidateRepository.save(candidateEntity);
    }
}
