/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaModelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yaman
 */
public class Consultas extends Conexion{
    
    public boolean Autenticacion(String usuario, String contrasena) throws SQLException{
        
        try (Statement st = con.createStatement()) {
            ResultSet rs = null;
            String Consulta = "SELECT * FROM usuarios";
            rs = st.executeQuery(Consulta);
            
            while (rs.next()){
                if (usuario.equals(rs.getString("nickname")) && contrasena.equals(rs.getString("password"))){
                    rs.close();
                    st.close();
                    return true;
                }
            }
            rs.close();
        }
        return false;
    }
    
    public boolean Comprobacion(String nickname, String mail) throws SQLException{
        
        try (Statement st = con.createStatement()) {
            ResultSet rs = null;
            String Consulta = "SELECT * FROM usuarios";
            rs = st.executeQuery(Consulta);
            
            while (rs.next()){
                if (nickname.equals(rs.getString("nickname")) || mail.equals(rs.getString("email"))){
                    rs.close();
                    st.close();
                    return false;
                }
            }
            rs.close();
        }
        return true;
       }
    
    
    public void Registrar(String nickname,String nombre,String apellido, String password, String email, String imagen, String anio,String mes, String dia) throws SQLException{
        
        Statement st;
        String mensaje = "Se dio de alta al Usuario Cliente.";
        if (imagen != null) {
            imagen = "'" + imagen + "'";
            imagen = imagen.replace("\\", "\\\\");
        }
            String fecha = (anio+ "-" + mes + "-" + dia);
            String sqlau = "INSERT INTO help4traveling.usuarios (nickname,nombre,apellido,password,email,imagen,fechaNac) VALUES ('"+nickname + "','" + nombre + "','" + apellido + "','" + password + "','" + email + "'," + imagen + ",'" + fecha + "')";
            System.out.println(sqlau);
            String sqlac = "INSERT INTO help4traveling.clientes (nickname) VALUES ('" + nickname + "')";
            String sqlai = "INS\"INSERT INTO help4traveling.usuarios (nickname,nombre,apellido,password,email,imagen,fechaNac) \"ERT INTO help4traveling.usuariosimagenes (usuario,imagen) VALUES ('" + nickname + "','" + imagen + "')";
            try {
                st = con.createStatement();
                //System.out.println("antes de insertar");
                st.executeUpdate(sqlau);
                st.executeUpdate(sqlac);
                if ((imagen != null) && (!imagen.equals(""))) {
                    //st.executeUpdate(sqlai);
                    con.prepareStatement(sqlai);
                }
                con.close();
                st.close();
                System.out.println("INSERTE :)");
            } catch (SQLException e) {
                mensaje = "ERROR: No se pudo insertar.";
                System.out.println("No pude INSERTAR :(");
                System.out.println(e);
            }
    }     
}
        
