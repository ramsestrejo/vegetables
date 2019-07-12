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
public class GreenPepper extends Vegetable implements Organic {
    
    private String farm;
    
    public GreenPepper( String name , String colour ) {
        super( name , colour );
    }
    
    public GreenPepper( String name , String colour , String farm ) {
        this( name , colour );
        this.farm = farm;
    }
    
    public boolean isTasty( ) {
        return true;
    }
    
    public String getCertifiedFarmName( ) {
        return farm;
    }
    
}
