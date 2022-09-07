package dao;

import model.Dependente;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DependenteDAO extends BaseDAO{
    private static Dependente resultSetToDependente(ResultSet rs) throws SQLException {

        Dependente dependente = new Dependente();
        dependente.setCartao_dep(rs.getLong("id"));
        dependente.setNom_dep(rs.getString("nome"));
        dependente.setParentesco(rs.getString("parentesco"));
        dependente.setEmail_dep(rs.getString("email"));

        return dependente;
    }

    public static List<Dependente> selectDependentes(){
        final String sql = "SELECT * FROM dependente";
        try(Connection conn = getConnection();
            PreparedStatement ptstmt = conn.prepareStatement(sql);
            ResultSet rs = ptstmt.getResultSet();){

            List<Dependente> dependentes = new ArrayList<>();

            while(rs.next()){
                dependentes.add(resultSetToDependente(rs));
            }
            return dependentes;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static Dependente selectDependenteById(Long id){
        final String sql = "SELECT * FROM dependente WHERE id=?";
        try(Connection conn = getConnection();
            PreparedStatement ptstmt = conn.prepareStatement(sql)){
            ptstmt.setLong(1, id);
            ResultSet rs = ptstmt.executeQuery();

            Dependente dependente = null;

            if(rs.next()){
                dependente = resultSetToDependente(rs);
            }
            rs.close();
            return dependente;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Dependente> selectDependenteByName(String name){
        final String sql = "SELECT * FROM dependente WHERE nome LIKE ?";
        try(Connection conn = getConnection();
            PreparedStatement ptstmt = conn.prepareStatement(sql)){
            List<Dependente> dependentes = new ArrayList<>();

            ptstmt.setString(1, name);
            ResultSet rs = ptstmt.executeQuery();

            while(rs.next()){
                dependentes.add(resultSetToDependente(rs));
            }
            return dependentes;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean insertNewDependente(Dependente dependente){
        final String sql = "INSERT INTO dependente (nome, parentesco, email) values (?, ?, ?)";
        try(Connection conn = getConnection();
            PreparedStatement ptstmt = conn.prepareStatement(sql)){
            ptstmt.setString(1, dependente.getNom_dep());
            ptstmt.setString(2, dependente.getParentesco());
            ptstmt.setString(3, dependente.getEmail_dep());

            int count = ptstmt.executeUpdate();

            return count > 0;

        } catch (SQLException e) {
          e.printStackTrace();
          return false;
        }
    }

    public static boolean updateDependente(Dependente dependente){
        final String sql = "UPDATE dependente SET nome = ?, parentesco = ?, email = ?";
        try(Connection conn = getConnection();
            PreparedStatement ptstmt = conn.prepareStatement(sql)){
            ptstmt.setString(1, dependente.getNom_dep() );
            ptstmt.setString(2, dependente.getParentesco() );
            ptstmt.setString(3, dependente.getEmail_dep());

            int count = ptstmt.executeUpdate();;

            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
