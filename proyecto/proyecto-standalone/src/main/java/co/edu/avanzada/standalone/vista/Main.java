package co.edu.avanzada.standalone.vista;

import java.util.Date;

import javax.naming.NamingException;


import co.edu.avanzada.standalone.controlador.*;

import co.edu.avanzada.standalone.controlador.controladorAmbulancia;
import co.edu.avanzada.standalone.controlador.controladorCiudad;
import co.edu.avanzada.standalone.controlador.controladorDepartamento;
import co.edu.avanzada.standalone.controlador.controladorDisponibilidadAmbu;
import co.edu.avanzada.standalone.controlador.controladorEps;
import co.edu.avanzada.standalone.controlador.controladorEspecialidad;
import co.edu.avanzada.standalone.controlador.controladorEstadocivil;
import co.edu.avanzada.standalone.controlador.controladorGenero;
import co.edu.avanzada.standalone.controlador.controladorPersona;
import co.edu.avanzada.standalone.controlador.controladorTipoAmbulancia;
import co.edu.avanzada.standalone.controlador.controladorTipoEvento;
import co.edu.avanzada.standalone.controlador.controladorTipodocumento;
import co.edu.eam.ingesoft.persistencia.entidades.Ambulancia;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;
import co.edu.eam.ingesoft.persistencia.entidades.ReporteUrgencia;
import co.edu.eam.ingesoft.persistencia.entidades.Departamento;
import co.edu.eam.ingesoft.persistencia.entidades.Disponibilidad;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;
import co.edu.eam.ingesoft.persistencia.entidades.Estadocivil;
import co.edu.eam.ingesoft.persistencia.entidades.Funcionario;
import co.edu.eam.ingesoft.persistencia.entidades.Genero;
import co.edu.eam.ingesoft.persistencia.entidades.OperadorPersonal;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;

import co.edu.eam.ingesoft.persistencia.entidades.Urgencia;

import co.edu.eam.ingesoft.persistencia.entidades.TipoAmbulancia;

import co.edu.eam.ingesoft.persistencia.entidades.TipoEvento;
import co.edu.eam.ingesoft.persistencia.entidades.TipoFuncionario;
import co.edu.eam.ingesoft.persistencia.entidades.TipoUrgencia;
import co.edu.eam.ingesoft.persistencia.entidades.Tipodocumento;
import co.edu.eam.ingesoft.persistencia.entidades.Urgencia;
import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaEvento;

public class Main {

	private static controladorPersona controladorpersona;
	private static controladorEps controladoresp;
	private static controladorEstadocivil controladorestadovicil;
	private static controladorGenero controladorgenero;
	private static controladorCiudad controladorciudad;
	private static controladorDepartamento controladordepartemento;
	private static controladorTipodocumento controladortipodocumento;
	private static controladorTipoEvento controladortipoevento;
	private static controladorEspecialidad controladorespecialidad;

	private static controladorFuncionario controladorfuncionario;
	private static controladorTipofuncionario controladortipofuncionario;
	private static controladorOperador controladoroperador;
	private static controladorTipoUrgencia controladortipourgencia;
	private static controladorUrgencia controladorurgencia;
	private static controladorReporteUrgencia controladorreportarurgencia;
	
	
		// TODO Auto-generated method stub
		
		
		


	//DARKLAST
	
	private static controladorAmbulancia controladorambulancia;
	private static controladorDisponibilidadAmbu controladorDispoAmbu;
	private static controladorTipoAmbulancia controladorTipoAmbu;
	 

