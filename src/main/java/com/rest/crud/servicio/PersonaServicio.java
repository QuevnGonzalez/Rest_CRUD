package com.rest.crud.servicio;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.crud.controller.PersonaDao;
import com.rest.crud.vo.PersonaVo;

@Path("/personas")

public class PersonaServicio {

	PersonaVo  miPersonaVO;
	PersonaDao miDao;	

	public PersonaServicio() {
		miDao=new PersonaDao();
	}


	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)	

	public PersonaVo getCountryById(@PathParam("id")int id) 
	{
		return miDao.getCountry(id);
	}

	@GET	
	@Produces(MediaType.APPLICATION_JSON)	
	public List getCountries() 
	{
		List listOfCountries=miDao.getListaPersonas();
		return listOfCountries;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public String AgregarPersona() 
	{				
		return miDao.AgregarPersona(miPersonaVO);	
	}


	@DELETE
	@Path("/({id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void EliminarPersona(@PathParam("id")int id) 
	{
		miDao.EliminarPersona(id);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public PersonaVo ActualizarPersona()
	{
		return miDao.ActualizarPersona(miPersonaVO);
	}
}
