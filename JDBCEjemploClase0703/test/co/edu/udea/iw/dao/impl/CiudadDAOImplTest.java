package co.edu.udea.iw.dao.impl;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyException;

/**
 * Implementaqción de la interface {@link CiudadDAO}
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 * @since Java 1.7
 * @version 1.0
 */

public class CiudadDAOImplTest {

	/**
	 * Realiza prueba de la implementación
	 */
	@Test
	public void testGet() {
		CiudadDAO ciudadDao = null;
		List<Ciudad> ciudades = null;
		
		try{
			ciudadDao = new CiudadDAOImpl();
			ciudades = ciudadDao.get();
			
			for(Ciudad ciudad: ciudades){
				System.out.println(ciudad.getCodigo() + ": " +  ciudad.getNombre());
			}
			
			assertTrue(ciudades.size()>0);
		}catch(MyException e){
			fail(e.getMessage());
		}
	}

}
