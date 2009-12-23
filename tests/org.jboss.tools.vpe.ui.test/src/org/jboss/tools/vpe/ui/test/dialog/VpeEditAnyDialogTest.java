/*******************************************************************************
 * Copyright (c) 2007-2009 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.vpe.ui.test.dialog;

import org.eclipse.ui.PlatformUI;
import org.jboss.tools.vpe.editor.template.VpeAnyData;
import org.jboss.tools.vpe.editor.template.VpeEditAnyDialog;
import org.jboss.tools.vpe.editor.util.Constants;
import org.jboss.tools.vpe.ui.test.VpeTest;

public class VpeEditAnyDialogTest extends VpeTest {

	public VpeEditAnyDialogTest(String name) {
		super(name);
	}
	
	public void testVpeEditAnyDialogOpen() throws Throwable {
		/*
		 * Create empty data
		 */
		VpeAnyData data = new VpeAnyData(Constants.EMPTY, Constants.EMPTY, Constants.EMPTY);
		VpeEditAnyDialog dialog = new VpeEditAnyDialog(PlatformUI
				.getWorkbench().getDisplay().getActiveShell(), data);
		dialog.setBlockOnOpen(false);
		int code = dialog.open();
		/*
		 * Assert that window has been created.
		 */
		assertEquals(0, code);
		
		dialog.close();
		
		/*
		 * Check that the dialog's fields are empty.
		 */
		
		/*
		 * Check the dialog with filled in data.
		 * Dialog should display all the fields correctly.
		 */
		
		/*
		 * Test the editing in the dialog if possible.
		 */
		
		/*
		 * Test dialog validation.
		 */
		
	}

}