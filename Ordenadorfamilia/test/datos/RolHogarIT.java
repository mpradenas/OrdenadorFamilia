/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gamalyon
 */
public class RolHogarIT {
    
    public RolHogarIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getObjeto method, of class RolHogar.
     */
    @Test
    public void testGetObjeto() throws Exception {
        System.out.println("getObjeto");
        int id_rol = 0;
        RolHogar instance = null;
        Object expResult = null;
        Object result = instance.getObjeto(id_rol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjeto method, of class RolHogar.
     */
    @Test
    public void testSetObjeto() throws Exception {
        System.out.println("setObjeto");
        ObjRolHogar elRol = null;
        RolHogar instance = null;
        boolean expResult = false;
        boolean result = instance.setObjeto(elRol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteObjeto method, of class RolHogar.
     */
    @Test
    public void testDeleteObjeto() {
        System.out.println("deleteObjeto");
        ObjRolHogar elRol = null;
        RolHogar instance = null;
        boolean expResult = false;
        boolean result = instance.deleteObjeto(elRol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
