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
public class RecgntnSetEntityPK implements Serializable {
    private int recgntnSetIdKey;

    @Id
    @Column(name = "RECGNTN_SET_ID_KEY", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public int getRecgntnSetIdKey() {
        return recgntnSetIdKey;
    }

    public void setRecgntnSetIdKey(int recgntnSetIdKey) {
        this.recgntnSetIdKey = recgntnSetIdKey;
    }

    private int recgntnKey;

    @Id
    @Column(name = "RECGNTN_KEY", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public int getRecgntnKey() {
        return recgntnKey;
    }

    public void setRecgntnKey(int recgntnKey) {
        this.recgntnKey = recgntnKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecgntnSetEntityPK that = (RecgntnSetEntityPK) o;

        if (recgntnKey != that.recgntnKey) return false;
        if (recgntnSetIdKey != that.recgntnSetIdKey) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recgntnSetIdKey;
        result = 31 * result + recgntnKey;
        return result;
    }
}
