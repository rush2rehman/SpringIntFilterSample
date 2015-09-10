package com.mycompany.SpringIntFilterSample;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path(value = "v1/platform/event/")
public class SampleResource {

	
	@GET
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	@Path(value = "/notification")
	public Response createNotification() throws Exception 
	{
		return Response.ok().build();
	}
	
}
