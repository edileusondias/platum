package Entidades;

import java.util.Date;

public class Turma {

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

    public Turma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void Salvar(Turma turma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /* Atributos */
    private Integer iddisciplina;
    private Integer iddocente;
    private Integer idsemestre;
    private Integer idturno;     
            
            
    public Turma (Integer iddisciplina, Integer idsemestre, Integer iddocente, Integer idturno) throws Exception {
      setIddisciplina (iddisciplina) ;
      setIdsemestre (idsemestre) ;
      setIddocente (iddocente) ;
      setIdturno (idturno) ;
 
    } 
    
    
}
