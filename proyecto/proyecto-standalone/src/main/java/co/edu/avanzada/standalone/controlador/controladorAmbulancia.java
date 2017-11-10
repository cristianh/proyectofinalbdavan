package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IAmbulancia;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Ambulancia;

public class controladorAmbulancia {

private IAmbulancia iambulancia;
	
	public controladorAmbulancia() throws NamingException{
	iambulancia = (IAmbulancia) ServiceLocator.buscarEJB("AmbulanciaEJB", IAmbulancia.class.getCanonicalName());	
	}
	
	public void crearAmbulancia(Ambulancia ambulancia){
		iambulancia.crearAmbulancia(ambulancia);
	}
	
	public Ambulancia buscarAmbulancia(String idambulancia){
		return iambulancia.buscarAmbulancia(idambulancia);
	}
	
	public void eliminarAmbulancia(String idambulancia){
		iambulancia.eliminarAmbulancia(idambulancia);
	}
	
	public List<Ambulancia> listarAmbulancia(){
		return iambulancia.listarAmbulancia();
	}
	
	
}
