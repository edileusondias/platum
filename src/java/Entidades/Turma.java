package Entidades;

import java.util.Date;


public class Turma {
  /* Atributos */
    private Integer disciplinaId;
    private Integer semestreId;
    private Integer turmaId;
    private Integer docenteId;
            
    public Turma (Integer disciplina, Integer semestre, Integer codturma, Integer docente, Date periodo, String buscar) throws Exception {
      setDisciplinaId(disciplina) ;
      setSemestreId(semestre) ;
      setTurmaId(codturma) ;
      setDocenteId(docente) ;
      setPeriodo (periodo) ;
      
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
     * @return the disciplinaId
     */
    public Integer getDisciplinaId() {
        return disciplinaId;
    }

    /**
     * @param disciplinaId the disciplinaId to set
     */
    public void setDisciplinaId(Integer disciplinaId) {
        this.disciplinaId = disciplinaId;
    }

    /**
     * @return the semestreId
     */
    public Integer getSemestreId() {
        return semestreId;
    }

    /**
     * @param semestreId the semestreId to set
     */
    public void setSemestreId(Integer semestreId) {
        this.semestreId = semestreId;
    }

    /**
     * @return the turmaId
     */
    public Integer getTurmaId() {
        return turmaId;
    }

    /**
     * @param turmaId the turmaId to set
     */
    public void setTurmaId(Integer turmaId) {
        this.turmaId = turmaId;
    }

    /**
     * @return the docenteId
     */
    public Integer getDocenteId() {
        return docenteId;
    }

    /**
     * @param docenteId the docenteId to set
     */
    public void setDocenteId(Integer docenteId) {
        this.docenteId = docenteId;
    }
}
