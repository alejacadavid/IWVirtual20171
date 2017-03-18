package co.edu.udea.iw.dao;

import java.util.List;
import co.edu.udea.iw.exception.MyException;
import co.edu.udea.iw.dto.Ciudad;

/**
 * Interface que define los métodos permitidos para las Ciudades en el 
 * sistema
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 * @since Java 1.7
 * @version 1.0
 */

public interface CiudadDAO {
	
	/**
	 * Obtiene la lista de ciudades que existen en el sistema 
	 * ordenadas alfabeticamente por el nombre
	 * @return Lista de ciudades ordenada
	 * @throws MyException ocurre cuando hay un problema con la conexión a la BD
	 */

	public List<Ciudad> get() throws MyException;
	
}
