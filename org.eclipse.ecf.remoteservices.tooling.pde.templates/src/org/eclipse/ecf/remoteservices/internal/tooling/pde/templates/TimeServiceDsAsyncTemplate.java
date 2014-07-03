/*******************************************************************************
 * Copyright (c) 2013 Sakith Indula. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.eclipse.ecf.remoteservices.internal.tooling.pde.templates;

import org.eclipse.core.runtime.IProgressMonitor;

public class TimeServiceDsAsyncTemplate extends TemplateSection {

	public String getSectionId() {

		return "TimeServiceDsAsyncTemplate"; //$NON-NLS-1$
	}

	protected void updateModel(IProgressMonitor monitor) {
		setManifestHeader(
				"Service-Component", "OSGI-INF/timeservicecomponentasync.xml"); //$NON-NLS-1$ //$NON-NLS-2$]
	}

}
