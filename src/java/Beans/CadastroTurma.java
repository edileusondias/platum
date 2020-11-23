package Beans;

import Entidades.Turma;
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

@Named(value = "cadastroTurmaBean")
@ViewScoped
public class CadastroTurma implements Serializable {

    private Integer disciplina;
    private Integer semestre;
    private Integer codturma;
    private Integer docente;
    private Date periodo;
    private String buscar;  

    public CadastroTurma() {

}

 @PostConstruct
    public void init() {

    }

    public void salvar() {

        try {
            
        } catch (Exception e) {
        }

    }

    public void addMessage(String msg) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
        atualizarComponente("msg"); // atualiza o componente de mensagens 
    }

    public void atualizarComponente(String id) {
        RequestContext.getCurrentInstance().update(id);
    }

    /**
     * @return the disciplina
     */
    public Integer getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Integer disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the semestre
     */
    public Integer getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the codturma
     */
    public Integer getCodturma() {
        return codturma;
    }

    /**
     * @param codturma the codturma to set
     */
    public void setCodturma(Integer codturma) {
        this.codturma = codturma;
    }

    /**
     * @return the docente
     */
    public Integer getDocente() {
        return docente;
    }

    /**
     * @param docente the docente to set
     */
    public void setDocente(Integer docente) {
        this.docente = docente;
    }

    /**
     * @return the periodo
     */
    public Date getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the buscar
     */
    public String getBuscar() {
        return buscar;
    }

    /**
     * @param buscar the buscar to set
     */
    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
    
}
