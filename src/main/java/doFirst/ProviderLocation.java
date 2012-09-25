package doFirst;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * Cambia
 * User: jen
 * Date: 8/14/12
 * Time: 4:19 PM
 */
@Entity
public class ProviderLocation {

    @Id
    private long providerLocationId;

    @ManyToOne
    private Provider provider;

    @ManyToOne
    private Location location;

    public long getProviderLocationId() {
        return providerLocationId;
    }

    public void setProviderLocationId(long providerLocationId) {
        this.providerLocationId = providerLocationId;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
