/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ItemsTest.ElectronicsTest;

import Bid.Bid;
import Items.Electronics.Cellphones;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Jean-Paul
 */
public class CellphonesTest {
    
    public CellphonesTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCreation() throws Exception {
        Cellphones b = new Cellphones.Builder().id("90").build();
        Assert.assertEquals(b.getID(), "90");
  }

    @Test
    public void testUpdate() throws Exception {
        Cellphones b = new Cellphones.Builder().id("90").build();
        
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}