package com.shb.gfep.spi;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

public class CoreUserIntegrationProviderFactory
        implements UserStorageProviderFactory<CoreUserIntegrationProvider> {

    @Override
    public CoreUserIntegrationProvider create(KeycloakSession session, ComponentModel model) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }

}
