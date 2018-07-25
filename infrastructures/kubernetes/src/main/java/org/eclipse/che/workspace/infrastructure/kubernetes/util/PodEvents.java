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
package org.eclipse.che.workspace.infrastructure.kubernetes.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.eclipse.che.workspace.infrastructure.kubernetes.namespace.event.PodEvent;

/**
 * Helps to simplify the interaction with the {@link PodEvent}.
 *
 * @author Ilya Buziuk
 */
public final class PodEvents {
  private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");

  private PodEvents() {}

  /**
   * Converts the time of {@link PodEvent} e.g. '2018-05-15T16:17:54Z' to the {@link Date} format
   */
  public static Date convertEventTimestampToDate(String timestamp) throws ParseException {
    return dateFormat.parse(timestamp);
  }

  /** Converts the {@link Date} to {@link PodEvent} timestamp format e.g. '2018-05-15T16:17:54Z' */
  public static String convertDateToEventTimestamp(Date date) {
    return dateFormat.format(date);
  }
}
