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
            //ps = conexao.prepareStatement("insert into aluno SET cpf=?, nome=?, datanasc=?, nomemae=?, nomepai=?, sexo=?, telefone=?, status=?");
            ps = conexao.prepareStatement("insert into aluno(cpf,nome,nomemae,nomepai,sexo,status,telefone,datanasc,mataluno) Values (?, ?, ?,?,?,?,?,?,?)");
            /*// ps = conexao.prepareStatement("select * from alunoyyy");
           
            ps = conexao.prepareStatement("insert into aluno (matAluno) values (?);");
            ps.setInt(1, 4);
            ps.setString (1, "79399924572");
            ps.setString (2, "nome");
            ps.setString (3, "nomemae");
            ps.setString (4, "nomePai");
           // ps.setDate (3, 17/08/1980);
            ps.setString (5, "F");
            //ps.setString (7, aluno.getTelefone());
            ps.setString (6, "A");
            ps.setInt(7, 2);*/
            ps.setString (1, aluno.getCpf());
            ps.setString (2, aluno.getNomecompleto());
            ps.setString (3, aluno.getNomeMae());
            ps.setString (4, aluno.getNomePai());
            ps.setString (5, aluno.getIdSexo());
            ps.setBoolean (6, aluno.getIdStatus());
            ps.setString (7, aluno.getTelefone());
            ps.setString (8, aluno.getDatadenascimento());
            ps.setString (9, aluno.getMatricula());
            
            

            ps.executeUpdate();
            ps.close();
            return true;
            //while (resultSet.next()) {
                //return true;
            //}
        } catch (SQLException ex) {
            throw new Exception("Erro na execução do SQL - busca de usuário", ex);
    }
//        return false;
    }
     public static List<Aluno> buscar() throws Exception {
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement("select * from aluno");           
            
            List<Aluno> lista = new ArrayList<Aluno>();
            
            ResultSet resultSet = ps.executeQuery();
            
            while (resultSet.next()){
                Aluno aluno = new Aluno(resultSet.getString("cpf"), resultSet.getString("nome"), resultSet.getString("datanasc"), resultSet.getString("nomemae"), resultSet.getString("nomepai"), resultSet.getString("telefone"), resultSet.getString("sexo"), "", resultSet.getString("matAluno"), resultSet.getBoolean("status"));
                aluno.setId(resultSet.getInt("id"));
                
                lista.add(aluno);
            }
            return lista;
        } catch (SQLException ex) {
            throw new Exception("Erro na execução do SQL - busca de usuário", ex);
        }
    }

}
