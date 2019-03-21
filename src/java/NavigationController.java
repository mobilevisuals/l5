/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Admin
 */
@Named(value = "navigationController")
@SessionScoped
public class NavigationController implements Serializable {

    private boolean navigate;
    /**
     * Creates a new instance of NavigationController
     */
    public NavigationController() {
    }
    
    public String page2()
    {return "page2";}
    
    public void randomize()
    {Random rand=new Random();
       navigate=rand.nextBoolean();
       
    }

    public boolean isNavigate() {
        return navigate;
    }

    public void setNavigate(boolean navigate) {
        this.navigate = navigate;
    }


    
}
