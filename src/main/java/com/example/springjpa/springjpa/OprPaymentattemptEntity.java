package com.example.springjpa.springjpa;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Date;
import java.util.Objects;

/**
 * Created by ssen on 6/20/2017.
 */
@Entity
@Table(name = "OPR_PAYMENTATTEMPT", schema = "EPS", catalog = "")
@IdClass(OprPaymentattemptEntityPK.class)
public class OprPaymentattemptEntity {
    private int merchantid;
    private int orderid;
    private short effortid;
    private short attemptid;
    private Date statusdate;
    private String paymentreference;
    private String additionalreference;
    private Date receiveddate;
    private String contractid;
    private Long amount;
    private Short feedbackstatus;
    private String julianyear;
    private String julianday;
    private Long batchnumber;
    private Date senddate;
    private String onlineauthoriserid;
    private String creditdebitindicator;
    private Long amountreceived;
    private String countrycode;
    private String requestsource;
    private String reference;
    private Long paymentamount;
    private String paymentcurrencycode;
    private Date paymentdate;
    private String mac;
    private String bankmac;
    private String returnmac;
    private String hostedindicator;
    private String returnurl;
    private Short requestpaymentproductid;
    private Short statusId;
    private String requestcountrycode;
    private Short e4Xfeedbackstatus;
    private Short inprocessflag;
    private Short acceptneededindicator;
    private Boolean partialpaymentindicator;
    private Long requestamount;
    private String referenceorigpayment;
    private OprOrderEntity oprOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="merchantid", referencedColumnName="merchantid",insertable = false,updatable = false),
            @JoinColumn(name="orderid", referencedColumnName="orderid",insertable = false, updatable = false)
    })
    public OprOrderEntity getOprOrder() {
        return oprOrder;
    }

    public void setOprOrder(OprOrderEntity oprOrder) {
        this.oprOrder = oprOrder;
    }

    @Id
    @Column(name = "MERCHANTID", nullable = false, precision = 0)
    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    @Id
    @Column(name = "ORDERID", nullable = false, precision = 0)
    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    @Id
    @Column(name = "EFFORTID", nullable = false, precision = 0)
    public short getEffortid() {
        return effortid;
    }

    public void setEffortid(short effortid) {
        this.effortid = effortid;
    }

    @Id
    @Column(name = "ATTEMPTID", nullable = false, precision = 0)
    public short getAttemptid() {
        return attemptid;
    }

    public void setAttemptid(short attemptid) {
        this.attemptid = attemptid;
    }

    @Basic
    @Column(name = "STATUSDATE", nullable = true)
    @Type(type = "date")
    public Date getStatusdate() {
        return statusdate;
    }

    public void setStatusdate(Date statusdate) {
        this.statusdate = statusdate;
    }

    @Basic
    @Column(name = "PAYMENTREFERENCE", nullable = true, length = 20)
    public String getPaymentreference() {
        return paymentreference;
    }

    public void setPaymentreference(String paymentreference) {
        this.paymentreference = paymentreference;
    }

    @Basic
    @Column(name = "ADDITIONALREFERENCE", nullable = true, length = 20)
    public String getAdditionalreference() {
        return additionalreference;
    }

    public void setAdditionalreference(String additionalreference) {
        this.additionalreference = additionalreference;
    }

    @Basic
    @Column(name = "RECEIVEDDATE", nullable = true)
    @Type(type = "date")
    public Date getReceiveddate() {
        return receiveddate;
    }

    public void setReceiveddate(Date receiveddate) {
        this.receiveddate = receiveddate;
    }

    @Basic
    @Column(name = "CONTRACTID", nullable = true, length = 10)
    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid;
    }

    @Basic
    @Column(name = "AMOUNT", nullable = true, precision = 2)
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "FEEDBACKSTATUS", nullable = true, precision = 0)
    public Short getFeedbackstatus() {
        return feedbackstatus;
    }

    public void setFeedbackstatus(Short feedbackstatus) {
        this.feedbackstatus = feedbackstatus;
    }

    @Basic
    @Column(name = "JULIANYEAR", nullable = true, length = 1)
    public String getJulianyear() {
        return julianyear;
    }

    public void setJulianyear(String julianyear) {
        this.julianyear = julianyear;
    }

    @Basic
    @Column(name = "JULIANDAY", nullable = true, length = 3)
    public String getJulianday() {
        return julianday;
    }

    public void setJulianday(String julianday) {
        this.julianday = julianday;
    }

    @Basic
    @Column(name = "BATCHNUMBER", nullable = true, precision = 0)
    public Long getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(Long batchnumber) {
        this.batchnumber = batchnumber;
    }

    @Basic
    @Column(name = "SENDDATE", nullable = true)
    @Type(type = "date")
    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    @Basic
    @Column(name = "ONLINEAUTHORISERID", nullable = true, length = 12)
    public String getOnlineauthoriserid() {
        return onlineauthoriserid;
    }

    public void setOnlineauthoriserid(String onlineauthoriserid) {
        this.onlineauthoriserid = onlineauthoriserid;
    }

    @Basic
    @Column(name = "CREDITDEBITINDICATOR", nullable = true, length = 1)
    public String getCreditdebitindicator() {
        return creditdebitindicator;
    }

    public void setCreditdebitindicator(String creditdebitindicator) {
        this.creditdebitindicator = creditdebitindicator;
    }

    @Basic
    @Column(name = "AMOUNTRECEIVED", nullable = true, precision = 2)
    public Long getAmountreceived() {
        return amountreceived;
    }

    public void setAmountreceived(Long amountreceived) {
        this.amountreceived = amountreceived;
    }

    @Basic
    @Column(name = "COUNTRYCODE", nullable = true, length = 2)
    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Basic
    @Column(name = "REQUESTSOURCE", nullable = true, length = 35)
    public String getRequestsource() {
        return requestsource;
    }

    public void setRequestsource(String requestsource) {
        this.requestsource = requestsource;
    }

    @Basic
    @Column(name = "REFERENCE", nullable = true, length = 30)
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Basic
    @Column(name = "PAYMENTAMOUNT", nullable = true, precision = 2)
    public Long getPaymentamount() {
        return paymentamount;
    }

    public void setPaymentamount(Long paymentamount) {
        this.paymentamount = paymentamount;
    }

    @Basic
    @Column(name = "PAYMENTCURRENCYCODE", nullable = true, length = 3)
    public String getPaymentcurrencycode() {
        return paymentcurrencycode;
    }

    public void setPaymentcurrencycode(String paymentcurrencycode) {
        this.paymentcurrencycode = paymentcurrencycode;
    }

    @Basic
    @Column(name = "PAYMENTDATE", nullable = true)
    @Type(type = "date")
    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    @Basic
    @Column(name = "MAC", nullable = true, length = 32)
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Basic
    @Column(name = "BANKMAC", nullable = true, length = 32)
    public String getBankmac() {
        return bankmac;
    }

    public void setBankmac(String bankmac) {
        this.bankmac = bankmac;
    }

    @Basic
    @Column(name = "RETURNMAC", nullable = true, length = 64)
    public String getReturnmac() {
        return returnmac;
    }

    public void setReturnmac(String returnmac) {
        this.returnmac = returnmac;
    }

    @Basic
    @Column(name = "HOSTEDINDICATOR", nullable = true, length = 1)
    public String getHostedindicator() {
        return hostedindicator;
    }

    public void setHostedindicator(String hostedindicator) {
        this.hostedindicator = hostedindicator;
    }

    @Basic
    @Column(name = "RETURNURL", nullable = true, length = 512)
    public String getReturnurl() {
        return returnurl;
    }

    public void setReturnurl(String returnurl) {
        this.returnurl = returnurl;
    }

    @Basic
    @Column(name = "REQUESTPAYMENTPRODUCTID", nullable = true, precision = 0)
    public Short getRequestpaymentproductid() {
        return requestpaymentproductid;
    }

    public void setRequestpaymentproductid(Short requestpaymentproductid) {
        this.requestpaymentproductid = requestpaymentproductid;
    }




    @Basic
    @Column(name = "STATUSID", nullable = true, precision = 0)
    public Short getStatusId() {
        return statusId;
    }

    public void setStatusId(Short statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "REQUESTCOUNTRYCODE", nullable = true, length = 2)
    public String getRequestcountrycode() {
        return requestcountrycode;
    }

    public void setRequestcountrycode(String requestcountrycode) {
        this.requestcountrycode = requestcountrycode;
    }

    @Basic
    @Column(name = "E4XFEEDBACKSTATUS", nullable = true, precision = 0)
    public Short getE4Xfeedbackstatus() {
        return e4Xfeedbackstatus;
    }

    public void setE4Xfeedbackstatus(Short e4Xfeedbackstatus) {
        this.e4Xfeedbackstatus = e4Xfeedbackstatus;
    }

    @Basic
    @Column(name = "INPROCESSFLAG", nullable = true, precision = 0)
    public Short getInprocessflag() {
        return inprocessflag;
    }

    public void setInprocessflag(Short inprocessflag) {
        this.inprocessflag = inprocessflag;
    }

    @Basic
    @Column(name = "ACCEPTNEEDEDINDICATOR", nullable = true, precision = 0)
    public Short getAcceptneededindicator() {
        return acceptneededindicator;
    }

    public void setAcceptneededindicator(Short acceptneededindicator) {
        this.acceptneededindicator = acceptneededindicator;
    }

    @Basic
    @Column(name = "PARTIALPAYMENTINDICATOR", nullable = true, precision = 0)
    public Boolean getPartialpaymentindicator() {
        return partialpaymentindicator;
    }

    public void setPartialpaymentindicator(Boolean partialpaymentindicator) {
        this.partialpaymentindicator = partialpaymentindicator;
    }

    @Basic
    @Column(name = "REQUESTAMOUNT", nullable = true, precision = 0)
    public Long getRequestamount() {
        return requestamount;
    }

    public void setRequestamount(Long requestamount) {
        this.requestamount = requestamount;
    }

    @Basic
    @Column(name = "REFERENCEORIGPAYMENT", nullable = true, length = 30)
    public String getReferenceorigpayment() {
        return referenceorigpayment;
    }

    public void setReferenceorigpayment(String referenceorigpayment) {
        this.referenceorigpayment = referenceorigpayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OprPaymentattemptEntity that = (OprPaymentattemptEntity) o;
        return merchantid == that.merchantid &&
                orderid == that.orderid &&
                effortid == that.effortid &&
                attemptid == that.attemptid &&
                Objects.equals(statusdate, that.statusdate) &&
                Objects.equals(paymentreference, that.paymentreference) &&
                Objects.equals(additionalreference, that.additionalreference) &&
                Objects.equals(receiveddate, that.receiveddate) &&
                Objects.equals(contractid, that.contractid) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(feedbackstatus, that.feedbackstatus) &&
                Objects.equals(julianyear, that.julianyear) &&
                Objects.equals(julianday, that.julianday) &&
                Objects.equals(batchnumber, that.batchnumber) &&
                Objects.equals(senddate, that.senddate) &&
                Objects.equals(onlineauthoriserid, that.onlineauthoriserid) &&
                Objects.equals(creditdebitindicator, that.creditdebitindicator) &&
                Objects.equals(amountreceived, that.amountreceived) &&
                Objects.equals(countrycode, that.countrycode) &&
                Objects.equals(requestsource, that.requestsource) &&
                Objects.equals(reference, that.reference) &&
                Objects.equals(paymentamount, that.paymentamount) &&
                Objects.equals(paymentcurrencycode, that.paymentcurrencycode) &&
                Objects.equals(paymentdate, that.paymentdate) &&
                Objects.equals(mac, that.mac) &&
                Objects.equals(bankmac, that.bankmac) &&
                Objects.equals(returnmac, that.returnmac) &&
                Objects.equals(hostedindicator, that.hostedindicator) &&
                Objects.equals(returnurl, that.returnurl) &&
                Objects.equals(requestpaymentproductid, that.requestpaymentproductid) &&
                Objects.equals(statusId, that.statusId) &&
                Objects.equals(requestcountrycode, that.requestcountrycode) &&
                Objects.equals(e4Xfeedbackstatus, that.e4Xfeedbackstatus) &&
                Objects.equals(inprocessflag, that.inprocessflag) &&
                Objects.equals(acceptneededindicator, that.acceptneededindicator) &&
                Objects.equals(partialpaymentindicator, that.partialpaymentindicator) &&
                Objects.equals(requestamount, that.requestamount) &&
                Objects.equals(referenceorigpayment, that.referenceorigpayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merchantid, orderid, effortid, attemptid, statusdate, paymentreference, additionalreference, receiveddate, contractid, amount, feedbackstatus, julianyear, julianday, batchnumber, senddate, onlineauthoriserid, creditdebitindicator, amountreceived, countrycode, requestsource, reference, paymentamount, paymentcurrencycode, paymentdate, mac, bankmac, returnmac, hostedindicator, returnurl, requestpaymentproductid, statusId,requestcountrycode, e4Xfeedbackstatus, inprocessflag, acceptneededindicator, partialpaymentindicator, requestamount, referenceorigpayment);
    }

    @Override
    public String toString() {
        return "OprPaymentattemptEntity{" +
                "merchantid=" + merchantid +
                ", orderid=" + orderid +
                ", effortid=" + effortid +
                ", attemptid=" + attemptid +
                ", statusdate=" + statusdate +
                ", paymentreference='" + paymentreference + '\'' +
                ", additionalreference='" + additionalreference + '\'' +
                ", receiveddate=" + receiveddate +
                ", contractid='" + contractid + '\'' +
                ", amount=" + amount +
                ", feedbackstatus=" + feedbackstatus +
                ", julianyear='" + julianyear + '\'' +
                ", julianday='" + julianday + '\'' +
                ", batchnumber=" + batchnumber +
                ", senddate=" + senddate +
                ", onlineauthoriserid='" + onlineauthoriserid + '\'' +
                ", creditdebitindicator='" + creditdebitindicator + '\'' +
                ", amountreceived=" + amountreceived +
                ", countrycode='" + countrycode + '\'' +
                ", requestsource='" + requestsource + '\'' +
                ", reference='" + reference + '\'' +
                ", paymentamount=" + paymentamount +
                ", paymentcurrencycode='" + paymentcurrencycode + '\'' +
                ", paymentdate=" + paymentdate +
                ", mac='" + mac + '\'' +
                ", bankmac='" + bankmac + '\'' +
                ", returnmac='" + returnmac + '\'' +
                ", hostedindicator='" + hostedindicator + '\'' +
                ", returnurl='" + returnurl + '\'' +
                ", requestpaymentproductid=" + requestpaymentproductid +
                ", statusId=" + statusId +
                ", requestcountrycode='" + requestcountrycode + '\'' +
                ", e4Xfeedbackstatus=" + e4Xfeedbackstatus +
                ", inprocessflag=" + inprocessflag +
                ", acceptneededindicator=" + acceptneededindicator +
                ", partialpaymentindicator=" + partialpaymentindicator +
                ", requestamount=" + requestamount +
                ", referenceorigpayment='" + referenceorigpayment + '\'' +
                '}';
    }
}
