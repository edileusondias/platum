package DAO;

import Entidades.Turma;
import Entidades.Usuario;
import Utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TurmaDAO {
    public static boolean salvar(Turma tur) throws Exception{
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement("insert into `platum`.`turma` iddisciplina=?, iddocente=?, idsemestre=?, nometurma=?"); // obtem apena uma única informação
            ps.setInt(1, tur.getIddisciplina());
            ps.setInt(2, tur.getIddocente());
            ps.setInt(3, tur.getIdsemestre());
            ps.setString(4, tur.getNomeTurma());
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
