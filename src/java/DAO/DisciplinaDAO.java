/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Disciplina;
import Utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Regina
 */
public class DisciplinaDAO {
    
        public static List<Disciplina> listar() throws Exception
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        ArrayList<Disciplina> disciplina = new ArrayList<>();
        try{
            ps = conexao.prepareStatement("select * from disciplina"); // obtem apena uma única informação

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int codigo = 0;
                int cargahoraria = 0;
                Disciplina d = new Disciplina (resultSet.getInt("id"), resultSet.getString ("codigo"), resultSet.getString("nome"),resultSet.getInt ("cargahoraria"));
                disciplina.add(d);
            }
        }catch(SQLException ex){
            throw new Exception("Erro na execução do SQL - listar disciplina",ex);
        }
        return disciplina;
    }
    public static boolean salvar(DisciplinaDAO disciplina) throws Exception {
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement("insert into `platum`.`disciplina` iddisciplina=?, nomedisciplina=?, coddisciplina");//FIXME
            ps.setString (1, disciplina.getIddisciplina());
            ps.setString (2, disciplina.getNomedisciplina());
            ps.setString (2, disciplina.getCoddisciplina());
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException ex) {
            throw new Exception("Erro na execução do SQL - busca de usuário", ex);
        }
        return false;
    }    

    private String getIddisciplina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNomedisciplina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getCoddisciplina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
