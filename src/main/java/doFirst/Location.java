package doFirst;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Cambia
 * User: jen
 * Date: 8/14/12
 * Time: 4:11 PM
 */
@Entity
public class Location {
    @Id
    private long locationId;

    @Column
    private String street1;

    @Column
    private String city;

    @Column
    private String stateCode;

    @Column
    private int zip;

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @OneToMany(mappedBy = "location")
    private Collection<ProviderLocation> providerLocation;

    public Collection<ProviderLocation> getProviderLocation() {
        return providerLocation;
    }

    public void setProviderLocation(Collection<ProviderLocation> providerLocation) {
        this.providerLocation = providerLocation;
    }
}
