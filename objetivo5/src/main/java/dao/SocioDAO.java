package dao;

import model.Socio;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SocioDAO extends BaseDAO{

    private static Socio resultSetToSocio(ResultSet rs) throws SQLException {
        Socio socio = new Socio();
        socio.setCartao_socio(rs.getLong("id"));
        socio.setNome_socio(rs.getString("nome"));
        socio.setEnd_socio(rs.getString("endereco"));
        socio.setTel_socio(rs.getString("telefone"));
        socio.setEmail_socio(rs.getString("email"));

        return socio;
    }

    private static List<Socio>selectSocios() {
        final String sql = "SELECT * FROM socio ORDER BY id";
        try (
                Connection conn = getConnection();
                PreparedStatement ptstmt = conn.prepareStatement(sql);
                ResultSet rs = ptstmt.getResultSet();
        ) {
            List<Socio> socios = new ArrayList<>();
            while (rs.next()) {
                socios.add(resultSetToSocio(rs));
            }
            return socios;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Socio selectSocioById(long id){
        final String sql = "SELECT * FROM socio WHERE id=?";
        try(
                Connection conn = getConnection();
                PreparedStatement ptstmt = conn.prepareStatement(sql)
                ) {
            ptstmt.setLong(1, id);
            ResultSet rs = ptstmt.executeQuery();
            Socio socio = null;
            if(rs.next()) {
                socio = resultSetToSocio(rs);
            }
            rs.close();
            return socio;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<Socio> selectSocioByName(String name) {
        final String sql = "SELECT * FROM socio WHERE nome LIKE ?";
        try (
                Connection conn = getConnection();
                PreparedStatement ptstmt = conn.prepareStatement(sql);
        ) {
            ptstmt.setString(1, name);
            ResultSet rs = ptstmt.executeQuery();
            List<Socio> socios = new ArrayList<>();
            while(rs.next()){
                socios.add(resultSetToSocio(rs));
            }
            return socios;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {

    }
}
