package Modelo;

import static Modelo.Conexion.getConexion;
import java.util.ArrayList;
import java.sql.*;

public class PropietarioDAO {
    public ArrayList<Propietario> listarPropietarios(){
        ArrayList<Propietario> propietarios = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection conexion = getConexion();
        String sql = "SELECT * FROM propietario ORDER BY id_propietario";
        try{
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Propietario propietario = new Propietario();
                propietario.setIdPropietario(rs.getInt("id_propietario"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setIdentificacion(rs.getString("identificacion"));
                propietario.setCorreo(rs.getString("correo"));
                propietarios.add(propietario);
            }
            return propietarios;
        }catch(Exception e){
            System.err.println("No se pudo listar propietarios");
        }
        
        finally{
            try{
               conexion.close();
            }catch(Exception e){
                System.err.println("No se pudo cerrar la conexión");
            }
        }
        return null;
    }
    
    public boolean agregarPropietario(Propietario propietario){
        PreparedStatement ps;
        Connection conexion = getConexion();
        String sql = "INSERT INTO propietario (nombre, identificacion, correo) VALUES (?, ?, ?)";
        try{
            ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, propietario.getNombre());
            ps.setString(2, propietario.getIdentificacion());
            ps.setString(3, propietario.getCorreo());
            ps.execute();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int idPropietario = rs.getInt(1);
                propietario.setIdPropietario(idPropietario);
            }
            return true;
        }catch(Exception e){
            System.err.println("Error al agregar el propietario");
        }
        finally{
            try{
                conexion.close();
            }catch(Exception e){
                System.err.println("Error al cerrar conexion");
            }
        }
        return false;
    }
}