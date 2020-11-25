package Beans;

import DAO.AlunoDAO;
import Entidades.Aluno;
import Entidades.Profissional;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.context.RequestContext;

@Named (value = "CadastroAlunoBean")
@ViewScoped
public class CadastroAlunoBean implements Serializable {

    /**
     * @return the idsexo
     */
    public Integer getIdsexo() {
        return idsexo;
    }

    /**
     * @param idsexo the idsexo to set
     */
    public void setIdsexo(Integer idsexo) {
        this.idsexo = idsexo;
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

    /**
     * @return the id
     */
       
    private Integer id;
    private String cpf;
    private String nomecompleto;
    private Date datadenascimento;
    private String nomeMae;
    private String nomePai;
    private String telefone;
    private Integer idsexo;
    private String matricula;
    private Integer idStatus;
    private Integer idDisciplina;
    private Integer idCurso;
    private Integer idTurma;
    
    
    /**
     *
     */
    public CadastroAlunoBean(){
    
    }
    
       @PostConstruct
    public void init() {

    }

    public String salvar() {
        Aluno aluno = new Aluno();  
        try {
            AlunoDAO.salvar(aluno);
        } catch (Exception e) {
            addMessage("Aluno cadastrado com Sucesso!");
        }
        return null;
    }

    public void addMessage(String msg) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
        atualizarComponente("msg"); // atualiza o componente de mensagens 
    }

    public void atualizarComponente(String id) {
        RequestContext.getCurrentInstance().update(id);
    }
    
     public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nomecompleto
     */
    public String getNomecompleto() {
        return nomecompleto;
    }

    /**
     * @param nomecompleto the nomecompleto to set
     */
    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    /**
     * @return the datadenascimento
     */
    public Date getDatadenascimento() {
        return datadenascimento;
    }

    /**
     * @param datadenascimento the datadenascimento to set
     */
    public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    /**
     * @return the nomeMae
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     * @return the nomePai
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the idStatus
     */
    public Integer getIdStatus() {
        return idStatus;
    }

    /**
     * @param idStatus the idStatus to set
     */
    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }
}

