/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagmentSystem.GeneratorStrategy;

/**
 *
 * @author THinton
 */
public interface GeneratorInterface {
    
   /**
     *<p>Generates a new random ID or Password depending of strategy called </p>
     * @return : New ID for the user
     */
    String Generate();
    
    
}
