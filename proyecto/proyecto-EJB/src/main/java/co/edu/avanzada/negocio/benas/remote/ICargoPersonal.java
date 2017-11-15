package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.CargoPersonal;

public interface ICargoPersonal {

	public void crearCargoPersonal(CargoPersonal cargoPersonal);
	
	public CargoPersonal buscarCargoPersonal(String idcargoPersonal);
	
	public void editarCargoPersonal(CargoPersonal cargoPersonal);
	
	public void eliminarCargoPersonal(String idcargoPersonal);
	
	public List<CargoPersonal> listarCargoPersonal();

	public List<CargoPersonal> BuscarListaCargoPersonal(String idcargoPersonal);
	
}
