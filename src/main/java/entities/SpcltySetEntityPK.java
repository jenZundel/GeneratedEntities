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
public class SpcltySetEntityPK implements Serializable {
    private int spcltySetIdKey;

    @Id
    @Column(name = "SPCLTY_SET_ID_KEY", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public int getSpcltySetIdKey() {
        return spcltySetIdKey;
    }

    public void setSpcltySetIdKey(int spcltySetIdKey) {
        this.spcltySetIdKey = spcltySetIdKey;
    }

    private int spcltyKey;

    @Id
    @Column(name = "SPCLTY_KEY", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public int getSpcltyKey() {
        return spcltyKey;
    }

    public void setSpcltyKey(int spcltyKey) {
        this.spcltyKey = spcltyKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpcltySetEntityPK that = (SpcltySetEntityPK) o;

        if (spcltyKey != that.spcltyKey) return false;
        if (spcltySetIdKey != that.spcltySetIdKey) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = spcltySetIdKey;
        result = 31 * result + spcltyKey;
        return result;
    }
}
