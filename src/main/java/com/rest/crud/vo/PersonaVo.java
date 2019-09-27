package com.rest.crud.vo;
public class PersonaVo {	
	private int idPersona;
	private int cedulaPersona; 
	private String nombresPersona;
	private String apellidoPersona;
	
	
	public PersonaVo(int idPersona, String nombresPersona, String apellidoPersona, int cedulaPersona) {
		super();
		this.idPersona = idPersona;
		this.cedulaPersona = cedulaPersona;
		this.nombresPersona = nombresPersona;
		this.apellidoPersona = apellidoPersona;
		
	}	

	public int getId() {
		return idPersona;
	}
	public void setId(int id) {
		this.idPersona = id;
	}
	public String getNombres() {
		return nombresPersona;
	}
	public void setNombres(String nombres) {
		this.nombresPersona = nombres;
	}
	public String getApellido() {
		return apellidoPersona;
	}
	public void setApellido(String apellido) {
		this.apellidoPersona = apellido;
	}
	public int getCedula() {
		return cedulaPersona;
	}
	public void setCedula(int cedula) {
		this.cedulaPersona = cedula;
	}

	
}
