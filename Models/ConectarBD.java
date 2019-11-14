import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;

public class ConectarBD{

    Medico DatosMedico = new Medico();
    Paciente DatosPaciente = new Paciente();
    Citas DatosCitas = new Citas();
    static int IDPaciente = 1, IDMedico = 1;
    //clase que me permite realizar la conexión y las consultas SQL;
    static Connection conn;
    //Java Database Connectivity (JDBC) Permite a un programa en java, conectarse a un sistema manejador de base de datos y generar consultas SQL.
    static final String driver = "com.mysql.jdbc.Driver";
    //Parámetros para entrar al servidor;
    static final String user = "root";
    static final String password = "admin";
    //nombre de la base de datos a conectar;
    static final String url = "jdbc:mysql://localhost/Clinica?useSSL=false";

    public ConectarBD(){
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            //Se avisa de la conexión exitosa
            JOptionPane.showMessageDialog(null,"Se conectó a la base de datos: Clinica","Notificación",JOptionPane.INFORMATION_MESSAGE);
            if(conn != null)
                System.out.println("Se conectó a la base de datos: Clinica");
        }
        //Error en el driver;
        catch(ClassNotFoundException e){
            System.out.println("Error al cargar el controlador.");
            e.printStackTrace();
        }
        //Error de conexión;
        catch(SQLException e){
            System.out.println("No se conectó");
        }
    }
    public Connection getConnection(){
        return conn;
    }
    //Terminar la conexión a BD;
    public void DesConnection(){
        conn = null;
        if(conn == null){
            System.out.println("Terminar conexión");
        }
    }
    public void GuardarRegistros() throws SQLException{
        try{

            PreparedStatement InsertarDatosMedico = conn.prepareStatement("INSERT INTO Medico VALUES(null,?,?,?,?)");
            PreparedStatement InsertarDatosPaciente = conn.prepareStatement("INSERT INTO Paciente VALUES(null,?,?,?,?,?,?)");
            PreparedStatement InsertarDatosCitas = conn.prepareStatement("INSERT INTO Citas VALUES(null,?,?,?,?,?)");

            // Inserto parámetros de medico al comando INSERT INTO;
            InsertarDatosMedico.setString(1, DatosMedico.GetNombreMedico());
            InsertarDatosMedico.setString(2, DatosMedico.GetAPaternoMedico());
            InsertarDatosMedico.setString(3, DatosMedico.GetAMaternoMedico());
            InsertarDatosMedico.setString(4, DatosMedico.GetCorreoMedico());

            // Agrego registro a la tabla Medico en la base de datos;
            InsertarDatosMedico.executeUpdate();

            // Inserto parámetros de paciente al comando INSERT INTO;
            InsertarDatosPaciente.setString(1, DatosPaciente.GetNombrePaciente());
            InsertarDatosPaciente.setString(2, DatosPaciente.GetAPaternoPaciente());
            InsertarDatosPaciente.setString(3, DatosPaciente.GetAMaternoPaciente());            
            InsertarDatosPaciente.setInt(4, DatosPaciente.GetEdadPaciente());
            InsertarDatosPaciente.setString(5, DatosPaciente.GetCorreoPaciente());
            InsertarDatosPaciente.setString(6, DatosPaciente.GetTContacto());
            // Agrego registro a la tabla Paciente en la base de datos;
            InsertarDatosPaciente.executeUpdate();

            // Inserto parámetros de citas al comando INSERT INTO;
            InsertarDatosPaciente.setInt(1, IDMedico);
            InsertarDatosPaciente.setInt(2, IDPaciente);
            InsertarDatosPaciente.setString(3, DatosCitas.GetFecha());
            InsertarDatosPaciente.setString(4, DatosCitas.GetHora());
            InsertarDatosPaciente.setString(5, DatosCitas.GetDescripcion());
            // Agrego registro a la tabla Citas en la base de datos;
            InsertarDomicilio.executeUpdate();

            System.out.println("Un nuevo paciente fue ingresado");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}