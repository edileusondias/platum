/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Curso;
import Entidades.Usuario;
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
public class CursoDAO {
    
        public static List<Curso> listar() throws Exception
    {
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        ArrayList<Curso> cursos = new ArrayList<>();
        try{
            ps = conexao.prepareStatement("select * from curso"); // obtem apena uma única informação

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Curso c = new Curso(resultSet.getInt("id"), resultSet.getString("nome"));
                cursos.add(c);
            }
        }catch(SQLException ex){
            throw new Exception("Erro na execução do SQL - listar cursos",ex);
        }
        return cursos;
    }
}
