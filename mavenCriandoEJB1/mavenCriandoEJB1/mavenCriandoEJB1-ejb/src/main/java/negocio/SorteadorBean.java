/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Random;
import javax.ejb.Stateless;

/**
 *
 * @author 15105105
 */
@Stateless
public class SorteadorBean implements SorteadorBeanLocal {

    @Override

    public int getNumero() {
        Random r = new Random();
        return r.nextInt(10);
    }

    
}
