package ch.mubo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import ch.mubo.api.EntityObject;
import ch.mubo.api.EntityPlugin;

@Entity(name="EMPLOYEE")
@EntityListeners(value = EntityPlugin.class)
public class Employee implements EntityObject{
	
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "NAME")
	private String name;
	@Column(name="DESCRIPTION")
	private String description;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
	    this.id=id;
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
