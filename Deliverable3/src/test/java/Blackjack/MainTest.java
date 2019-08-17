/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author achao
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasBlackJack method, of class Main.
     */
    @Test
    public void testHasBlackJack() {
        System.out.println("hasBlackJack");
        int handValue = 0;
        boolean expResult = false;
        boolean result = Main.hasBlackJack(handValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcHandValue method, of class Main.
     */
    @Test
    public void testCalcHandValue() {
        System.out.println("calcHandValue");
        List<Card> hand = null;
        int expResult = 0;
        int result = Main.calcHandValue(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Bet method, of class Main.
     */
    @Test
    public void testBet() {
        System.out.println("Bet");
        int cash = 0;
        int expResult = 0;
        int result = Main.Bet(cash);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Win method, of class Main.
     */
    @Test
    public void testWin() {
        System.out.println("Win");
        Main.Win();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Lose method, of class Main.
     */
    @Test
    public void testLose() {
        System.out.println("Lose");
        Main.Lose();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Push method, of class Main.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        Main.Push();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hit method, of class Main.
     */
    @Test
    public void testHit() {
        System.out.println("Hit");
        Deck deck = null;
        List<Card> hand = null;
        Main.Hit(deck, hand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHitorStand method, of class Main.
     */
    @Test
    public void testIsHitorStand() {
        System.out.println("isHitorStand");
        String hitter = "";
        boolean expResult = false;
        boolean result = Main.isHitorStand(hitter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBust method, of class Main.
     */
    @Test
    public void testCheckBust() {
        System.out.println("checkBust");
        int handvalue = 0;
        boolean expResult = false;
        boolean result = Main.checkBust(handvalue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isyesorno method, of class Main.
     */
    @Test
    public void testIsyesorno() {
        System.out.println("isyesorno");
        String answer = "";
        boolean expResult = false;
        boolean result = Main.isyesorno(answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fivecardtrick method, of class Main.
     */
    @Test
    public void testFivecardtrick() {
        System.out.println("fivecardtrick");
        Main.fivecardtrick();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

