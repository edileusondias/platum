package Beans;

import DAO.AlunoDAO;
import Entidades.Aluno;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "editarAlunoBean")
@ViewScoped
public class EditarAlunoBean implements Serializable{
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
    private Aluno aluno;
    
    @PostConstruct
    public void init() {

    }
    
    public EditarAlunoBean(String aluno){
        this.cpf = aluno;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
