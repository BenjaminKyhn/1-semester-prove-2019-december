package Quiz;

import javafx.collections.FXCollections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBController {
    public Connection getConnection() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quiz?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "CodeWarrior8");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Sporgsmaal getSporgsmaal() {
        Sporgsmaal sporgsmaal = new Sporgsmaal();
        Connection connection = getConnection();
        String query = "SELECT sporgsmaalstekst FROM sporgsmaal WHERE ID=1";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                sporgsmaal.setSporgsmaal(rs.getString("sporgsmaalstekst"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sporgsmaal;
    }

    public ArrayList<Svar> getSvarMuligheder() {
        ArrayList<Svar> svarMuligheder= new ArrayList<>();
        Connection connection = getConnection();
        String query = "SELECT svartekst FROM svar";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Svar svar;
            while (rs.next()) {
                svar = new Svar(rs.getString("svartekst"));
                svarMuligheder.add(svar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return svarMuligheder;
    }
}
