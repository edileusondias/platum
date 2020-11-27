package Beans;

import Entidades.Frequencia;
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

@Named(value = "registrarFrequenciaBean")
@ViewScoped
public class RegistrarFrequenciaBean implements Serializable {

    private Integer id;
    private Integer idturma;
    private Integer idaluno;
    private Date data;
    private String status;
   
    public RegistrarFrequenciaBean() {

    }

    @PostConstruct
    public void init() {

    }

    public String salvar() {
  try {
            Frequencia.Salvar(new Frequencia(id,status,data, idturma, idaluno));
            addMessage("Dados inseridos com sucesso!");
            return "home";
        } catch (Exception ex) {
            addMessage("Dados não inseridos");
            Logger.getLogger(RegistrarFrequenciaBean.class.getName()).log(Level.SEVERE, null, ex);
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

    public Integer getidturma() {
        return idturma;
    }

    public void setidturma(Integer idturma) {
        this.idturma = idturma;
    }

    public Integer getidaluno() {
        return idaluno;
    }

    public void setidaluno(Integer idaluno) {
        this.idaluno = idaluno;
    }
    public Date getdata() {
        return data;
    }

    public void setdata(Date data) {
        this.data = data;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

}
