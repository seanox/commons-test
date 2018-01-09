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
 *  TextTest_Replace 5.0 20180109<br>
 *  Copyright (C) 2018 Seanox Software Solutions<br>
 *  All rights reserved.
 *
 *  @author  Seanox Software Solutions
 *  @version 5.0 20180109
 */
public class TextTest_Replace extends AbstractTest {
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_1() {
        
        Assert.assertNull(Text.replace(null, null, null));
        Assert.assertNull(Text.replace(null, "", null));
        Assert.assertNull(Text.replace(null, null, ""));
        Assert.assertNull(Text.replace(null, "", ""));

        Assert.assertEquals(" ", Text.replace(" ", null, null));
        Assert.assertEquals(" ", Text.replace(" ", "", null));
        Assert.assertEquals(" ", Text.replace(" ", null, ""));
        Assert.assertEquals(" ", Text.replace(" ", "", ""));
    }
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_2() {
        
        Assert.assertEquals("aaabbbbbbccc", Text.replace("aaabbbccc", "b", "bb"));
        Assert.assertEquals("aaabBbBbBccc", Text.replace("aaabbbccc", "B", "bB"));
        Assert.assertEquals("aaaccc", Text.replace("aaabbbccc", "B", ""));
        Assert.assertEquals("aaabbbccc", Text.replace("aaabbbccc", "B", null));
        Assert.assertEquals("aaabbbccc", Text.replace("aaabbbccc", "", "B"));
        Assert.assertEquals("aaabbbccc", Text.replace("aaabbbccc", null, "B"));
        Assert.assertEquals("aaabbbccc", Text.replace("aaabbbccc", "b", "b"));
        Assert.assertEquals("aaaBBBccc", Text.replace("aaabbbccc", "b", "B"));
        Assert.assertEquals("aaabbbccc", Text.replace("aaabbbccc", "B", "b"));
        Assert.assertEquals("aaabbbccc", Text.replace("aaabbbccc", "x", "b"));
    }   
}