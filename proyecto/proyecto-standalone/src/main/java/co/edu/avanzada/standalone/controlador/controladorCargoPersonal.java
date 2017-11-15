package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.ICargoPersonal;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.CargoPersonal;

public class controladorCargoPersonal {

private ICargoPersonal icargoPersonal;
	
	public controladorCargoPersonal() throws NamingException{
	icargoPersonal = (ICargoPersonal) ServiceLocator.buscarEJB("CargoPersonalEJB", ICargoPersonal.class.getCanonicalName());	
	}
	
	public void crearCargoPersonal(CargoPersonal cargoPersonal){
		icargoPersonal.crearCargoPersonal(cargoPersonal);
	}
	
	public CargoPersonal buscarCargoPersonal(String idcargoPersonal){
		return icargoPersonal.buscarCargoPersonal(idcargoPersonal);
	}
	
	public void eliminarCargoPersonal(String idcargoPersonal){
		icargoPersonal.eliminarCargoPersonal(idcargoPersonal);
	}
	
	public List<CargoPersonal> listarCargoPersonal(){
		return icargoPersonal.listarCargoPersonal();
	}
	
}
