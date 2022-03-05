package com.systme.bankigin.bank.repository;

import com.systme.bankigin.bank.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
