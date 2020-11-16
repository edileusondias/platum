
package Entidades;

public final class Disciplina {
    /* Atributos */
    private Integer id;
    private String codigo;
    private String nome;
    private Integer cargaHoraria;
    
    
    public Disciplina (String nome) throws Exception{
        setNome(nome);
    }

    public Disciplina(int id, String codigo, String nome, Integer cargahoraria) {
        setId(id);
        setCodigo(codigo);
        setNome(nome);
        setCargahoraria (cargahoraria);
    }

    public Disciplina(int aInt, String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
     /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the nome to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

  /**
     * @return the nome
     */
    public Integer getCargahoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargahoraria the nome to set
     */
    public void setCargahoraria(Integer cargahoraria) {
        this.cargaHoraria = cargahoraria;
    }

  
}
