package org.brickred.socialauth.android.models;

import org.brickred.socialauth.android.SocialAuthAdapter;

/**
 * Created by fpardo on 2/10/15.
 */
public class SocialCredentials {

    private SocialAuthAdapter.Provider provider;
    private String key;
    private String secret;

    public SocialAuthAdapter.Provider getProvider() {
        return provider;
    }

    public void setProvider(SocialAuthAdapter.Provider provider) {
        this.provider = provider;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
