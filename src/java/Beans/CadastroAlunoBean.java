package Beans;

import DAO.AlunoDAO;
import Entidades.Aluno;
import Entidades.Profissional;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

@Named (value = "CadastroAlunoBean")
@ViewScoped
public class CadastroAlunoBean implements Serializable {

    private String cpf;
    private String rg;
    private String nomecompleto;
    private String datadenascimento;
    private String nomeMae;
    private String nomePai;
    private String telefone;
    private String idSexo;
    private String matricula;
    private boolean idStatus;
   
    private List<Aluno> listaDeAlunos; 
    
    public CadastroAlunoBean(){
        // primeiro buscar no banco os elementos que estão no conjunto de alunos.
        try{
            listaDeAlunos = AlunoDAO.buscar();
        }
        catch(Exception ex){
            
        }
    }
    
    @PostConstruct
    public void init() {
    }

    public String salvar(){
         try {
            Aluno.Salvar(new Aluno(getCpf(), getNomecompleto(), getDatadenascimento(), getNomeMae(), getNomePai(), getTelefone(), getIdSexo(), "", getMatricula(), true));
            addMessage("Dados inseridos com sucesso!");
            return "home";
        } catch (Exception ex) {
            addMessage("Dados não inseridos");
            Logger.getLogger(CadastroAlunoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addMessage(String msg) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
        atualizarComponente("msg"); // atualiza o componente de mensagens 
    }
    
    public List<Aluno> getAlunos(){
        return this.listaDeAlunos;
    }

    public void atualizarComponente(String id) {
        RequestContext.getCurrentInstance().update(id);
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
}