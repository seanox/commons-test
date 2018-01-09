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
 *  TextTest_Unescape 5.0 20180107<br>
 *  Copyright (C) 2018 Seanox Software Solutions<br>
 *  All rights reserved.
 *
 *  @author  Seanox Software Solutions
 *  @version 5.0 20180107
 */
public class TextTest_Unescape extends AbstractTest {
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_1() {
        
        Assert.assertNull(Text.unescape(null));
        Assert.assertEquals("", Text.unescape(""));
        Assert.assertEquals(" ", Text.unescape(" "));
        Assert.assertEquals("\00\01\02\07\08\09\0A\0d\u00F0\u00FA\u00FF", Text.unescape("\\000\\001\\002\\007\\0008\\0009\\000A\\000d\\360\\372\\377"));
        Assert.assertEquals("\00\01\02\07\010\011\012\013\014\015\u00F0\u00FA\u00FF", Text.unescape("\\000\\001\\002\\007\\b\\t\\n\\013\\f\\r\\360\\372\\377"));
        Assert.assertEquals("\u00A060\u00C0\07\01\07\01", Text.unescape("\\240\\660\\300\\07\\01\\7\\1"));
        Assert.assertEquals("\u00007\79\\ab\\946", Text.unescape("\\0007\\079\\ab\\9\\646"));
        Assert.assertEquals("\\816\\81", Text.unescape("\\816\\81"));
        Assert.assertEquals("\b\t\n\f\r\"\'\\", Text.unescape("\\b\\t\\n\\f\\r\\\"\\'\\\\"));
    }
}