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

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.seanox.AbstractSuite;

/**
 *  TestSuite for {@link com.seanox.common.Text}.<br>
 *  <br>
 *  TextTest 5.0 20180107<br>
 *  Copyright (C) 2018 Seanox Software Solutions<br>
 *  All rights reserved.
 *
 *  @author  Seanox Software Solutions
 *  @version 5.0 20180107
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    TextTest_Decorate.class,
    TextTest_Escape.class,
    TextTest_Phonetic.class,
    TextTest_Replace.class,
    TextTest_SortNatural.class,
    TextTest_Split.class,
    TextTest_Undecorate.class,
    TextTest_Unescape.class,
    TextTest_Trim.class
})
public class TextTest extends AbstractSuite {
}