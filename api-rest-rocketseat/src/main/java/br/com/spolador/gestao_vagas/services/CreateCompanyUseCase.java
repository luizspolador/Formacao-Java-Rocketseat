package br.com.spolador.gestao_vagas.services;

import br.com.spolador.gestao_vagas.exceptions.UserFoundException;
import br.com.spolador.gestao_vagas.entities.CompanyEntity;
import br.com.spolador.gestao_vagas.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity){
        this.companyRepository.findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail()).ifPresent((user) -> {
            throw new UserFoundException("Usuário já existe");
        });
        return this.companyRepository.save(companyEntity);
    }
}
