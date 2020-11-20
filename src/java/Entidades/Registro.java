package Entidades;

public class Registro {
    /* Atributos */
    private Integer idSemestre;
    private Integer idDisciplina;
    private Integer idDocente;
    
    public Registro (Integer idsemestre, Integer iddisciplina, Integer iddocente) throws Exception {
       setIdSemestre(idsemestre) ;
       setIdDisciplina (iddisciplina) ;
       setIdDocente (iddocente) ;
    
    }
      /**
     * @return the idSemestre
     */
    public Integer getIdSemestre() {
        return idSemestre;
    }

    /**
     * @param idSemestre the idSemestre to set
     */
    public void setIdSemestre(Integer idSemestre) {
        this.idSemestre = idSemestre;
    }

    /**
     * @return the idDisciplina
     */
    public Integer getIdDisciplina() {
        return idDisciplina;
    }

    /**
     * @param idDisciplina the idDisciplina to set
     */
    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    /**
     * @return the idDocente
     */
    public Integer getIdDocente() {
        return idDocente;
    }

    /**
     * @param idDocente the idDocente to set
     */
    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }
}
