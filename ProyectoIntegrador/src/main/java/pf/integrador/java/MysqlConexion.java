package pf.integrador.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConexion {

	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/trabajo_integrador";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	static {
		try {
			Class.forName(CONTROLADOR);
			System.out.println("Se cargo el controlador correctamente");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
	public static Connection conectar() {
		
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexion con base de datos exitosa");
		} catch(SQLException e) {
			System.out.println("Error al establecer la conexion");
			e.printStackTrace();
		}
		return conexion;
	}
	
}
