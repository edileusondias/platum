package Entidades;

import java.util.Date;

public class Turma {
    /* Atributos */
    private Integer disciplinaId;
    private Integer semestreId;
    private Integer turmaId;
    private Integer docenteId;
            
    public Turma (Integer disciplina, Integer semestre, Integer codturma, Integer docente) throws Exception {
      setDisciplinaId(disciplina) ;
      setSemestreId(semestre) ;
      setTurmaId(codturma) ;
      setDocenteId(docente) ;
      
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

    public Integer getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Integer turmaId) {
        this.turmaId = turmaId;
    }

    public Integer getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }
}
