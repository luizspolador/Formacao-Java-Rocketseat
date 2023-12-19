package br.com.spolador.gestao_vagas.repositories;

import br.com.spolador.gestao_vagas.entities.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {
    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);
}
