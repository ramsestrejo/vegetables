/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheridan.vegetables;

/**
 *
 * @author jade
 */
public class Broccoli extends Vegetable{

    public Broccoli(String name, String colour) {
        super(name, colour);
    }
    @Override
    boolean isTasty() {
        return false;
    }

}
