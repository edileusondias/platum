package DAO;

import Entidades.Aluno;
import Utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    /* Métodos */
    public static boolean salvar(AlunoDAO aluno) throws Exception {
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement("insert into `platum`.`aluno` id=? cpf=? nome=? datanasc=? nomemae=? nomepai=? sexo=? telefone=? status=?");//FIXME
            ps.setString (1, aluno.getId());
            ps.setString (2, aluno.getNome());
            ps.setString (3, aluno.getCPF());
            ps.setString (4, aluno.getDatanasc());
            ps.setString (5, aluno.getNomepai());
            ps.setString (6, aluno.getSexo());
            ps.setString (7, aluno.getTelefone());
            ps.setString (8, aluno.getStatus());
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException ex) {
            throw new Exception("Erro na execução do SQL - busca de usuário", ex);
    }
        return false;
    }
     public List<Aluno> buscar() throws Exception {
        
        try {
            
            Connection conexao = Conexao.getConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement("select * from aluno");//FIXME            
            ResultSet rs = ps.executeQuery();
            List<Aluno> lista = new ArrayList<Aluno>();
            
            while (ResultSet.next())
            ps.setString (1, aluno.getId());
            ps.setString (2, aluno.getNome());
            ps.setString (3, aluno.getCPF());
            ps.setString (4, aluno.getDatanasc());
            ps.setString (5, aluno.getNomepai());
            ps.setString (6, aluno.getSexo());
            ps.setString (7, aluno.getTelefone());
            ps.setString (8, aluno.getStatus());
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException ex) {
            throw new Exception("Erro na execução do SQL - busca de usuário", ex);
        }
        return false;
    }

    private String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getCPF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getDatanasc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNomepai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSexo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
