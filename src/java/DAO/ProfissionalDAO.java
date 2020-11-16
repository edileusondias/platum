package DAO;

import Entidades.Profissional;
import Entidades.Usuario;
import Utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProfissionalDAO {
    
    public static Usuario salvar(Profissional prof) throws Exception{
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement("insert"); // obtem apena uma única informação
            ps.setString(1, prof.getNome());
            ps.setString(2, prof.getMatricula());
            ps.setString(3, prof.getCPF());
            ps.setString(4, prof.getRG());
            //ps.setString(5, da);
           //ps.setString(6, matricula);
            //ps.setString(7, matricula);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Usuario usuario = new Usuario(resultSet.getString("nome"), resultSet.getString("login"), 
                                                resultSet.getString("senha"), resultSet.getInt("tipo_usuario"));
                return usuario;
            }
        }catch(SQLException ex){
            throw new Exception("Erro na execução do SQL - busca de usuário",ex);
        }
        return null;
    

    }
    
    
}


