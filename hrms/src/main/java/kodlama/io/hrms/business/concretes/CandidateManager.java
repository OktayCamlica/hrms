package kodlama.io.hrms.business.concretes;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidateService;
import kodlama.io.hrms.dataAccess.abstracts.CandidateDao;
import kodlama.io.hrms.entities.concretes.Candidate;
@Service
public class CandidateManager implements CandidateService {
	

	private CandidateDao candidateDao;


@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}



	@Override
	public List<Candidate> getAll() {
			return this.candidateDao.findAll();
	}
	
	
	
	
	 

}
