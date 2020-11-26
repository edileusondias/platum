package Entidades;

import DAO.TurmaDAO;
import java.util.Date;

public class Turma {
    /* Atributos */
    private Integer disciplinaId;
    private Integer semestreId;
    private Integer docenteId;
    private String nomeTurma;
   
           
     public Turma (Integer iddisciplina, Integer iddocente, Integer idsemestre, String nometurma){
       
        this.disciplinaId = iddisciplina;
        this.docenteId = iddocente;
        this.semestreId = idsemestre;
        this.nomeTurma = nometurma;
    }
   
     public static void Salvar(Turma turma) throws Exception {
        TurmaDAO.salvar(turma);
    }

    public Integer getDisciplinaId() {
        return disciplinaId;
    }

    public void setDisciplinaId(Integer disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    public Integer getSemestreId() {
        return semestreId;
    }

    public void setSemestreId(Integer semestreId) {
        this.semestreId = semestreId;
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
}