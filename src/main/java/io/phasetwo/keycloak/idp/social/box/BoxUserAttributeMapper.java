package io.phasetwo.keycloak.idp.social.box;

import com.google.auto.service.AutoService;
import org.keycloak.broker.oidc.mappers.AbstractJsonUserAttributeMapper;
import org.keycloak.broker.provider.IdentityProviderMapper;

/** */
@AutoService(IdentityProviderMapper.class)
public class BoxUserAttributeMapper extends AbstractJsonUserAttributeMapper {

  public static final String PROVIDER_ID = "box-user-attribute-mapper";
  private static final String[] cp = new String[] {BoxIdentityProviderFactory.PROVIDER_ID};

  @Override
  public String[] getCompatibleProviders() {
    return cp;
  }

  @Override
  public String getId() {
    return PROVIDER_ID;
  }
}
