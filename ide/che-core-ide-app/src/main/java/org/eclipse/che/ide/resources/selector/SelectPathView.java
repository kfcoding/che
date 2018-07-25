/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which is available at http://www.eclipse.org/legal/epl-2.0.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.resources.selector;

import com.google.inject.ImplementedBy;
import java.util.List;
import org.eclipse.che.ide.api.mvp.View;
import org.eclipse.che.ide.resource.Path;
import org.eclipse.che.ide.ui.smartTree.data.Node;

/** @author Vlad Zhukovskiy */
@ImplementedBy(SelectPathViewImpl.class)
public interface SelectPathView extends View<SelectPathView.ActionDelegate> {

  void setStructure(List<Node> nodes, boolean showFiles);

  void showDialog();

  interface ActionDelegate {
    void onPathSelected(Path path);

    void onSubmit();

    void onCancel();
  }
}
