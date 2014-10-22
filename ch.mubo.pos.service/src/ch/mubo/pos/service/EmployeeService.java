
package ch.mubo.pos.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.mubo.pos.persistence.dao.Dao;
import ch.mubo.pos.persistence.data.Employee;
import ch.mubo.pos.service.dto.EmployeeDto;
import ch.mubo.pos.service.mapper.DozerMapper;

@Stateless
@Transactional
public class EmployeeService {

  @Inject
  private DozerMapper mapper;

  @Inject
  private Dao dao;

  @Inject
  EntityManager em;

  public List<EmployeeDto> getEmployees() {
    return mapper.map(dao.findWithNamedQuery(Employee.ALL), EmployeeDto.class);
  }
}
