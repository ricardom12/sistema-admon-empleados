package residencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class sql {
     private static Connection Conexion;
     
     //Conexion con la BD
    public void MySQLConnection(String user, String pass, String db_name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Cerrar conexion a la Base de Datos
    public void closeConnection() {
        try {
            Conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Insertar Datos en Tabla empleado
    public void insertData_registro_empleado(String[] datos) {
        try {
            String Query = "UPDATE empleados set nombre=?, apellido_p=?, apellido_m=?, tipo_puesto=?, direccion=?, num_telefono=?, sexo=?, dias_laborales=?, sueldo=?, sueldo_hrExtra=?, hora_entrada=?, hora_salida=? where id_empleado=?";
            PreparedStatement st = Conexion.prepareStatement(Query);
            st.setString(1,datos[0]);
            st.setString(2,datos[1]);
            st.setString(3,datos[2]);
            st.setString(4,datos[3]);
            st.setString(5,datos[4]);
            st.setString(6,datos[5]);
            st.setString(7,datos[6]);
            st.setString(8,datos[7]);
            st.setString(9,datos[8]);
            st.setString(10,datos[9]);
            st.setString(11,datos[10]);
            st.setString(12,datos[11]);
            st.setString(13,datos[12]);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado registrado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
    //para mostrar datos en tabla
     public ResultSet Listar(String Cad,String user, String pass, String db_name){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
         PreparedStatement da = Conexion.prepareStatement(Cad);
         ResultSet tbl = da.executeQuery();
         return tbl;
     }catch(ClassNotFoundException | SQLException e){
         javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
         return null;
     }
    }
     
     //para actualizar datos
      public static void Actualizar1(String[] datos,String user, String pass, String db_name){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
        String query = "UPDATE empleados set tipo_puesto=?,dias_laborales=?,sueldo=?,hora_entrada=?,"
                + "hora_salida=? WHERE id_empleado=?";
        PreparedStatement da = Conexion.prepareStatement(query);
        da.setString(1,datos[0]);
        da.setString(2,datos[1]);
        da.setString(3,datos[2]);
        da.setString(4,datos[3]);
        da.setString(5,datos[4]);
        da.setString(6,datos[5]);
        da.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        }catch(SQLException e){
         javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
     }  catch (ClassNotFoundException ex) {
            Logger.getLogger(sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      //para eliminar datos
    public static void delete(String[] datos,String user, String pass, String db_name){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
        String query = "DELETE FROM empleados WHERE id_empleado=?";
        PreparedStatement da = Conexion.prepareStatement(query);
        da.setString(1,datos[0]);
        da.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro eliminado");
        }catch(SQLException e){
         javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
     }  catch (ClassNotFoundException ex) {
            Logger.getLogger(sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
