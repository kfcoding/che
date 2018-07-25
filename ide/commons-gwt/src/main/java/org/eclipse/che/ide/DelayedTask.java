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
package org.eclipse.che.ide;

import com.google.gwt.user.client.Timer;

/**
 * A Timer that is canceled if a new request is made.
 *
 * @author Vlad Zhukovskiy
 */
public abstract class DelayedTask {

  private Timer timer;

  /** Creates a new delayed task. */
  public DelayedTask() {
    timer =
        new Timer() {
          public void run() {
            onExecute();
          }
        };
  }

  /** Cancels the task. */
  public void cancel() {
    timer.cancel();
  }

  /**
   * Cancels any running timers and starts a new one.
   *
   * @param delayMillis the delayMillis in ms
   */
  public void delay(int delayMillis) {
    timer.cancel();
    if (delayMillis > 0) {
      timer.schedule(delayMillis);
    } else {
      timer.run();
    }
  }

  /** Called when the task should execute. */
  public abstract void onExecute();
}
