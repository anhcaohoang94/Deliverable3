/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

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
public class DealerTest {
    
    public DealerTest() {
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
     * Test of showFirstCard method, of class Dealer.
     */
    @Test
    public void testShowFirstCard() {
        System.out.println("showFirstCard");
        Dealer instance = null;
        instance.showFirstCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Hit method, of class Dealer.
     */
    @Test
    public void testHit() {
        System.out.println("Hit");
        Deck deck = null;
        Dealer instance = null;
        instance.Hit(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wantsToHit method, of class Dealer.
     */
    @Test
    public void testWantsToHit() {
        System.out.println("wantsToHit");
        Dealer instance = null;
        boolean expResult = false;
        boolean result = instance.wantsToHit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasBlackJack method, of class Dealer.
     */
    @Test
    public void testHasBlackJack() {
        System.out.println("hasBlackJack");
        Dealer instance = null;
        boolean expResult = false;
        boolean result = instance.hasBlackJack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showHand method, of class Dealer.
     */
    @Test
    public void testShowHand() {
        System.out.println("showHand");
        Dealer instance = null;
        instance.showHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHandValue method, of class Dealer.
     */
    @Test
    public void testGetHandValue() {
        System.out.println("getHandValue");
        Dealer instance = null;
        int expResult = 0;
        int result = instance.getHandValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of busted method, of class Dealer.
     */
    @Test
    public void testBusted() {
        System.out.println("busted");
        int handvalue = 0;
        Dealer instance = null;
        boolean expResult = false;
        boolean result = instance.busted(handvalue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeTurn method, of class Dealer.
     */
    @Test
    public void testTakeTurn() {
        System.out.println("takeTurn");
        Deck deck = null;
        Dealer instance = null;
        int expResult = 0;
        int result = instance.takeTurn(deck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

