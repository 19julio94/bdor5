package bdor5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Bdor5 {

    public static Connection conn = null;

    public static void Conexion() throws SQLException {

        String driver = "jdbc:oracle:thin:";
        String host = "localhost.localdomain";
        String porto = "1521";
        String sid = "orcl";
        String usuario = "hr";
        String password = "hr";
        String url = driver + usuario + "/" + password + "@" + host + ":" + porto + ":" + sid;
        conn = DriverManager.getConnection(url);

        if (conn != null) {

            JOptionPane.showMessageDialog(null, "Conexion Establecida");

        } else {

            JOptionPane.showMessageDialog(null, "Fallo de Conexion");

        }

    }

    /*public static void listar() throws SQLException {

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("select * from cliente_tab A where A.direccion.ciudad='Castellon'");


        while (rs.next()) {

           
            java.sql.Struct cli = (java.sql.Struct) rs.getObject(1);
            java.sql.Struct dire = (java.sql.Struct) rs.getObject(2);
            java.sql.Struct tlf = (java.sql.Struct) rs.getObject(3);
            
            Object[] campCli = cli.getAttributes();
            
            java.math.BigDecimal num = (java.math.BigDecimal) campCli[0];
            String nom = (String) campCli[1];

            Object[] camposdirec = dire.getAttributes();

            String cal = (String) camposdirec[0];
            String ciu = (String) camposdirec[1];
            String pr = (String) camposdirec[2];
            String cp = (String) camposdirec[3];

            Object[] campostelf = tlf.getAttributes();
            String telf = (String) campostelf[0];
            
            System.out.println(num+","+nom+","+cal+","+ciu+","+pr +","+cp);
            

        }

    }*/
    
    
    public static void insireLinea(){
    
        PreparedStatement ps = conn.prepareStatement("INSERT INTO ")
    
    
    
    
    
    }

    public static void main(String[] args) throws SQLException {

        Conexion();
        
    }

}
