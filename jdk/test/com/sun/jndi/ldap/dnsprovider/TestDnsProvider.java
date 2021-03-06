package dnsprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.sun.jndi.ldap.spi.LdapDnsProvider;
import com.sun.jndi.ldap.spi.LdapDnsProviderResult;

public class TestDnsProvider extends LdapDnsProvider {
    @Override
    public Optional<LdapDnsProviderResult> lookupEndpoints(String url,
                                                           Map<?, ?> env)
    {
        List<String> endpoints = new ArrayList<>();
        endpoints.add("ldap://yupyupyup:389");
        return Optional.of(
                new LdapDnsProviderResult("test.com", endpoints));
    }
}
