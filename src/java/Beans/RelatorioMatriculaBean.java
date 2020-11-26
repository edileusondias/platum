package Beans;

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

@Named(value = "relatorioMatriculaBean")
@ViewScoped
public class RelatorioMatriculaBean implements Serializable {

    /**
     * @return the id
     */
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
     * @return the idTurma
     */
    public String getIdTurma() {
        return idTurma;
    }

    /**
     * @param idTurma the idTurma to set
     */
    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    /**
     * @return the idaluno
     */
    public String getIdaluno() {
        return idaluno;
    }

    /**
     * @param idaluno the idaluno to set
     */
    public void setIdaluno(String idaluno) {
        this.idaluno = idaluno;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    private Integer id;
    private String idTurma;
    private String idaluno;
    private String matricula;
    private String status;
    
     public RelatorioMatriculaBean() {

    }

    @PostConstruct
    public void init() {

    }
    
    public void buscar() {


    }
    
}
