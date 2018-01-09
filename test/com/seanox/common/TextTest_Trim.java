/**
 *  LIZENZBEDINGUNGEN - Seanox Software Solutions ist ein Open-Source-Projekt,
 *  im Folgenden Seanox Software Solutions oder kurz Seanox genannt.
 *  Diese Software unterliegt der Version 2 der GNU General Public License.
 *
 *  Seanox Commons, Advanced Programming Interface
 *  Copyright (C) 2018 Seanox Software Solutions
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of version 2 of the GNU General Public License as published
 *  by the Free Software Foundation.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 *  more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package com.seanox.common;

import org.junit.Assert;
import org.junit.Test;

import com.seanox.AbstractTest;

/**
 *  Test cases for {@link com.seanox.common.Text}.<br>
 *  <br>
 *  TextTest_Trim 5.0 20180107<br>
 *  Copyright (C) 2018 Seanox Software Solutions<br>
 *  All rights reserved.
 *
 *  @author  Seanox Software Solutions
 *  @version 5.0 20180107
 */
public class TextTest_Trim extends AbstractTest {
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_1() {
        
        Assert.assertEquals("", Text.trim(null));
        Assert.assertEquals("", Text.trim(""));
        Assert.assertEquals("", Text.trim(" "));
        Assert.assertEquals("", Text.trim("\01\02\03"));
        Assert.assertEquals("A", Text.trim("A"));
        Assert.assertEquals("A", Text.trim(" A"));
        Assert.assertEquals("A", Text.trim("\01\02\03A"));
        Assert.assertEquals("A", Text.trim(" A "));
        Assert.assertEquals("A", Text.trim("\01\02\03A\01"));
    }
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_2() {
        
        Assert.assertEquals("", Text.trim(null, false));
        Assert.assertEquals("", Text.trim("", false));
        Assert.assertEquals("", Text.trim(" ", false));
        Assert.assertEquals("", Text.trim("\01\02\03", false));
        Assert.assertEquals("A", Text.trim("A", false));
        Assert.assertEquals("A", Text.trim(" A", false));
        Assert.assertEquals("A", Text.trim("\01\02\03A", false));
        Assert.assertEquals("A", Text.trim(" A ", false));
        Assert.assertEquals("A", Text.trim("\01\02\03A\01", false));
    }   
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_3() {
        
        Assert.assertNull(Text.trim(null, true));
        Assert.assertNull(Text.trim("", true));
        Assert.assertNull(Text.trim(" ", true));
        Assert.assertNull(Text.trim("\01\02\03", true));
        
        Assert.assertEquals("A", Text.trim("A", true));
        Assert.assertEquals("A", Text.trim(" A", true));
        Assert.assertEquals("A", Text.trim("\01\02\03A", true));
        Assert.assertEquals("A", Text.trim(" A ", true));
        Assert.assertEquals("A", Text.trim("\01\02\03A\01", true));
    }     
}