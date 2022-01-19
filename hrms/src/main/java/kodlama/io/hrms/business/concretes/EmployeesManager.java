package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployeesService;
import kodlama.io.hrms.dataAccess.abstracts.EmployeesDao;
import kodlama.io.hrms.entities.concretes.Employees;
@Service
public class EmployeesManager  implements EmployeesService{
	
	private EmployeesDao employeesDao;
	
	

@Autowired
	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}




	@Override
	public List<Employees> getAll() {
		
		return this.employeesDao.findAll();
	}

}
