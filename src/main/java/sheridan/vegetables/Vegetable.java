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
abstract public class Vegetable {
    
    private String name;
    private String colour;
    
    protected Vegetable( String name , String colour ) {
        this.name = name;
        this.colour = colour;
    }
    
    public String getName( ) {
        return name;
    }
    
    abstract boolean isTasty( );
    
}
