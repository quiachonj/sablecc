/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.sablecc.core;

import org.sablecc.exception.*;
import org.sablecc.sablecc.core.interfaces.*;
import org.sablecc.sablecc.syntax3.node.*;

public class Group
        implements INamedToken {

    private final AGroup declaration;

    private final Grammar grammar;

    Group(
            AGroup declaration,
            Grammar grammar) {

        if (declaration == null) {
            throw new InternalException("declaration may not be null");
        }

        if (grammar == null) {
            throw new InternalException("grammar may not be null");
        }

        this.declaration = declaration;
        this.grammar = grammar;
    }

    @Override
    public TIdentifier getNameIdentifier() {

        return this.declaration.getName();
    }

    @Override
    public String getName() {

        return getNameIdentifier().getText();
    }

    @Override
    public String getNameType() {

        return "group";
    }

}
