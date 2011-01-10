/*******************************************************************************
 * Copyright (c) 2006, 2010 Spring IDE Developers
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spring IDE Developers - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.beans.ui.editor.namespaces;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.springframework.ide.eclipse.beans.ui.editor.util.BeansEditorUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Default implementation of {@link IReferenceableElementsLocator} that returns
 * every {@link Node} that has an <code>id</code> attribute.
 * @author Christian Dupuis
 * @since 2.0
 */
public class DefaultReferenceableElementsLocator implements
		IReferenceableElementsLocator {

	public Map<String, Node> getReferenceableElements(Document document, IFile file) {
		Map<String, Node> nodes = new HashMap<String, Node>();
		NodeList childNodes = document.getDocumentElement().getChildNodes();

		for (int i = 0; i < childNodes.getLength(); i++) {
			Node node = childNodes.item(i);
			if (BeansEditorUtils.hasAttribute(node, "id")) {
				nodes.put(BeansEditorUtils.getAttribute(node, "id"), node);
			}
			else if (BeansEditorUtils.hasAttribute(node, "alias")) {
				nodes.put(BeansEditorUtils.getAttribute(node, "alias"), node);
			}
		}
		return nodes;
	}
}
