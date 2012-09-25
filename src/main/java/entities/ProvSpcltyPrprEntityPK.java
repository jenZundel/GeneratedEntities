package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Cambia
 * User: jen
 * Date: 8/14/12
 * Time: 3:23 PM
 */
public class ProvSpcltyPrprEntityPK implements Serializable {
    private int provKey;

    @Id
    @Column(name = "PROV_KEY", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public int getProvKey() {
        return provKey;
    }

    public void setProvKey(int provKey) {
        this.provKey = provKey;
    }

    private int locnKey;

    @Id
    @Column(name = "LOCN_KEY", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public int getLocnKey() {
        return locnKey;
    }

    public void setLocnKey(int locnKey) {
        this.locnKey = locnKey;
    }

    private int engnSpcltyKey;

    @Id
    @Column(name = "ENGN_SPCLTY_KEY", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public int getEngnSpcltyKey() {
        return engnSpcltyKey;
    }

    public void setEngnSpcltyKey(int engnSpcltyKey) {
        this.engnSpcltyKey = engnSpcltyKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProvSpcltyPrprEntityPK that = (ProvSpcltyPrprEntityPK) o;

        if (engnSpcltyKey != that.engnSpcltyKey) return false;
        if (locnKey != that.locnKey) return false;
        if (provKey != that.provKey) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = provKey;
        result = 31 * result + locnKey;
        result = 31 * result + engnSpcltyKey;
        return result;
    }
}
