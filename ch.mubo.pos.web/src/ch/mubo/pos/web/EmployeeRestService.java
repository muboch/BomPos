package ch.mubo.pos.web;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.*;
import javax.ws.rs.core.Response;

import ch.mubo.pos.service.EmployeeService;

@Path("employee")
public class EmployeeRestService {
	
	@Inject
	private EmployeeService personService;
	
	@GET
	@Produces(APPLICATION_JSON)
	@Path("list")
	public Response getEmployees(){
		return Response.ok().build();
	}

}
