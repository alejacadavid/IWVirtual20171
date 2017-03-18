package co.edu.udea.iw.dto;


/**
 * DTO para la tabla Ciudad
 * @author Maria Alejandra Cadavid Osorio - mariaa.cadavid@udea.edu.co
 * @since Java 1.7
 * @version 1.0
 * 
 */
public class Ciudad {

	/**
	 * Codigo de la ciudad en la base de datos
	 */
	private Long codigo;
	/**
	 * Nombre completo de la ciudad
	 */
	private String nombre;
	/**
	 * Codigo o indicativo para llamadas
	 */
	private String codigoArea;
	
	/**
	 * Devuelve el código de la ciudad
	 * @return Código de la ciudad
	 */
	public Long getCodigo() {
		return codigo;
	}
	/**
	 * Modifca el código de la ciudad
	 * @param codigo
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	/**
	 * Devuelve el nombre de la ciudad
	 * @return Nombre de la ciduad
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Modifica el nombre de la ciudad
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve el código de área o indicativo de la ciudad
	 * @return Código de área o indicativo de la ciudad
	 */
	public String getCodigoArea() {
		return codigoArea;
	}
	/**
	 * Modifica el código de área o indicativo de la ciudad
	 * @param codigoArea
	 */
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	
	
	
	
}
