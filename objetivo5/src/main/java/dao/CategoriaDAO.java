package dao;

import model.Categoria;
import model.Dependente;
import model.Socio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO extends BaseDAO{
    private static Categoria resultSetToCategoria(ResultSet rs) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setId_cat(rs.getLong("id"));
        categoria.setDes_cat(rs.getString("descricao"));
        return categoria;
    }

    public static List<Categoria> selectCategoria() {
        final String sql = "SELECT * FROM categoria";
        try (
                Connection conn = getConnection();
                PreparedStatement ptstmt = conn.prepareStatement(sql);
                ResultSet rs = ptstmt.executeQuery();
        ) {
            List<Categoria> categorias = new ArrayList<>();
            while (rs.next()) {
                categorias.add(resultSetToCategoria(rs));
            }
            return categorias;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static boolean insertNewCategoria(Categoria categoria){
        final String sql = "INSERT INTO categoria (descricao) values (?)";
        try(Connection conn = getConnection();
            PreparedStatement ptstmt = conn.prepareStatement(sql)){
            ptstmt.setString(1, categoria.getDes_cat());


            int count = ptstmt.executeUpdate();

            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void main(String[] args) {

    }
}
