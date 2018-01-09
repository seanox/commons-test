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
 *  TextTest_Escape 5.0 20180107<br>
 *  Copyright (C) 2018 Seanox Software Solutions<br>
 *  All rights reserved.
 *
 *  @author  Seanox Software Solutions
 *  @version 5.0 20180107
 */
public class TextTest_Escape extends AbstractTest {
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_1() {
        
        Assert.assertNull(Text.escape(null));
        Assert.assertEquals("", Text.escape(""));
        Assert.assertEquals(" ", Text.escape(" "));
        Assert.assertEquals("\\000\\001\\002\\007\\0008\\0009\\000A\\000d\\360\\372\\377", Text.escape("\00\01\02\07\08\09\0A\0d\u00F0\u00FA\u00FF"));
        Assert.assertEquals("\\000\\001\\002\\007\\b\\t\\n\\013\\f\\r\\360\\372\\377", Text.escape("\00\01\02\07\010\011\012\013\014\015\u00F0\u00FA\u00FF"));
        Assert.assertEquals("\\u02A0\\u07B0\\u0AC0\\336", Text.escape("\u02A0\u07B0\u0AC0\u00DE"));
        Assert.assertEquals("\\b\\t\\n\\f\\r\\\"\\'\\\\", Text.escape("\b\t\n\f\r\"\'\\"));
    }
}