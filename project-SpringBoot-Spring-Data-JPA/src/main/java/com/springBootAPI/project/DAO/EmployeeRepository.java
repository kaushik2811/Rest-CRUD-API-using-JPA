package com.springBootAPI.project.DAO;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootAPI.project.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it no need to write any code.
	
}
