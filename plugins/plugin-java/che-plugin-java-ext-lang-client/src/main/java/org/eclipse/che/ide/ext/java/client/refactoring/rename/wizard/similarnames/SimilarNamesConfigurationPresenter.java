/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.ext.java.client.refactoring.rename.wizard.similarnames;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.che.ide.ext.java.client.refactoring.rename.wizard.similarnames.SimilarNamesConfigurationView.ActionDelegate;
import org.eclipse.che.jdt.ls.extension.api.MatchStrategy;

/**
 * The class that manages similar name value.
 *
 * @author Valeriy Svydenko
 */
@Singleton
public class SimilarNamesConfigurationPresenter implements ActionDelegate {
  private final SimilarNamesConfigurationView view;

  @Inject
  public SimilarNamesConfigurationPresenter(SimilarNamesConfigurationView view) {
    this.view = view;
    this.view.setDelegate(this);
  }

  /** Show Move panel with the special information. */
  public void show() {
    view.showDialog();
  }

  /** @return selected value of match strategy. */
  public MatchStrategy getMatchStrategy() {
    return view.getMatchStrategy();
  }
}
