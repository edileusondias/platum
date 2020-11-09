package Entidades;

import DAO.UsuarioDAO;

public class Usuario {
    /* Atributos */
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private Integer tipoUsuario;
    
    public Usuario(String nome, String login,String senha,Integer tipoUsuario) throws Exception{
        setNome(nome);
        setLogin(login);
        setSenha(senha);
        setTipoUsuario(tipoUsuario); 
    }
    
    public static Usuario pesquisarUsuario(String login, String senha) throws Exception {
        return UsuarioDAO.buscar(login,senha);
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if(senha.length()<8)
            throw new Exception("o tamanho da senha deve ser maior ou igual a 8 caracteres");
        else if(senha.contains("12345678"))
            throw new Exception("a senha não pode ser 12345678");
        else
            this.senha = senha;
    }

    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
