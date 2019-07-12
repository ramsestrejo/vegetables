/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan.vegetables;

/**
 *
 * @author wangz
 */
public class Cucumber extends Vegetable{
    
    public Cucumber (String colour, String name){
        super(colour, name);
    }
    
    public boolean isTasty(){
        return true;
    }
}
