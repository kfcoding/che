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
package org.eclipse.che.api.system.shared.event.service;

import org.eclipse.che.api.system.shared.event.EventType;

/**
 * See {@link EventType#SERVICE_STOPPED} description.
 *
 * @author Yevhenii Voevodin
 */
public class SystemServiceStoppedEvent extends SystemServiceEvent {

  public SystemServiceStoppedEvent(String serviceName) {
    super(serviceName);
  }

  @Override
  public EventType getType() {
    return EventType.SERVICE_STOPPED;
  }
}
