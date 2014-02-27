/*******************************************************************************
 * Copyright (c) 2014 Pivotal Software, Inc. and others.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 
 * (http://www.eclipse.org/legal/epl-v10.html), and the Eclipse Distribution 
 * License v1.0 (http://www.eclipse.org/org/documents/edl-v10.html). 
 *
 * Contributors:
 *     Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/

package org.springframework.ide.eclipse.beans.ui.livegraph.views;

import org.springframework.ide.eclipse.beans.ui.livegraph.actions.OpenBeanClassAction;
import org.springsource.ide.eclipse.commons.browser.IBrowserToEclipseFunction;

/**
 * @author Miles Parker
 * 
 */
public class OpenBeanFunction implements IBrowserToEclipseFunction {
	
	private static final String UNDEFINED = "undefined";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springsource.ide.eclipse.commons.browser.IBrowserToEclipseFunction
	 * #call(java.lang.String)
	 */
	public void call(String argument) {
		String[] args = argument.split(";");
		for (int i = 0; i < args.length; i++) {
			if (args[i].isEmpty() || UNDEFINED.equals(args[i])) {
				args[i] = null;
			}
		}
		new OpenBeanClassAction().openBean(args[0], args[1], args[2], args[3], args[4]);
	}
}
