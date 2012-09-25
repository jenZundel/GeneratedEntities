package doFirst;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Cambia
 * User: jen
 * Date: 8/14/12
 * Time: 4:10 PM
 */
@Entity
public class Provider {
    @Id
    private long providerId;

    @Column
    private String searchableName;

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }

    public String getSearchableName() {
        return searchableName;
    }

    public void setSearchableName(String searchableName) {
        this.searchableName = searchableName;
    }

    @OneToMany
    private Set<ProviderLocation> providerLocations;

    public Set<ProviderLocation> getProviderLocations() {
        return providerLocations;
    }

    public void setProviderLocations(Set<ProviderLocation> providerLocations) {
        this.providerLocations = providerLocations;
    }
}
