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
public class VegetableTest {
    
    
    public static void main( String args [ ] ) {
        GreenPepper pepper = new GreenPepper( "pepper" , "green" , "Happy Farm" );
        System.out.println( "I am eating " + pepper.getName( ) + 
                " and it is " + pepper.isTasty( ) + " tasty " + 
                " was grown at " + pepper.getCertifiedFarmName( ) );
    }
}
