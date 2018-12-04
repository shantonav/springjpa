package com.example.springjpa.springjpa;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by ssen on 6/22/2017.
 */
public class OprOrderEntityPK implements Serializable {
    private int orderid;
    private int merchantid;

    @Column(name = "ORDERID", nullable = false, precision = 0)
    @Id
    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    @Column(name = "MERCHANTID", nullable = false, precision = 0)
    @Id
    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OprOrderEntityPK that = (OprOrderEntityPK) o;
        return orderid == that.orderid &&
                merchantid == that.merchantid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderid, merchantid);
    }
}
