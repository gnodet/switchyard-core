/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.admin.base;

import org.switchyard.admin.Binding;

/**
 * BaseBinding
 * 
 * Base implementation for {@link Binding}.
 * 
 * @author Rob Cernich
 */
public class BaseBinding implements Binding {

    private final String _type;
    private final String _name;
    private final String _configuration;

    /**
     * Create a new BaseBinding.
     * 
     * @param type the binding's type (e.g. soap)
     * @param name the binding's name
     * @param configuration the binding's raw configuration
     */
    public BaseBinding(String type, String name, String configuration) {
        _type = type;
        _name = name;
        _configuration = configuration;
    }

    @Override
    public String getType() {
        return _type;
    }

    @Override
    public String getConfiguration() {
        return _configuration;
    }

    @Override
    public String getName() {
        return _name;
    }

}
