/**
 *  LIZENZBEDINGUNGEN - Seanox Software Solutions ist ein Open-Source-Projekt,
 *  im Folgenden Seanox Software Solutions oder kurz Seanox genannt.
 *  Diese Software unterliegt der Version 2 der GNU General Public License.
 *
 *  Seanox Commons, Advanced Programming Interface
 *  Copyright (C) 2017 Seanox Software Solutions
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
import com.seanox.test.utils.ResourceUtils;

/**
 *  Test cases for {@link com.seanox.common.Initialize}.<br>
 *  <br>
 *  InitializeTest_ToString 5.1 20171231<br>
 *  Copyright (C) 2017 Seanox Software Solutions<br>
 *  All rights reserved.
 *
 *  @author  Seanox Software Solutions
 *  @version 5.0 20171231
 */
public class InitializeTest_ToString extends AbstractTest {
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_1() {
        
        Initialize initialize = Initialize.parse(ResourceUtils.getContent());
        Assert.assertEquals(ResourceUtils.getContent("testAcceptance_1_1"), initialize.toString());
    }
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_2() {
        
        Initialize initialize = Initialize.parse(ResourceUtils.getContent());
        Assert.assertEquals(ResourceUtils.getContent("testAcceptance_2_1"), initialize.toString());
    }
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_3() {
        
        Initialize initialize = Initialize.parse(ResourceUtils.getContent());
        Assert.assertEquals(ResourceUtils.getContent("testAcceptance_3_1"), initialize.toString());
    }
    
    /** Test case for acceptance. */
    @Test
    public void testAcceptance_4() {
        
        Initialize initialize = Initialize.parse(ResourceUtils.getContent());
        Assert.assertEquals(ResourceUtils.getContent("testAcceptance_4_1"), initialize.toString());
    }
}