package com.shb.rhsso.spi;

import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.user.UserLookupProvider;

public class CoreUserIntegrationProvider
        implements UserStorageProvider, UserLookupProvider, CredentialInputValidator {

    @Override
    public void close() {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean supportsCredentialType(String credentialType) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isConfiguredFor(RealmModel realm, UserModel user, String credentialType) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isValid(RealmModel realm, UserModel user, CredentialInput credentialInput) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public UserModel getUserById(String id, RealmModel realm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserModel getUserByUsername(String username, RealmModel realm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserModel getUserByEmail(String email, RealmModel realm) {
        // TODO Auto-generated method stub
        return null;
    }

}
