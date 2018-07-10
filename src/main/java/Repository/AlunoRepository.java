package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Aluno;

@org.springframework.stereotype.Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
}
