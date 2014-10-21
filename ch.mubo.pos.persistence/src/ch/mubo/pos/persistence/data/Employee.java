
package ch.mubo.pos.persistence.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import ch.mubo.pos.persistence.api.EntityObject;
import ch.mubo.pos.persistence.api.EntityPlugin;

@Entity(name = "EMPLOYEE")
@EntityListeners(value = EntityPlugin.class)
@NamedQueries({ @NamedQuery(name = Employee.ALL, query = "select employees from EMPLOYEE employees") })
public class Employee implements EntityObject {
  public static final String ALL = "Employee.ALL";

  @Id
  @Column(name = "ID")
  private String id;
  @Column(name = "NAME")
  private String name;
  @Column(name = "DESCRIPTION")
  private String description;

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
