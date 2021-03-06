/*
 * Copyright 2011-2012 SugarCRM Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License.  You
 * may may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  Please see the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.sugarcrm.voodoodriver;


/**
 * An enumeration of all of valid browser actions.
 *
 * @author trampus
 */

public enum BrowserMethods {
   BROWSER_cssprop,
   BROWSER_cssvalue,
   BROWSER_assertnot,
   BROWSER_url,
   BROWSER_send_keys,
   BROWSER_assertPage,
   BROWSER_exist,
   BROWSER_jscriptevent,
   BROWSER_assert;

   /**
    * Determine whether the provided string is a member of this enum.
    *
    * @param aName  browser method name to check
    * @return {@link Boolean}
    */

   static public boolean isMember(String aName) {
      boolean result = false;
      BrowserMethods[] values = BrowserMethods.values();

      for (BrowserMethods amethod : values) {
         if (amethod.name().equals(aName)) {
            result = true;
            break;
         }
      }

      return result;
   }
}
