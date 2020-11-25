package DAO;

import Entidades.Profissional;
import Entidades.Usuario;
import Utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfissionalDAO {
    
    public static boolean salvar(Profissional prof) throws Exception{
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement("insert into `platum`.`profissional` nome=?, matricula=?, cpf=?, rg=?, datanasc=?, nomemae=?, sexo=?, telefone=?"); // obtem apena uma única informação
            ps.setString(1, prof.getNome());
            ps.setString(2, prof.getMatricula());
            ps.setString(3, prof.getCPF());
            ps.setString(4, prof.getRG());
//            ps.setDate(5, prof.getDatanascimento()); //FIXMe
            ps.setString(6, prof.getNomemae());
            ps.setString(7, prof.getSexo());
            ps.setString(8, prof.getTelefone());
            ResultSet resultSet = ps.executeQuery();
             while (resultSet.next()) {
                return true;
            }
        }catch(SQLException ex){
            throw new Exception("Erro na execução do SQL - busca de usuário",ex);
        }
        return false;
    }
}


