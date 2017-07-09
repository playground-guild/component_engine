package com.test.tg.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/control")
public class ControlResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getControls() {
		return Response.status(200).build();
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getControl(
		@PathParam("id") String controlID) 
	{
		System.err.println("Control: " + controlID);

		return Response.status(200).build();
	}
	
	@Path("/{id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createControl(
		@PathParam("id") String controlID, String body) 
	{
		System.err.println("POST Control: " + controlID);
		System.err.println(body);


		return Response.status(200).build();
	}
	
	@Path("/{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateControl(
		@PathParam("id") String controlID, String body) 
	{
		System.err.println("PUT Control: " + controlID);
		System.err.println(body);


		return Response.status(200).build();
	}
	
	@Path("/{id}")
	@DELETE
	public Response deleteControl(
		@PathParam("id") String controlID) 
	{
		System.err.println("DELETE Control: " + controlID);

		return Response.status(200).build();
	}
}
