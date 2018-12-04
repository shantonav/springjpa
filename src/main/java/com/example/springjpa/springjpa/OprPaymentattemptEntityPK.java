package com.example.springjpa.springjpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by ssen on 6/20/2017.
 */
public class OprPaymentattemptEntityPK implements Serializable {
    private int merchantid;
    private int orderid;
    private short effortid;
    private short attemptid;

    @Column(name = "MERCHANTID", nullable = false, precision = 0)
    @Id
    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    @Column(name = "ORDERID", nullable = false, precision = 0)
    @Id
    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    @Column(name = "EFFORTID", nullable = false, precision = 0)
    @Id
    public short getEffortid() {
        return effortid;
    }

    public void setEffortid(short effortid) {
        this.effortid = effortid;
    }

    @Column(name = "ATTEMPTID", nullable = false, precision = 0)
    @Id
    public short getAttemptid() {
        return attemptid;
    }

    public void setAttemptid(short attemptid) {
        this.attemptid = attemptid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OprPaymentattemptEntityPK that = (OprPaymentattemptEntityPK) o;
        return merchantid == that.merchantid &&
                orderid == that.orderid &&
                effortid == that.effortid &&
                attemptid == that.attemptid;
    }

    @Override
    public String toString() {
        return "OprPaymentattemptEntityPK{" +
                "merchantid=" + merchantid +
                ", orderid=" + orderid +
                ", effortid=" + effortid +
                ", attemptid=" + attemptid +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(merchantid, orderid, effortid, attemptid);
    }
}
