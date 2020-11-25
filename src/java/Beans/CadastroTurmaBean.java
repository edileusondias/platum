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
public class CadastroTurmaBean implements Serializable {

    /**
     * @return the iddisciplina
     */
    public Integer getIddisciplina() {
        return iddisciplina;
    }

    /**
     * @param iddisciplina the iddisciplina to set
     */
    public void setIddisciplina(Integer iddisciplina) {
        this.iddisciplina = iddisciplina;
    }

    /**
     * @return the iddocente
     */
    public Integer getIddocente() {
        return iddocente;
    }

    /**
     * @param iddocente the iddocente to set
     */
    public void setIddocente(Integer iddocente) {
        this.iddocente = iddocente;
    }

    /**
     * @return the idsemestre
     */
    public Integer getIdsemestre() {
        return idsemestre;
    }

    /**
     * @param idsemestre the idsemestre to set
     */
    public void setIdsemestre(Integer idsemestre) {
        this.idsemestre = idsemestre;
    }

    /**
     * @return the idturno
     */
    public Integer getIdturno() {
        return idturno;
    }

    /**
     * @param idturno the idturno to set
     */
    public void setIdturno(Integer idturno) {
        this.idturno = idturno;
    }

    private Integer iddisciplina;
    private Integer iddocente;
    private Integer idsemestre;
    private Integer idturno;
        

    public CadastroTurmaBean() {

}

 @PostConstruct
    public void init() {

    }

    public void salvar() {
//        Turma turma = new Turma();
//        try {
//            Turma.Salvar(turma);
//        } catch (Exception e) {
//        }

    }

    public void addMessage(String msg) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
        atualizarComponente("msg"); // atualiza o componente de mensagens 
    }

    public void atualizarComponente(String id) {
        RequestContext.getCurrentInstance().update(id);
    }
       
}
