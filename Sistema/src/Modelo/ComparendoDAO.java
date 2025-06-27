package Modelo;

import static Modelo.Conexion.getConexion;
import java.sql.*;
import java.util.ArrayList;

public class ComparendoDAO {
    public ArrayList<Comparendo> listarComparendos(ArrayList<Vehiculo> vehiculos){
        ArrayList<Comparendo> comparendos = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection conexion = getConexion();
        String sql = "SELECT * FROM comparendo ORDER BY id_comparendo";
        try{
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Comparendo comparendo = new Comparendo();
                comparendo.setIdComparendo(rs.getInt("id_comparendo"));
                Time time = rs.getTime("hora");
                comparendo.setHora(new Hora(time.toLocalTime().getHour(), time.toLocalTime().getMinute(), time.toLocalTime().getSecond()));
                comparendo.setTipo(rs.getString("tipo_comparendo"));
                Date date = rs.getDate("fecha");
                comparendo.setFecha(new Fecha(date.toLocalDate().getDayOfMonth(), date.toLocalDate().getMonthValue(), date.toLocalDate().getYear()));
                for(Vehiculo vehiculo : vehiculos){
                    if(vehiculo.getIdVehiculo() == rs.getInt("id_vehiculo")){
                        comparendo.setVehiculo(vehiculo);
                    }
                }
                comparendos.add(comparendo);
            }
            
            return comparendos;
        }catch(Exception e){
            System.err.println("Error al listar comparendos");
        }
        finally{
            try{
                conexion.close();
            }catch(Exception e){
                System.err.println("Error al cerrar la conexión");
            }
        }
        return null;
    }
}
