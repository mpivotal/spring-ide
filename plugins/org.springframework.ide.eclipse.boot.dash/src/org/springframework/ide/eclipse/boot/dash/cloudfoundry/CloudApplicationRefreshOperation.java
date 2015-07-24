/*******************************************************************************
 * Copyright (c) 2015 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.springframework.ide.eclipse.boot.dash.cloudfoundry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cloudfoundry.client.lib.domain.CloudApplication;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.springframework.ide.eclipse.boot.dash.BootDashActivator;
import org.springframework.ide.eclipse.boot.dash.model.Operation;

final class CloudApplicationRefreshOperation extends Operation<Void> {
	/**
	 *
	 */
	private final CloudFoundryBootDashModel model;

	CloudApplicationRefreshOperation(CloudFoundryBootDashModel model) {
		super("Refreshing list of Cloud applications for: " + model.getRunTarget().getName());
		this.model = model;
	}

	@Override
	protected synchronized Void runOp(IProgressMonitor monitor) throws Exception {
		try {

			List<CloudApplication> apps = this.model.getCloudTarget().getClient().getApplications();
			Map<CloudApplication, IProject> updatedApplications = new HashMap<CloudApplication, IProject>();

			if (apps != null) {

				Map<String, String> existingProjectToAppMappings = this.model.getProjectToAppMappingStore()
						.getMapping();

				for (CloudApplication app : apps) {

					String projectName = existingProjectToAppMappings.get(app.getName());
					IProject project = null;
					if (projectName != null) {
						project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
						if (project == null || !project.isAccessible()) {
							project = null;
						}
					}

					updatedApplications.put(app, project);
				}
			}

			this.model.replaceElements(updatedApplications);

		} catch (Exception e) {
			BootDashActivator.log(e);
		}
		return null;
	}

	public ISchedulingRule getSchedulingRule() {
		return new RefreshSchedulingRule(model.getRunTarget());
	}
}