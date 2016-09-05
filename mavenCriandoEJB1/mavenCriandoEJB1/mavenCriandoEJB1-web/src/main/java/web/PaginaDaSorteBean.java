/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

/**
 *
 * @author 15105105
 */
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PaginaDaSorteBean {

    @EJB
    private negocio.SorteadorBeanLocal sorteadorBean;
    
    public int getNumero(){
        return sorteadorBean.getNumero();
    }
    
}