	public static void main(String[] args) throws NamingException {
		
		// TODO Auto-generated method stub
		
		controladortipodocumento = new controladorTipodocumento();
		controladorpersona = new controladorPersona();
		controladorgenero = new controladorGenero();
		controladoresp = new controladorEps();
		controladorestadovicil = new controladorEstadocivil();
		controladorciudad = new controladorCiudad();
		controladordepartemento = new controladorDepartamento();
		controladortipoevento = new controladorTipoEvento();
		controladorespecialidad = new controladorEspecialidad();
		controladorfuncionario= new controladorFuncionario();
		controladortipofuncionario= new controladorTipofuncionario();
		controladortipourgencia=new controladorTipoUrgencia();
		controladorurgencia=new controladorUrgencia();
		controladorreportarurgencia=new  controladorReporteUrgencia();
		controladoroperador=new controladorOperador();
		
		Especialidad especialidad = new Especialidad("1", "Urología", "Activo");
		controladorespecialidad.crearEspecialidad(especialidad);
		/*
		TipoAmbulancia ambul = new TipoAmbulancia("1", "basica");
				controladorTipoAmbu.crearTipoAmbulancia(ambul);
		
		Disponibilidad dispo = new Disponibilidad("1", "disponible");
		controladorDispoAmbu.crearDisponibilidad(dispo);

		
		// Urgencias

		TipoEvento tipoenvento = new TipoEvento(1, "Accidente de transito");
		controladortipoevento.creaTipoEvento(tipoenvento);
		
	    

		// Departamento
		Departamento departemento = new Departamento("1", "Quindio", "Ciudad milagro");

		// Ciudad
		Ciudad ciudadpersona1 = new Ciudad();
		ciudadpersona1.setIdciudad("1");
		ciudadpersona1.setDepartamento(departemento);
		ciudadpersona1.setDescripcionciudad("Ferias");
		ciudadpersona1.setNombreciudad("Armenia");
		ciudadpersona1.setDepartamento(departemento);

		 Genero 
		Genero genero1 = new Genero();
		genero1.setIdgenero("1");
		genero1.setSexo("M");

		// Eps
		Eps epas = new Eps();
		epas.setIdeps("3");
		epas.setNombre("Valsalud");

		// Estado civil
		Estadocivil estadocivil1 = new Estadocivil();
		estadocivil1.setIdestadocivil("2");
		estadocivil1.setNombreestadocivil("soltero");

		// tipo documento
		Tipodocumento tipodocumentopersona = new Tipodocumento();
		tipodocumentopersona.setIdtipodocumento("1");
		tipodocumentopersona.setNombredocumento("cedula");

		// Persona
		Persona persona1 = new Persona();
		persona1.setIdpersona("1");
		persona1.setNombre("Cristian");
		persona1.setApellido("Hernandez");
		persona1.setNumeroDocumento("1094909543");
		persona1.setEmail("crishernandez08@hotmail.com");
		persona1.setFechanacimiento(new Date());
		persona1.setTelefono(7676666);
		persona1.setCiudadpersona(ciudadpersona1);
		persona1.setGeneropersona(genero1);
		persona1.setCiudadpersona(ciudadpersona1);
		persona1.setEpspersona(epas);
		persona1.setEstadocivilpersona(estadocivil1);
		persona1.setTipodocumentopersona(tipodocumentopersona);

		controladordepartemento.crearDepartamento(departemento);
		controladorciudad.crearCiudad(ciudadpersona1);
		controladoresp.crearEps(epas);
		controladorgenero.crearGenero(genero1);
		controladorestadovicil.crearEstadocivil(estadocivil1);
		controladortipodocumento.creaTipodocumento(tipodocumentopersona);
		controladorpersona.crearPersona(persona1);
		
		TipoFuncionario tipofuncionario=new TipoFuncionario(1,"Auxiliar","Juan");
		controladortipofuncionario.crearTipofuncionario(tipofuncionario);
		
		
		Funcionario funcionario = new Funcionario("1","123",100.1,new Date(),'0',tipofuncionario,persona1);
		controladorfuncionario.crearFuncionario(funcionario);
		
		TipoUrgencia tipourgencia=new TipoUrgencia("1", "Transito");
		controladortipourgencia.creaTipourgencia(tipourgencia);
		
		//urgencia
		/*ReporteUrgencia reporteurgencia=new ReporteUrgencia("Juan","Apellido","1094909543","45454","B/alal 343",2,tipourgencia);
		reporteurgencia.setIdreporteurgencia("2");
		controladorreportarurgencia.crearReporteUrgencia(reporteurgencia);*/
		
		/*OperadorPersonal operadorpersonal=new OperadorPersonal("1", "123121", funcionario);
		controladoroperador.crearOperardorPersona(operadorpersonal);*/
		
		
		/*Urgencia urgencia=new Urgencia("1",new Date(),"Activo",operadorpersonal,reporteurgencia);
		controladorurgencia.crearUrgencia(urgencia);*/
		

		/*controladortipodocumento = new controladorTipodocumento();
		controladorpersona = new controladorPersona();
		controladorgenero = new controladorGenero();
		controladoresp = new controladorEps();
		controladorestadovicil = new controladorEstadocivil();
		controladorciudad = new controladorCiudad();
		controladordepartemento = new controladorDepartamento();
		controladortipoevento = new controladorTipoEvento();
		controladorespecialidad = new controladorEspecialidad();*/
		
		//DARKLAT
		
		controladorambulancia =  new  controladorAmbulancia();
		controladorDispoAmbu = new controladorDisponibilidadAmbu();
		controladorTipoAmbu = new controladorTipoAmbulancia();
		
		
	
		
			//Disponibilidad
			Disponibilidad dispoAmbu = new Disponibilidad();
			dispoAmbu.setIdDisponibilidad("4");
			dispoAmbu.setNombre("Ocupada "); 
			
		
			//TipoAmbulancia
			TipoAmbulancia tipoAmbu = new TipoAmbulancia();
			tipoAmbu.setIdTipoAmbulancia("7");
			tipoAmbu.setNonmbreTipoAmbulancia("medicalizada");
		
			
		
			// Ambulancia
			Ambulancia amb = new Ambulancia();
			amb.setIdambulancia("5");
			amb.setCodigoambulancia("cod2");
			amb.setMarcaambulancia("mazda");
			amb.setPlacaambulancia("NFR71D");
			amb.setDisponibilidadAmbu(dispoAmbu);
			amb.setTipoAmbulancia(tipoAmbu);
	
			controladorTipoAmbu.crearTipoAmbulancia(tipoAmbu);
			controladorDispoAmbu.crearDisponibilidad(dispoAmbu);
			controladorambulancia.crearAmbulancia(amb);
			
	}

}
