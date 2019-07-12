/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan.vegetables;

/**
 *
 * @author ramses
 */
public class GreenPepper extends Vegetable {
    
    public GreenPepper( String name , String colour ) {
        super( name , colour );
    }
    
    public boolean isTasty( ) {
        return true;
    }
    
}
