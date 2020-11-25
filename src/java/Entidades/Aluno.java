package Entidades;

import java.util.Date;

public class Aluno {
  /* Atributos */
    private Integer id;
    private String cpf;
    private String nomecompleto;
    private Date datadenascimento;
    private String nomeMae;
    private String nomePai;
    private String telefone;
    private Integer idSexo;
    private String email;
    private String matricula;
    private Integer idStatus;
    
    public Aluno (String cpf,  String nomecompleto, Date datanascimento, String nomemae, String nomepai, String telefone, Integer idsexo, String email, String matricula, Integer idstatus) throws Exception {
       setCpf (cpf) ;
       setNomecompleto (nomecompleto) ;
       setDatadenascimento(datanascimento) ;
       setNomeMae (nomemae) ;
       setNomePai (nomepai) ;
       setTelefone (telefone) ;
       setIdSexo (idsexo) ;
       setEmail (email) ;
       setMatricula (matricula) ;
       setIdStatus (idstatus) ;      
    }
    
    public static void Salvar(Aluno aluno) {
        //Chamar AlunoDAO.salvar()
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public Date getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }
}
