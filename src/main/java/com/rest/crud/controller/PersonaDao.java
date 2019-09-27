package com.rest.crud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.rest.crud.vo.PersonaVo;

public class PersonaDao {

	static HashMap<Integer, PersonaVo> countryIdMap = getCountryIdMap();

	public PersonaDao(){	
		super();		
		if(countryIdMap==null)
		{

			countryIdMap = new HashMap<Integer,PersonaVo>();
			PersonaVo persona1 = new PersonaVo  (1,"Johan Vasques "," Largo",1111);
			PersonaVo persona2 = new PersonaVo  (2,"Luisa","Martinez",23546);
			PersonaVo persona3 = new PersonaVo  (3,"Angela","Lopez",157);			
			countryIdMap.put(1,persona1);
			countryIdMap.put(2,persona2);
			countryIdMap.put(2, persona3);	
		}	
	}

	public List getListaPersonas()
	{		
		List countries= new ArrayList(countryIdMap.values());
		return countries; 
	}	

	public PersonaVo getCountry(int idPersona) {
		PersonaVo country = countryIdMap.get(idPersona);
		return country;
	}	

	public String AgregarPersona(PersonaVo AgregarPersona ) {

		AgregarPersona.setId(countryIdMap.size()+1);
		countryIdMap.put(AgregarPersona.getId(), AgregarPersona);

		String msj="Persona agregada satisfactoriamente";
		msj+= "Nombre"+AgregarPersona.getNombres()+"Apellido"+AgregarPersona.getApellido()+"Documentos"+AgregarPersona.getCedula();

		return msj;

	}	

	public void EliminarPersona(int id) {
		countryIdMap.remove(id);
	}

	public PersonaVo ActualizarPersona(PersonaVo actualizarPersona)
	{		
		if(actualizarPersona.getId()<=0)		
			return null;		
		countryIdMap.put(actualizarPersona.getId(),actualizarPersona);

		return actualizarPersona;
	}

	public static HashMap<Integer, PersonaVo>getCountryIdMap(){
		return countryIdMap;
	}

}
