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

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.seanox.AbstractTest;
import com.seanox.test.utils.Pattern;
import com.seanox.test.utils.ResourceUtils;
import com.seanox.test.utils.TextUtils;

/**
 *  Test cases for {@link com.seanox.common.Text}.<br>
 *  <br>
 *  TextTest_SortNatural 5.0 20180107<br>
 *  Copyright (C) 2018 Seanox Software Solutions<br>
 *  All rights reserved.
 *
 *  @author  Seanox Software Solutions
 *  @version 5.0 20180107
 */
public class TextTest_SortNatural extends AbstractTest {
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_1() {
        
        String content = ResourceUtils.getContent();
        String[] lines = TextUtils.split(content, Pattern.LINE_BREAK);
        lines = Arrays.stream(lines).filter(line -> !line.trim().isEmpty()).toArray(String[]::new);
        
        lines = Text.sortNatural(lines);
        content = String.join(System.lineSeparator(), lines);
        Assert.assertEquals(ResourceUtils.getContent("testAcceptance_1_1"), content);
    }
}