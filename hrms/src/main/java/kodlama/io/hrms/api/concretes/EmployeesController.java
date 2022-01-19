package kodlama.io.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.EmployeesService;
import kodlama.io.hrms.entities.concretes.Employees;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	private EmployeesService employeeService;
	
	

@Autowired
	public EmployeesController(EmployeesService employeeService) {
		super();
		this.employeeService = employeeService;
	}




	@GetMapping("/getall")
	public List<Employees> getAll () {
	return this.employeeService.getAll();
		
	}

}
