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

    public static List<Socio>selectSocios() {
        final String sql = "SELECT * FROM socio ORDER BY id";
        try (
                Connection conn = getConnection();
                PreparedStatement ptstmt = conn.prepareStatement(sql);
                ResultSet rs = ptstmt.getResultSet();
        ) {
            List<Socio> socios = new ArrayList<>();
            while (rs.next()) {
                socios.add(resultSetToSocio(rs));
                System.out.println(socios);
            }
            return socios;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Socio selectSocioById(long id){
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

    public static List<Socio> selectSocioByName(String name) {
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

    public static boolean insertNewSocio(Socio socio){
        final String sql = "INSERT INTO socio (nome, endereco, telefone, email) VALUES (?, ?, ?, ?)";
        try( Connection conn = getConnection();
             PreparedStatement ptstmt = conn.prepareStatement(sql);) {
            ptstmt.setString(1, socio.getNome_socio());
            ptstmt.setString(2, socio.getEnd_socio());
            ptstmt.setString(3, socio.getTel_socio());
            ptstmt.setString(4, socio.getEmail_socio());

            int count = ptstmt.executeUpdate();

            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateSocio(Socio socio){
        final String sql = "UPDATE socio SET nome = ?, endereco = ?, telefone = ?, email = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement ptstmt = conn.prepareStatement(sql)){
            ptstmt.setString(1, socio.getNome_socio());
            ptstmt.setString(2, socio.getEnd_socio());
            ptstmt.setString(3, socio.getTel_socio());
            ptstmt.setString(4, socio.getEmail_socio());
            ptstmt.setLong(5, socio.getCartao_socio());

            int count = ptstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
           e.printStackTrace();
           return false;
        }
    }

    public static void main(String[] args) {
    Socio socio1;
    Socio socio3 = new Socio();
    List<Socio> socio2;
    socio1 = SocioDAO.selectSocioById(1L);
        System.out.println(socio1);
    socio2 = SocioDAO.selectSocioByName("João");
        System.out.println(socio2);
    socio3.setCartao_socio(2L);
    socio3.setNome_socio("Pedro");
    socio3.setEnd_socio("Avenida Bento Gonçalves");
    socio3.setTel_socio("53123456789");
    socio3.setEmail_socio("socio3@socios.com");

    System.out.println(insertNewSocio(socio3));
    System.out.println(selectSocioById(3L));

    socio3.setTel_socio("54123456789");
    System.out.println((updateSocio(socio3)));


}}
