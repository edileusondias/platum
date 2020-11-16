package Entidades;

import java.util.Date;

/**
 *
 * @author Cristiane Castilho
 */
public class Aluno {
  /* Atributos */
    private Integer id;
    private String cpf;
    private String rg;
    private Date dataemissao;
    private String orgaoemissor;
    private String nomecompleto;
    private Date datadenascimento;
    private String nomeMae;
    private String nomePai;
    private String telefone;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private Integer idSexo;
    private String email;
    private String matricula;
    private Integer idStatus;
    
    public Aluno (String cpf, String rg, Date dataemissao, String orgaoemissor, String nomecompleto, Date datanascimento, String nomemae, String nomepai, String telefone, String cep, String logradouro, String numero, String bairro, Integer idsexo, String email, String matricula, Integer idstatus) throws Exception {
       setCpf (cpf) ;
       setRg (rg) ;
       setDataemissao (dataemissao) ;
       setOrgaoemissor (orgaoemissor) ;
       setNomecompleto (nomecompleto) ;
       setDatadenascimento(datanascimento) ;
       setNomeMae (nomemae) ;
       setNomePai (nomepai) ;
       setTelefone (telefone) ;
       setCep (cep) ;
       setLogradouro (logradouro) ;
       setNumero (numero) ;
       setBairro (bairro) ;
       setIdSexo (idsexo) ;
       setEmail (email) ;
       setMatricula (matricula) ;
       setIdStatus (idstatus) ;      
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the dataemissao
     */
    public Date getDataemissao() {
        return dataemissao;
    }

    /**
     * @param dataemissao the dataemissao to set
     */
    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    /**
     * @return the orgaoemissor
     */
    public String getOrgaoemissor() {
        return orgaoemissor;
    }

    /**
     * @param orgaoemissor the orgaoemissor to set
     */
    public void setOrgaoemissor(String orgaoemissor) {
        this.orgaoemissor = orgaoemissor;
    }

    /**
     * @return the nomecompleto
     */
    public String getNomecompleto() {
        return nomecompleto;
    }

    /**
     * @param nomecompleto the nomecompleto to set
     */
    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    /**
     * @return the datadenascimento
     */
    public Date getDatadenascimento() {
        return datadenascimento;
    }

    /**
     * @param datadenascimento the datadenascimento to set
     */
    public void setDatadenascimento(Date datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    /**
     * @return the nomeMae
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     * @return the nomePai
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the idSexo
     */
    public Integer getIdSexo() {
        return idSexo;
    }

    /**
     * @param idSexo the idSexo to set
     */
    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the idStatus
     */
    public Integer getIdStatus() {
        return idStatus;
    }

    /**
     * @param idStatus the idStatus to set
     */
    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

  
}
