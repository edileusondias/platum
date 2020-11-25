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
    private String idnometurma;     
            
            
    public Turma (Integer iddisciplina, Integer idsemestre, Integer iddocente, String nometurma) throws Exception {
      setIddisciplina (iddisciplina) ;
      setIdsemestre (idsemestre) ;
      setIddocente (iddocente) ;
      setNometurma (nometurma) ;
 
    } 

    public String getNomeTurma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setNometurma(String nometurma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
