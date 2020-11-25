package Entidades;

import java.util.Date;


/**
 *
 * @author Cristiane Castilho
 */
public class Frequencia {

    public static void Salvar(Frequencia frequencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /* Atributos */
    private Integer codturma;
    private Integer docente;
    private Integer disciplina;
    private Date data;
            
            
    public Turma (Integer disciplina, Integer semestre, Integer codturma, Integer docente, Date periodo, String buscar) throws Exception {
      setDisciplina (disciplina) ;
      setSemestre (semestre) ;
      setCodturma (codturma) ;
      setDocente (docente) ;
      setPeriodo (periodo) ;
      setBuscar (buscar) ;
      
    
    } 

    private void set(Integer disciplina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
