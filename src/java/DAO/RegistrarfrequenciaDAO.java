package DAO;



import Entidades.Frequencia;
import Entidades.Usuario;
import Utils.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RegistrarfrequenciaDAO {
    
    public static boolean salvar(Frequencia freq) throws Exception{
        Connection conexao = Conexao.getConnection();
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement("insert into `platum`.`turma` idturma=?, idaluno=?, data=?, status=?"); // obtem apena uma única informação
            
            ps.setInteger(1, freq.getTurmaId());
            ps.setInteger(2, freq.getAlunoId());
            ps.setDate(3, (Date) freq.getData());
            ps.setString(4, freq.getStatus());
                        
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
