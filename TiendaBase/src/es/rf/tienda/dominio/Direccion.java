package es.rf.tienda.dominio;



public class Direccion {
	private int id_direccion;
	private int id_usuario;
	private String dir_nombre;
	private String dir_direccion;
	private String dir_poblacion;
	private String dir_cPostal;
	private String dir_provincia;
	private String dir_pais;
	private String dir_correoE;
	
	/*public Direccion() {
		dir_nombre = null;
		dir_direccion = null;
		dir_poblacion = null;
		dir_cPostal = null;
		dir_provincia = null;
		dir_pais = null;
		dir_correoE = null;
	}*/
	
	
	public int getId_direccion() {
		return id_direccion;
	}
	public void setId_direccion(int id_direccion) {
		this.id_direccion = id_direccion;
	}
	public int getId_cliente() {
		return id_usuario;
	}
	public void setId_cliente(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	public String getDir_nombre() {
		return dir_nombre;
	}
	public void setDir_nombre(String dir_nombre) {
		this.dir_nombre = dir_nombre;
	}
	public String getDir_direccion() {
		return dir_direccion;
	}
	public void setDir_direccion(String dir_direccion) {
		this.dir_direccion = dir_direccion;
	}
	public String getDir_poblacion() {
		return dir_poblacion;
	}
	public void setDir_poblacion(String dir_poblacion) {
		this.dir_poblacion = dir_poblacion;
	}
	public String getDir_cPostal() {
		return dir_cPostal;
	}
	public void setDir_cPostal(String dir_cPostal) {
		this.dir_cPostal = dir_cPostal;
	}
	public String getDir_provincia() {
		return dir_provincia;
	}
	public void setDir_provincia(String dir_provincia) {
		this.dir_provincia = dir_provincia;
	}
	public String getDir_pais() {
		return dir_pais;
	}
	public void setDir_pais(String dir_pais) {
		this.dir_pais = dir_pais;
	}
	public String getDir_correoE() {
		return dir_correoE;
	}
	public void setDir_correoE(String dir_correoE) {
		this.dir_correoE = dir_correoE;
	}
		
		
		
}
