package br.com.spolador.gestao_vagas.repositories;

import br.com.spolador.gestao_vagas.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

    Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
}
