package Beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value = "homeBean")
@ViewScoped
public class HomeBean implements Serializable{
    
    public HomeBean(){
        
    }
    
    @PostConstruct
    public void init(){
        
    }
    
}
