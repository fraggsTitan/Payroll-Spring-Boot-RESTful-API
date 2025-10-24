package com.payroll.Payroll;

import org.springframework.data.jpa.repository.JpaRepository;
interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
