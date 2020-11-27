package Beans;

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

@Named(value = "cadastroProfissionalBean")
@ViewScoped
public class CadastroProfissionalBean implements Serializable {

    private Integer id;
    private String nome;
    private String matricula;
    private String CPF;
    private String RG;
    private Date datanascimento;
    private String nomemae;
    private String sexo;
    private String telefone;
   
    public CadastroProfissionalBean() {

    }

    @PostConstruct
    public void init() {

    }

    public String salvar() {
//        
        try {
            Profissional.Salvar(new Profissional(id, nome, matricula, CPF, RG, datanascimento, nomemae, sexo, telefone));
            addMessage("Dados inseridos com sucesso!");
            return "home";
        } catch (Exception ex) {
            addMessage("Dados não inseridos");
            Logger.getLogger(CadastroProfissionalBean.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
