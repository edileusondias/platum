package Beans;

import Entidades.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "usuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable {
    /* Atributos */
    Usuario usuario;
    
    public UsuarioBean(){
//        usuario = new Usuario();
    }
    
        @PostConstruct
    public void init(){
//        try {
//            usuario = usuarioDAO.buscar(1);
//            if(usuario==null){
//                addMessage("Usuário inexistente!");
//            }         
//        } catch (Exception e) {
//            addMessage(e.getMessage());
//        }
    }
}
