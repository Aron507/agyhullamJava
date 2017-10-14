/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsolepes;

/**
 *
 * @author Peter
 */
public class SimpleDotCom {

    int[] ship;
    int numOfHits;
    boolean statusflag = false;

    String checkYourself(String guess) {

        int shot = Integer.parseInt(guess);

        for (int cell : this.ship) {
            if (shot == cell) {
                numOfHits++;
                if(numOfHits >= ship.length){
                    this.statusflag = true;
                    return "kill";
                }
                return "hit";
            }
        }
        return "miss";
    }

    /**
     * Sets the ship[] instance variable to the provided array.
     *
     * @param loc
     */
    void setLocationCells(int[] ship) {

        this.ship = ship;

    }

}
