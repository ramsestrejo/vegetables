/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan.vegetables;

/**
 *
 * @author preetsukh
 */
public class Tomato  extends Vegetable
{
    public Tomato(String name, String colour)
    {
        super(name,colour);
    }
  
    @Override
    public boolean isTasty()
    {
        return true;
    }
    
}
