package Beans;

import DAO.AlunoDAO;
import Entidades.Aluno;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
@Named(value = "alunoBean")
@ViewScoped
public class AlunoBean implements Serializable{
    private List<Aluno> Alunos; 
      
    @PostConstruct
    public void init() {
        try{
            Alunos = AlunoDAO.buscar();
        }
        catch(Exception ex){
            
        }
    }
    
    public AlunoBean(){
        // primeiro buscar no banco os elementos que estão no conjunto de alunos.
        try{
            Alunos = AlunoDAO.buscar();
        }
        catch(Exception ex){
            
        }
    }
    private String aluno;
    public String edit(Aluno aluno) {
        this.setAluno(aluno.getCpf());
        return "editarAluno?faces-redirect=true&includeViewParams=true";

    }

    /**
     * @return the Alunos
     */
    public List<Aluno> getAlunos() {
        return this.Alunos;
    }

    /**
     * @param Alunos the Alunos to set
     */
    public void setAlunos(List<Aluno> Alunos) {
        this.Alunos = Alunos;
    }

    /**
     * @return the aluno
     */
    public String getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
}
