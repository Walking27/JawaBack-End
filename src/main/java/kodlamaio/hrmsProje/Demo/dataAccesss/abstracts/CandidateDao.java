package kodlamaio.hrmsProje.Demo.dataAccesss.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProje.Demo.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {

	
}
