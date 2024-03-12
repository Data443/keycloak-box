package io.phasetwo.keycloak.idp.social.box;

import com.google.auto.service.AutoService;
import org.keycloak.broker.oidc.OAuth2IdentityProviderConfig;
import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;

/** */
@AutoService(SocialIdentityProviderFactory.class)
public class BoxIdentityProviderFactory
    extends AbstractIdentityProviderFactory<BoxIdentityProvider>
    implements SocialIdentityProviderFactory<BoxIdentityProvider> {

  public static final String PROVIDER_ID = "box";

  @Override
  public String getName() {
    return "Box";
  }

  @Override
  public BoxIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
    return new BoxIdentityProvider(session, new OAuth2IdentityProviderConfig(model));
  }

  @Override
  public OAuth2IdentityProviderConfig createConfig() {
    return new OAuth2IdentityProviderConfig();
  }

  @Override
  public String getId() {
    return PROVIDER_ID;
  }
}
