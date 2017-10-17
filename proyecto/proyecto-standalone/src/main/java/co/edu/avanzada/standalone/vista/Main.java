package co.edu.avanzada.standalone.vista;

import java.util.Date;

import javax.naming.NamingException;

import co.edu.avanzada.standalone.controlador.controladorEps;
import co.edu.avanzada.standalone.controlador.controladorEstadocivil;
import co.edu.avanzada.standalone.controlador.controladorPersona;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;
import co.edu.eam.ingesoft.persistencia.entidades.Departamento;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Estadocivil;
import co.edu.eam.ingesoft.persistencia.entidades.Genero;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;

public class Main {

	//private static controladorPersona controladorpersona;

	private static controladorEps controladoresp;
	private static controladorEstadocivil controladorestadovicil;

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub

		//controladorpersona=new controladorPersona();
		

		

		controladoresp = new controladorEps();
		controladorestadovicil = new controladorEstadocivil();
		/*Eps epas = new Eps();
		epas.setIdeps("3");
		epas.setNombre("Valsalud");
		controladoresp.crearEps(epas);*/
		System.out.println(controladoresp.buscarEps("3"));
		
		Estadocivil estadocivil1= new Estadocivil(); 
		estadocivil1.setIdestadocivil("1");
		estadocivil1.setNombreestadocivil("casado");
		
		controladorestadovicil.crearEstadocivil(estadocivil1);

		/*
		 * Departamento departemento=new Departamento(1, "Quindio",
		 * "Ciudad milagro"); Ciudad ciudadpersona1=new Ciudad();
		 * ciudadpersona1.setIdciudad(1);
		 * ciudadpersona1.setDepartamento(departemento);
		 * ciudadpersona1.setDescripcionciudad("Ferias");
		 * ciudadpersona1.setNombreciudad("Armenia");
		 * 
		 * Genero genero1=new Genero(); genero1.setIdgenero(1);
		 * genero1.setSexo((char) 1); Estadocivil estadocivil1= new
		 * Estadocivil(); estadocivil1.setIdestadocivil(1);
		 * estadocivil1.setNombreestadocivil("casado");
		 * 
		 * 
		 * 
		 * 
		 * Persona persona1=new Persona(); persona1.setId_persona(1);
		 * persona1.setNombre("Cristian"); persona1.setApellido("Hernandez");
		 * persona1.setNumeroDocumento("1094909543");
		 * persona1.setEmail("crishernandez08@hotmail.com");
		 * persona1.setFechanacimiento(new Date());
		 * persona1.setTelefono(7676666);
		 * persona1.setCiudadpersona(ciudadpersona1);*7
		 * /*persona1.setGeneropersona(genero1);
		 * persona1.setCiudadpersona(ciudadpersona1);
		 * persona1.setEpspersona(epas);
		 * persona1.setEstadocivilpersona(estadocivil1);
		 */

		// controladorpersona.crearCliente(persona1);
	}

}
