package es.rf.tienda.controladores;

import java.sql.ResultSet;
import java.util.List;

import es.rf.tienda.dominio.Categoria;
import es.rf.tienda.util.OracleJDBC;
import es.rf.tienda.vistas.VistaCategoria;

public class ControladorCategoria implements Controlador<Categoria>{
	private VistaCategoria vistaCat;
	OracleJDBC jdbc;
	private static String INSERT_1;
	private static String SELECT_ALL_CATEGORIES ="SELECT * FROM CATEGORIES";
	
	public ControladorCategoria(VistaCategoria vista) {
		vistaCat = vista;
		jdbc = OracleJDBC.getInstance();
	}
	
	public Categoria listOne(Categoria obj) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Categoria> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Categoria> readSQL(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean crear(Categoria obj) {
		INSERT_1 = "INSERT INTO CATEGORIES VALUES('" + obj.getId_categoria() + "','" + obj.getCat_nombre() + "','" + obj.getCat_descripcion() + "')";
		
	/*	System.out.println("Ejecutando desde el controlador:");
		System.out.println("Se recibio el objeto:");
		System.out.println(obj.getId_categoria() + " " + obj.getCat_nombre() + " " + obj.getCat_descripcion());
		*/
		int filas = 0;
		try {
			//filas = jdbc.ejecutar(INSERT_1);
			//filas = jdbc.ejecutar(SELECT_ALL_CATEGORIES);
			ResultSet rs = jdbc.ejecutarQuery(SELECT_ALL_CATEGORIES);
			System.out.println(rs.next());
				while (rs.next()) {
					System.out.println("hola");
				System.out.print(rs.getString("cat_ID") + "\t");
				System.out.print((rs.getString("cat_nombre")+ "						").substring(0,30)
				+ "\t");
				System.out.println(rs.getInt("cat_descripcion"));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Registros afectados: " + filas);
		
		return false;
	}

	
	public boolean actualizar(Categoria obj) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean borrar(Categoria obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
