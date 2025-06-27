package Modelo;

import static Modelo.Conexion.getConexion;
import java.util.ArrayList;
import java.sql.*;

public class VehiculoDAO {
    public ArrayList<Vehiculo> listarVehiculos(ArrayList<Propietario> propietarios){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection conexion = getConexion();
        String sql = "SELECT * FROM vehiculo ORDER BY id_vehiculo";
        try{
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setIdVehiculo(rs.getInt("id_vehiculo"));
                vehiculo.setPlaca(rs.getString("placa"));
                vehiculo.setMarca(rs.getString("marca"));
                vehiculo.setModelo(rs.getInt("modelo"));
                vehiculo.setTipoVehiculo(rs.getString("tipo_vehiculo"));
                for(Propietario propietario : propietarios){
                    if(propietario.getIdPropietario() == rs.getInt("id_propietario")){
                        vehiculo.setPropietario(propietario);
                    }
                }
                vehiculos.add(vehiculo);
            }
            return vehiculos;
        }catch(Exception e){
            System.err.println("No se pudo listar vehiculos");
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
    
    public boolean agregarVehiculo(Vehiculo vehiculo){
        PreparedStatement ps;
        Connection conexion = getConexion();
        String sql = "INSERT INTO vehiculo (placa, marca, modelo, tipo_vehiculo, id_propietario) VALUES (?, ?, ?, ?, ?)";
        try{
            ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, vehiculo.getPlaca());
            ps.setString(2, vehiculo.getMarca());
            ps.setInt(3, vehiculo.getModelo());
            ps.setString(4, vehiculo.getTipoVehiculo());
            ps.setInt(5, vehiculo.getPropietario().getIdPropietario());
            ps.execute();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int idVehiculo = rs.getInt(1);
                vehiculo.setIdVehiculo(idVehiculo);
            }
            return true;
        }catch(Exception e){
            System.err.println("Error al agregar el vehiculo");
        }
        finally{
            try{
                conexion.close();
            }catch(Exception e){
                System.err.println("Error al cerrar conexión");
            }
        }
        return false;
    }
}
