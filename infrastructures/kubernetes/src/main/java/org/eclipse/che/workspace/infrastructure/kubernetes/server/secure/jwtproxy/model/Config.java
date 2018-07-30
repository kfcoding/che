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
package org.eclipse.che.workspace.infrastructure.kubernetes.server.secure.jwtproxy.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Config {
    @JsonProperty("jwtproxy")
    private JWTProxy jwtProxy;

    public JWTProxy getJwtProxy() {
        return jwtProxy;
    }

    public void setJwtProxy(
        JWTProxy jwtProxy) {
        this.jwtProxy = jwtProxy;
    }
}
