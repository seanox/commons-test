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
 *  TextTest_Undecorate 5.0 20180109<br>
 *  Copyright (C) 2018 Seanox Software Solutions<br>
 *  All rights reserved.
 *
 *  @author  Seanox Software Solutions
 *  @version 5.0 20180109
 */
public class TextTest_Undecorate extends AbstractTest {
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_1() {

        Assert.assertEquals(null, Text.undecorate(null));
        Assert.assertEquals("", Text.undecorate(""));
        Assert.assertEquals(" ", Text.undecorate(" "));
        Assert.assertEquals("  ", Text.undecorate("  "));
    }
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_2() {

        Assert.assertEquals("Abc\00\01\02\03\04\05\06\07xyZ", Text.undecorate("Abc[nUL][SoH][STx][ETX][EOT][ENQ][ACK][BEL]xyZ"));
        Assert.assertEquals("Abc\10\11\12\13\14\15\16\17xyZ", Text.undecorate("Abc[BS][HT][LF][VT][FF][CR][SO][SI]xyZ"));
        Assert.assertEquals("Abc\20\21\22\23\24\25\26\17xyZ", Text.undecorate("Abc[DLE][DC1][DC2][DC3][DC4][NAK][SYN][SI]xyZ"));
        Assert.assertEquals("Abc\30\31\32\33\34\35\36\37xyZ", Text.undecorate("Abc[CAN][EM][SUB][ESC][FS][GS][RS][US]xyZ"));
        Assert.assertEquals("Abc\40\41\42\43\44\45\46\47xyZ", Text.undecorate("Abc !\"#$%&'xyZ"));
    }    
}