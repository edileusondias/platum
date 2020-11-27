package Entidades;

import DAO.AlunoDAO;
import java.util.Date;
import java.util.Objects;

public class Aluno {
  /* Atributos */
    private Integer id;
    private String cpf;
    private String nomecompleto;
    private String datadenascimento;
    private String nomeMae;
    private String nomePai;
    private String telefone;
    private String idSexo;
    private String matricula;
    private boolean idStatus;
    private boolean canEdit;
    
    public Aluno (String cpf,  String nomecompleto, String datanascimento, String nomemae, String nomepai, String telefone, String idSexo, String email, String matricula, boolean idstatus) throws Exception {
       setCpf (cpf) ;
       setNomecompleto (nomecompleto) ;
       setDatadenascimento(datanascimento) ;
       setNomeMae (nomemae) ;
       setNomePai (nomepai) ;
       setTelefone (telefone) ;
       setIdSexo (idSexo) ;
       setMatricula (matricula) ;
       setIdStatus (idstatus) ;      
    }
    
    public static boolean Salvar(Aluno aluno) throws Exception {
        
        return AlunoDAO.salvar(aluno);
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
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

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
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
    
    public String getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(String idSexo) {
        this.idSexo = idSexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(boolean idStatus) {
        this.idStatus = idStatus;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}
