package com.AutoNote.senai.repository;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.AutoNote.senai.entity.AlunoCriterio;

@Repository
public interface AlunoCriterioRepository extends JpaRepository<AlunoCriterio, Integer> {
	
	@Query("select ac from AlunoCriterio ac where ac.id_alunoCriterio = id_alunoCriterio")
	Optional<AlunoCriterio> findById(Integer id_alunoCriterio);
	
	@Query("SELECT ac FROM AlunoCriterio ac WHERE ac.num_matricula_aluno_capacidade = :numMatricula")
    Optional<AlunoCriterio> findByNumMatricula(@Param("numMatricula") Integer numMatricula);

}