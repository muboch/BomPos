
package ch.mubo.pos.service;

import java.util.List;

import javax.ejb.Stateless;

import ch.mubo.pos.persistence.data.Employee;

@Stateless
public class EmployeeService {

  public List<Employee> getEmployees() {
    List<Employee> employeeList = Employee.ALL;
    return employeeList;
  }
}
