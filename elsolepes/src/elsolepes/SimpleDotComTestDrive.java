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
public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 3, 4};

        dot.setLocationCells(locations);

        test1(dot);
        test2(dot);
    }
    
    public static void test1(SimpleDotCom dot) {
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        String testResult = "test1:failed";
        if (result.equals("hit")) {
            testResult = "test1:passed";
        }

        System.out.println(testResult);
    }
    
    public static void test2(SimpleDotCom dot) {
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        
        userGuess = "3";
        result = dot.checkYourself(userGuess);
        
        userGuess = "4";
        result = dot.checkYourself(userGuess);

        String testResult = "test2:failed";
        if (result.equals("kill")) {
            testResult = "test2:passed";
        }

        System.out.println(testResult);
    }

}
