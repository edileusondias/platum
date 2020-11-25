package DAO;

import Entidades.Aluno;
import Utils.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    /* Métodos */
    public static boolean salvar(Aluno aluno) throws Exception {
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement("insert into `platum`.`aluno` cpf=?, nome=?, datanasc=?, nomemae=?, nomepai=?, sexo=?, telefone=?, status=?");

            ps.setString (2, aluno.getNomecompleto());
            ps.setString (1, aluno.getCpf());
            ps.setDate (3, (Date) aluno.getDatadenascimento());
            ps.setString (5, aluno.getNomePai());
            ps.setInt (6, aluno.getIdSexo());
            ps.setString (7, aluno.getTelefone());
            ps.setInt (8, aluno.getIdStatus());
            ps.setString (4, aluno.getNomeMae());
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
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement("select * from aluno");           
            
            List<Aluno> lista = new ArrayList<Aluno>();
            
            ResultSet resultSet = ps.executeQuery();
            
            while (resultSet.next()){
              Aluno aluno = new Aluno(resultSet.getString("cpf"), resultSet.getString("nome"), resultSet.getDate("datanasc"), resultSet.getString("nomemae"), resultSet.getString("datanasc"), resultSet.getString("telefone"), resultSet.getInt("idsexo"), resultSet.getString("email"), resultSet.getString("matricula"), resultSet.getInt("idstatus"));
              lista.add(aluno);
            }
            return lista;
        } catch (SQLException ex) {
            throw new Exception("Erro na execução do SQL - busca de usuário", ex);
        }
    }

}
