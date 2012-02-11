/*
 * Copyright 2003-2007 the original author or authors.
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
package org.codehaus.groovy.groovydoc.element;

import org.codehaus.groovy.groovydoc.element.internal.GroovyClassDoc;
import org.codehaus.groovy.groovydoc.element.internal.GroovyConstructorDoc;

public class SimpleGroovyConstructorDoc extends SimpleGroovyExecutableMemberDoc implements GroovyConstructorDoc {
    public SimpleGroovyConstructorDoc(String name, GroovyClassDoc belongsToClass) {
        super(name, belongsToClass);
    }
}