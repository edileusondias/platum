package DAO;

import Entidades.Aluno;
import Utils.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoDAO {

    /* Métodos */
    public static boolean salvar(AlunoDAO aluno) throws Exception {
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement("  ");//FIXME
            //ps.setString ();
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException ex) {
            throw new Exception("Erro na execução do SQL - busca de usuário", ex);
        }
        return false;
    }
}
