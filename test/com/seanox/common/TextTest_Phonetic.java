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

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

import com.seanox.AbstractTest;

/**
 *  Test cases for {@link com.seanox.common.Text}.<br>
 *  <br>
 *  TextTest_Phonetic 5.0 20180107<br>
 *  Copyright (C) 2018 Seanox Software Solutions<br>
 *  All rights reserved.
 *
 *  @author  Seanox Software Solutions
 *  @version 5.0 20180107
 */
public class TextTest_Phonetic extends AbstractTest {

    /** Test case for acceptance. */
    @Test(expected=NullPointerException.class)
    public void testAcceptance_1() {
        Text.phonetic(null, null);
    }

    /** Test case for acceptance. */
    @Test(expected=IllegalArgumentException.class)
    public void testAcceptance_2() {
        Assert.assertNull(Text.phonetic(null, Locale.US));
        Text.phonetic("", Locale.US);
    }

    /** Test case for acceptance. */
    @Test
    public void testAcceptance_3() {
        
        Assert.assertNull(Text.phonetic(null, Locale.GERMAN));
        Assert.assertNull(Text.phonetic(null, Locale.GERMANY));
        
        Assert.assertEquals("", Text.phonetic("", Locale.GERMAN));
        Assert.assertEquals("", Text.phonetic(" ", Locale.GERMAN));
        Assert.assertEquals("", Text.phonetic("12345", Locale.GERMAN));    

        Assert.assertEquals("328", Text.phonetic("bier", Locale.GERMAN));
        Assert.assertEquals("328", Text.phonetic("bIer", Locale.GERMAN));
        Assert.assertEquals("328", Text.phonetic("BIeR", Locale.GERMAN));
        Assert.assertEquals("328", Text.phonetic("bieeer", Locale.GERMAN));
        Assert.assertEquals("328", Text.phonetic("bbbiiieeehhhr", Locale.GERMAN));        
        Assert.assertEquals("328", Text.phonetic("bihr", Locale.GERMAN));
        Assert.assertEquals("328", Text.phonetic("pihr", Locale.GERMAN));
        Assert.assertEquals("328", Text.phonetic("diher", Locale.GERMAN));
        Assert.assertEquals("328", Text.phonetic("tier", Locale.GERMAN)); 
        Assert.assertEquals("328", Text.phonetic("dir", Locale.GERMAN));  
        Assert.assertEquals("328", Text.phonetic("tür", Locale.GERMAN)); 
        Assert.assertEquals("328", Text.phonetic("bi er", Locale.GERMAN)); 
        Assert.assertEquals("328", Text.phonetic("bi,er", Locale.GERMAN)); 
        Assert.assertEquals("328", Text.phonetic("bi.er", Locale.GERMAN)); 
        Assert.assertEquals("328", Text.phonetic("bi5er", Locale.GERMAN));
    }
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_4() {
        
        Assert.assertEquals("32328173285165", Text.phonetic("peter und der wolf", Locale.GERMAN));
        Assert.assertEquals("32328173285165", Text.phonetic("dieter hund per volf", Locale.GERMAN));
        Assert.assertEquals("32328173284165", Text.phonetic("dieter und der golf", Locale.GERMAN));
    }    
}