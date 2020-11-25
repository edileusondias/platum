package Entidades;

import java.util.Date;
import java.util.Objects;

public class Aluno {
    
    Aluno aluno;
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the idDisciplina
     */
    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    /**
     * @param idDisciplina the idDisciplina to set
     */
    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    /**
     * @return the idCurso
     */
    public Integer getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * @return the idTurma
     */
    public Integer getIdTurma() {
        return idTurma;
    }

    /**
     * @param idTurma the idTurma to set
     */
    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public static void Salvar(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /* Atributos */
    private Integer id;
    private String cpf;
    private String rg;
    private String nomecompleto;
    private Date datadenascimento;
    private String nomeMae;
    private String nomePai;
    private String telefone;
    private Integer idSexo;
    private String matricula;
    private Integer idStatus;
    private Integer idDisciplina;
    private Integer idCurso;
    private Integer idTurma;
    
    public Aluno (String cpf, String rg, String nomecompleto, Date datanascimento, String nomemae, String nomepai, String telefone, Integer idsexo, String matricula, Integer idstatus, Integer iddisciplina, Integer idcurso, Integer idturma ) throws Exception {
       setCpf (cpf) ;
       setRg (rg) ;
       setNomecompleto (nomecompleto) ;
       setDatadenascimento(datanascimento) ;
       setNomeMae (nomemae) ;
       setNomePai (nomepai) ;
       setTelefone (telefone) ;
       setIdSexo (idsexo) ;
       setMatricula (matricula) ;
       setIdStatus (idstatus) ;   
       setIdDisciplina (iddisciplina) ;
       setIdCurso (idcurso) ;
       setIdTurma (idturma) ;
    }

    public Aluno() {
        
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.aluno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        return true;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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
