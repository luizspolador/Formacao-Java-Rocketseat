package br.com.spolador.gestao_vagas.repositories;

import br.com.spolador.gestao_vagas.entities.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, Long> {
}
