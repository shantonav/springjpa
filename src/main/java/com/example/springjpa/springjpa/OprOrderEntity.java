package com.example.springjpa.springjpa;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
import java.util.Set;

/**
 * Created by ssen on 6/22/2017.
 */
@Entity
@Table(name = "OPR_ORDER", schema = "EPS", catalog = "")
@IdClass(OprOrderEntityPK.class)
public class OprOrderEntity {
    private int orderid;
    private int merchantid;
    private Date statusdate;
    private Date receiveddate;
    private Long amount;
    private String currencycode;
    private String surname;
    private String city;
    private Integer resellerid;
    private String resellermerchantid;
    private String customerid;
    private String email;
    private String firstname;
    private String prefixsurname;
    private String title;
    private String companyname;
    private String companydata;
    private String description;
    private String street;
    private String housenumber;
    private String additionaladdressinfo;
    private String zip;
    private String state;
    private String sex;
    private String vatnumber;
    private String phonenumber;
    private String faxnumber;
    private String amountsign;
    private Long amountpaid;
    private String currencypaid;
    private Boolean indicationtest;
    private String invoicenumber;
    private String invoicetype;
    private Date invoicedate;
    private String invoiceclass;
    private Date orderdate;
    private String textqualifier1;
    private String ipaddressmerchant;
    private String ipaddresscustomer;
    private String merchantreference;
    private Short ordertype;
    private String additionaldata;
    private Date birthdate;
    private String textqualifier2;
    private String textqualifier3;
    private Integer stepweek;
    private Integer stepmonth;
    private String matchdayofweek;
    private String matchdayofmonth;
    private Date startdate;
    private Date enddate;
    private Short numberofpayments;
    private Date lastdate;
    private Date nextdate;
    private Short numberofpaymentsdone;
    private String mac;
    private Boolean feedbackstatus;
    private String mandate;
    private Boolean emailtypeindicator;
    private String overwritepaymentreference;
    private String shippingtitle;
    private String shippingsex;
    private String shippingfirstname;
    private String shippingprefixsurname;
    private String shippingsurname;
    private String shippingstreet;
    private String shippinghousenumber;
    private String shippingadditionaladdressinfo;
    private String shippingzip;
    private String shippingcity;
    private String shippingstate;
    private String descriptor;
    private Long amountrefunded;
    private String airlinefields;
    private Long totalamountpaid;
    private Long totalamountrefunded;
    private String additionalfrauddata;
    private String riskproducts;
    private String riskservices;
    private String riskservicefilter;
    private Integer reuseorderid;
    private Short reuseeffortid;
    private Short reuseattemptid;
    private String reusecustomerid;
    private String reusemerchantreference;
    private String statecode;
    private Short numberofinstallments;
    private Boolean purchasetype;
    private Boolean usagetype;
    private String hostedindicator;
    private String returnurl;
    private String devicetype;
    private String customerreference;
    private Long taxamount;
    private Long dutyamount;
    private Long discountamount;
    private Long shippingamount;
    private Integer merchantorderid;
    private String customercontractidentifier;


    @OneToMany(fetch = FetchType.LAZY, mappedBy="oprOrder")
    public Set<OprPaymentattemptEntity> getAttempts() {
        return attempts;
    }

    public void setAttempts(Set<OprPaymentattemptEntity> attempts) {
        this.attempts = attempts;
    }

    private Set<OprPaymentattemptEntity> attempts;

    @Id
    @Column(name = "ORDERID", nullable = false, precision = 0)
    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    @Id
    @Column(name = "MERCHANTID", nullable = false, precision = 0)
    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
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
    @Column(name = "RECEIVEDDATE", nullable = false)
    @Type(type = "date")
    public Date getReceiveddate() {
        return receiveddate;
    }

    public void setReceiveddate(Date receiveddate) {
        this.receiveddate = receiveddate;
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
    @Column(name = "CURRENCYCODE", nullable = true, length = 3)
    public String getCurrencycode() {
        return currencycode;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    @Basic
    @Column(name = "SURNAME", nullable = true, length = 35)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "CITY", nullable = true, length = 40)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "RESELLERID", nullable = true, precision = 0)
    public Integer getResellerid() {
        return resellerid;
    }

    public void setResellerid(Integer resellerid) {
        this.resellerid = resellerid;
    }

    @Basic
    @Column(name = "RESELLERMERCHANTID", nullable = true, length = 50)
    public String getResellermerchantid() {
        return resellermerchantid;
    }

    public void setResellermerchantid(String resellermerchantid) {
        this.resellermerchantid = resellermerchantid;
    }

    @Basic
    @Column(name = "CUSTOMERID", nullable = true, length = 15)
    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 70)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "FIRSTNAME", nullable = true, length = 15)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "PREFIXSURNAME", nullable = true, length = 15)
    public String getPrefixsurname() {
        return prefixsurname;
    }

    public void setPrefixsurname(String prefixsurname) {
        this.prefixsurname = prefixsurname;
    }

    @Basic
    @Column(name = "TITLE", nullable = true, length = 35)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "COMPANYNAME", nullable = true, length = 40)
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Basic
    @Column(name = "COMPANYDATA", nullable = true, length = 50)
    public String getCompanydata() {
        return companydata;
    }

    public void setCompanydata(String companydata) {
        this.companydata = companydata;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "STREET", nullable = true, length = 50)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "HOUSENUMBER", nullable = true, length = 15)
    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    @Basic
    @Column(name = "ADDITIONALADDRESSINFO", nullable = true, length = 50)
    public String getAdditionaladdressinfo() {
        return additionaladdressinfo;
    }

    public void setAdditionaladdressinfo(String additionaladdressinfo) {
        this.additionaladdressinfo = additionaladdressinfo;
    }

    @Basic
    @Column(name = "ZIP", nullable = true, length = 10)
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "STATE", nullable = true, length = 35)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "SEX", nullable = true, length = 1)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "VATNUMBER", nullable = true, length = 17)
    public String getVatnumber() {
        return vatnumber;
    }

    public void setVatnumber(String vatnumber) {
        this.vatnumber = vatnumber;
    }

    @Basic
    @Column(name = "PHONENUMBER", nullable = true, length = 20)
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Basic
    @Column(name = "FAXNUMBER", nullable = true, length = 20)
    public String getFaxnumber() {
        return faxnumber;
    }

    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    @Basic
    @Column(name = "AMOUNTSIGN", nullable = true, length = 1)
    public String getAmountsign() {
        return amountsign;
    }

    public void setAmountsign(String amountsign) {
        this.amountsign = amountsign;
    }

    @Basic
    @Column(name = "AMOUNTPAID", nullable = true, precision = 0)
    public Long getAmountpaid() {
        return amountpaid;
    }

    public void setAmountpaid(Long amountpaid) {
        this.amountpaid = amountpaid;
    }

    @Basic
    @Column(name = "CURRENCYPAID", nullable = true, length = 3)
    public String getCurrencypaid() {
        return currencypaid;
    }

    public void setCurrencypaid(String currencypaid) {
        this.currencypaid = currencypaid;
    }

    @Basic
    @Column(name = "INDICATIONTEST", nullable = true, precision = 0)
    public Boolean getIndicationtest() {
        return indicationtest;
    }

    public void setIndicationtest(Boolean indicationtest) {
        this.indicationtest = indicationtest;
    }

    @Basic
    @Column(name = "INVOICENUMBER", nullable = true, length = 20)
    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber;
    }

    @Basic
    @Column(name = "INVOICETYPE", nullable = true, length = 2)
    public String getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    @Basic
    @Column(name = "INVOICEDATE", nullable = true)
    @Type(type = "date")
    public Date getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    @Basic
    @Column(name = "INVOICECLASS", nullable = true, length = 10)
    public String getInvoiceclass() {
        return invoiceclass;
    }

    public void setInvoiceclass(String invoiceclass) {
        this.invoiceclass = invoiceclass;
    }

    @Basic
    @Column(name = "ORDERDATE", nullable = true)
    @Type(type = "date")
    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    @Basic
    @Column(name = "TEXTQUALIFIER1", nullable = true, length = 10)
    public String getTextqualifier1() {
        return textqualifier1;
    }

    public void setTextqualifier1(String textqualifier1) {
        this.textqualifier1 = textqualifier1;
    }

    @Basic
    @Column(name = "IPADDRESSMERCHANT", nullable = true, length = 45)
    public String getIpaddressmerchant() {
        return ipaddressmerchant;
    }

    public void setIpaddressmerchant(String ipaddressmerchant) {
        this.ipaddressmerchant = ipaddressmerchant;
    }

    @Basic
    @Column(name = "IPADDRESSCUSTOMER", nullable = true, length = 45)
    public String getIpaddresscustomer() {
        return ipaddresscustomer;
    }

    public void setIpaddresscustomer(String ipaddresscustomer) {
        this.ipaddresscustomer = ipaddresscustomer;
    }

    @Basic
    @Column(name = "MERCHANTREFERENCE", nullable = true, length = 50)
    public String getMerchantreference() {
        return merchantreference;
    }

    public void setMerchantreference(String merchantreference) {
        this.merchantreference = merchantreference;
    }

    @Basic
    @Column(name = "ORDERTYPE", nullable = true, precision = 0)
    public Short getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Short ordertype) {
        this.ordertype = ordertype;
    }

    @Basic
    @Column(name = "ADDITIONALDATA", nullable = true, length = 500)
    public String getAdditionaldata() {
        return additionaldata;
    }

    public void setAdditionaldata(String additionaldata) {
        this.additionaldata = additionaldata;
    }

    @Basic
    @Column(name = "BIRTHDATE", nullable = true)
    @Type(type = "date")
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "TEXTQUALIFIER2", nullable = true, length = 10)
    public String getTextqualifier2() {
        return textqualifier2;
    }

    public void setTextqualifier2(String textqualifier2) {
        this.textqualifier2 = textqualifier2;
    }

    @Basic
    @Column(name = "TEXTQUALIFIER3", nullable = true, length = 10)
    public String getTextqualifier3() {
        return textqualifier3;
    }

    public void setTextqualifier3(String textqualifier3) {
        this.textqualifier3 = textqualifier3;
    }

    @Basic
    @Column(name = "STEPWEEK", nullable = true, precision = 0)
    public Integer getStepweek() {
        return stepweek;
    }

    public void setStepweek(Integer stepweek) {
        this.stepweek = stepweek;
    }

    @Basic
    @Column(name = "STEPMONTH", nullable = true, precision = 0)
    public Integer getStepmonth() {
        return stepmonth;
    }

    public void setStepmonth(Integer stepmonth) {
        this.stepmonth = stepmonth;
    }

    @Basic
    @Column(name = "MATCHDAYOFWEEK", nullable = true, length = 64)
    public String getMatchdayofweek() {
        return matchdayofweek;
    }

    public void setMatchdayofweek(String matchdayofweek) {
        this.matchdayofweek = matchdayofweek;
    }

    @Basic
    @Column(name = "MATCHDAYOFMONTH", nullable = true, length = 64)
    public String getMatchdayofmonth() {
        return matchdayofmonth;
    }

    public void setMatchdayofmonth(String matchdayofmonth) {
        this.matchdayofmonth = matchdayofmonth;
    }

    @Basic
    @Column(name = "STARTDATE", nullable = true)
    @Type(type = "date")
    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "ENDDATE", nullable = true)
    @Type(type = "date")
    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "NUMBEROFPAYMENTS", nullable = true, precision = 0)
    public Short getNumberofpayments() {
        return numberofpayments;
    }

    public void setNumberofpayments(Short numberofpayments) {
        this.numberofpayments = numberofpayments;
    }

    @Basic
    @Column(name = "LASTDATE", nullable = true)
    @Type(type = "date")
    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    @Basic
    @Column(name = "NEXTDATE", nullable = true)
    @Type(type = "date")
    public Date getNextdate() {
        return nextdate;
    }

    public void setNextdate(Date nextdate) {
        this.nextdate = nextdate;
    }

    @Basic
    @Column(name = "NUMBEROFPAYMENTSDONE", nullable = true, precision = 0)
    public Short getNumberofpaymentsdone() {
        return numberofpaymentsdone;
    }

    public void setNumberofpaymentsdone(Short numberofpaymentsdone) {
        this.numberofpaymentsdone = numberofpaymentsdone;
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
    @Column(name = "FEEDBACKSTATUS", nullable = true, precision = 0)
    public Boolean getFeedbackstatus() {
        return feedbackstatus;
    }

    public void setFeedbackstatus(Boolean feedbackstatus) {
        this.feedbackstatus = feedbackstatus;
    }

    @Basic
    @Column(name = "MANDATE", nullable = true, length = 10)
    public String getMandate() {
        return mandate;
    }

    public void setMandate(String mandate) {
        this.mandate = mandate;
    }

    @Basic
    @Column(name = "EMAILTYPEINDICATOR", nullable = true, precision = 0)
    public Boolean getEmailtypeindicator() {
        return emailtypeindicator;
    }

    public void setEmailtypeindicator(Boolean emailtypeindicator) {
        this.emailtypeindicator = emailtypeindicator;
    }

    @Basic
    @Column(name = "OVERWRITEPAYMENTREFERENCE", nullable = true, length = 20)
    public String getOverwritepaymentreference() {
        return overwritepaymentreference;
    }

    public void setOverwritepaymentreference(String overwritepaymentreference) {
        this.overwritepaymentreference = overwritepaymentreference;
    }

    @Basic
    @Column(name = "SHIPPINGTITLE", nullable = true, length = 35)
    public String getShippingtitle() {
        return shippingtitle;
    }

    public void setShippingtitle(String shippingtitle) {
        this.shippingtitle = shippingtitle;
    }

    @Basic
    @Column(name = "SHIPPINGSEX", nullable = true, length = 1)
    public String getShippingsex() {
        return shippingsex;
    }

    public void setShippingsex(String shippingsex) {
        this.shippingsex = shippingsex;
    }

    @Basic
    @Column(name = "SHIPPINGFIRSTNAME", nullable = true, length = 15)
    public String getShippingfirstname() {
        return shippingfirstname;
    }

    public void setShippingfirstname(String shippingfirstname) {
        this.shippingfirstname = shippingfirstname;
    }

    @Basic
    @Column(name = "SHIPPINGPREFIXSURNAME", nullable = true, length = 15)
    public String getShippingprefixsurname() {
        return shippingprefixsurname;
    }

    public void setShippingprefixsurname(String shippingprefixsurname) {
        this.shippingprefixsurname = shippingprefixsurname;
    }

    @Basic
    @Column(name = "SHIPPINGSURNAME", nullable = true, length = 35)
    public String getShippingsurname() {
        return shippingsurname;
    }

    public void setShippingsurname(String shippingsurname) {
        this.shippingsurname = shippingsurname;
    }

    @Basic
    @Column(name = "SHIPPINGSTREET", nullable = true, length = 50)
    public String getShippingstreet() {
        return shippingstreet;
    }

    public void setShippingstreet(String shippingstreet) {
        this.shippingstreet = shippingstreet;
    }

    @Basic
    @Column(name = "SHIPPINGHOUSENUMBER", nullable = true, length = 15)
    public String getShippinghousenumber() {
        return shippinghousenumber;
    }

    public void setShippinghousenumber(String shippinghousenumber) {
        this.shippinghousenumber = shippinghousenumber;
    }

    @Basic
    @Column(name = "SHIPPINGADDITIONALADDRESSINFO", nullable = true, length = 50)
    public String getShippingadditionaladdressinfo() {
        return shippingadditionaladdressinfo;
    }

    public void setShippingadditionaladdressinfo(String shippingadditionaladdressinfo) {
        this.shippingadditionaladdressinfo = shippingadditionaladdressinfo;
    }

    @Basic
    @Column(name = "SHIPPINGZIP", nullable = true, length = 10)
    public String getShippingzip() {
        return shippingzip;
    }

    public void setShippingzip(String shippingzip) {
        this.shippingzip = shippingzip;
    }

    @Basic
    @Column(name = "SHIPPINGCITY", nullable = true, length = 40)
    public String getShippingcity() {
        return shippingcity;
    }

    public void setShippingcity(String shippingcity) {
        this.shippingcity = shippingcity;
    }

    @Basic
    @Column(name = "SHIPPINGSTATE", nullable = true, length = 35)
    public String getShippingstate() {
        return shippingstate;
    }

    public void setShippingstate(String shippingstate) {
        this.shippingstate = shippingstate;
    }

    @Basic
    @Column(name = "DESCRIPTOR", nullable = true, length = 256)
    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    @Basic
    @Column(name = "AMOUNTREFUNDED", nullable = true, precision = 2)
    public Long getAmountrefunded() {
        return amountrefunded;
    }

    public void setAmountrefunded(Long amountrefunded) {
        this.amountrefunded = amountrefunded;
    }

    @Basic
    @Column(name = "AIRLINEFIELDS", nullable = true, length = 4000)
    public String getAirlinefields() {
        return airlinefields;
    }

    public void setAirlinefields(String airlinefields) {
        this.airlinefields = airlinefields;
    }

    @Basic
    @Column(name = "TOTALAMOUNTPAID", nullable = true, precision = 0)
    public Long getTotalamountpaid() {
        return totalamountpaid;
    }

    public void setTotalamountpaid(Long totalamountpaid) {
        this.totalamountpaid = totalamountpaid;
    }

    @Basic
    @Column(name = "TOTALAMOUNTREFUNDED", nullable = true, precision = 0)
    public Long getTotalamountrefunded() {
        return totalamountrefunded;
    }

    public void setTotalamountrefunded(Long totalamountrefunded) {
        this.totalamountrefunded = totalamountrefunded;
    }

    @Basic
    @Column(name = "ADDITIONALFRAUDDATA", nullable = true, length = 250)
    public String getAdditionalfrauddata() {
        return additionalfrauddata;
    }

    public void setAdditionalfrauddata(String additionalfrauddata) {
        this.additionalfrauddata = additionalfrauddata;
    }

    @Basic
    @Column(name = "RISKPRODUCTS", nullable = true, length = 100)
    public String getRiskproducts() {
        return riskproducts;
    }

    public void setRiskproducts(String riskproducts) {
        this.riskproducts = riskproducts;
    }

    @Basic
    @Column(name = "RISKSERVICES", nullable = true, length = 100)
    public String getRiskservices() {
        return riskservices;
    }

    public void setRiskservices(String riskservices) {
        this.riskservices = riskservices;
    }

    @Basic
    @Column(name = "RISKSERVICEFILTER", nullable = true, length = 100)
    public String getRiskservicefilter() {
        return riskservicefilter;
    }

    public void setRiskservicefilter(String riskservicefilter) {
        this.riskservicefilter = riskservicefilter;
    }

    @Basic
    @Column(name = "REUSEORDERID", nullable = true, precision = 0)
    public Integer getReuseorderid() {
        return reuseorderid;
    }

    public void setReuseorderid(Integer reuseorderid) {
        this.reuseorderid = reuseorderid;
    }

    @Basic
    @Column(name = "REUSEEFFORTID", nullable = true, precision = 0)
    public Short getReuseeffortid() {
        return reuseeffortid;
    }

    public void setReuseeffortid(Short reuseeffortid) {
        this.reuseeffortid = reuseeffortid;
    }

    @Basic
    @Column(name = "REUSEATTEMPTID", nullable = true, precision = 0)
    public Short getReuseattemptid() {
        return reuseattemptid;
    }

    public void setReuseattemptid(Short reuseattemptid) {
        this.reuseattemptid = reuseattemptid;
    }

    @Basic
    @Column(name = "REUSECUSTOMERID", nullable = true, length = 15)
    public String getReusecustomerid() {
        return reusecustomerid;
    }

    public void setReusecustomerid(String reusecustomerid) {
        this.reusecustomerid = reusecustomerid;
    }

    @Basic
    @Column(name = "REUSEMERCHANTREFERENCE", nullable = true, length = 50)
    public String getReusemerchantreference() {
        return reusemerchantreference;
    }

    public void setReusemerchantreference(String reusemerchantreference) {
        this.reusemerchantreference = reusemerchantreference;
    }

    @Basic
    @Column(name = "STATECODE", nullable = true, length = 9)
    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    @Basic
    @Column(name = "NUMBEROFINSTALLMENTS", nullable = true, precision = 0)
    public Short getNumberofinstallments() {
        return numberofinstallments;
    }

    public void setNumberofinstallments(Short numberofinstallments) {
        this.numberofinstallments = numberofinstallments;
    }

    @Basic
    @Column(name = "PURCHASETYPE", nullable = true, precision = 0)
    public Boolean getPurchasetype() {
        return purchasetype;
    }

    public void setPurchasetype(Boolean purchasetype) {
        this.purchasetype = purchasetype;
    }

    @Basic
    @Column(name = "USAGETYPE", nullable = true, precision = 0)
    public Boolean getUsagetype() {
        return usagetype;
    }

    public void setUsagetype(Boolean usagetype) {
        this.usagetype = usagetype;
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
    @Column(name = "DEVICETYPE", nullable = true, length = 1)
    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    @Basic
    @Column(name = "CUSTOMERREFERENCE", nullable = true, length = 17)
    public String getCustomerreference() {
        return customerreference;
    }

    public void setCustomerreference(String customerreference) {
        this.customerreference = customerreference;
    }

    @Basic
    @Column(name = "TAXAMOUNT", nullable = true, precision = 0)
    public Long getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(Long taxamount) {
        this.taxamount = taxamount;
    }

    @Basic
    @Column(name = "DUTYAMOUNT", nullable = true, precision = 0)
    public Long getDutyamount() {
        return dutyamount;
    }

    public void setDutyamount(Long dutyamount) {
        this.dutyamount = dutyamount;
    }

    @Basic
    @Column(name = "DISCOUNTAMOUNT", nullable = true, precision = 0)
    public Long getDiscountamount() {
        return discountamount;
    }

    public void setDiscountamount(Long discountamount) {
        this.discountamount = discountamount;
    }

    @Basic
    @Column(name = "SHIPPINGAMOUNT", nullable = true, precision = 0)
    public Long getShippingamount() {
        return shippingamount;
    }

    public void setShippingamount(Long shippingamount) {
        this.shippingamount = shippingamount;
    }

    @Basic
    @Column(name = "MERCHANTORDERID", nullable = true, precision = 0)
    public Integer getMerchantorderid() {
        return merchantorderid;
    }

    public void setMerchantorderid(Integer merchantorderid) {
        this.merchantorderid = merchantorderid;
    }

    @Basic
    @Column(name = "CUSTOMERCONTRACTIDENTIFIER", nullable = true, length = 35)
    public String getCustomercontractidentifier() {
        return customercontractidentifier;
    }

    public void setCustomercontractidentifier(String customercontractidentifier) {
        this.customercontractidentifier = customercontractidentifier;
    }

    @Override
    public String toString() {
        return "OprOrderEntity{" +
                "orderid=" + orderid +
                ", merchantid=" + merchantid +
                ", statusdate=" + statusdate +
                ", receiveddate=" + receiveddate +
                ", amount=" + amount +
                ", currencycode='" + currencycode + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", resellerid=" + resellerid +
                ", resellermerchantid='" + resellermerchantid + '\'' +
                ", customerid='" + customerid + '\'' +
                ", email='" + email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", prefixsurname='" + prefixsurname + '\'' +
                ", title='" + title + '\'' +
                ", companyname='" + companyname + '\'' +
                ", companydata='" + companydata + '\'' +
                ", description='" + description + '\'' +
                ", street='" + street + '\'' +
                ", housenumber='" + housenumber + '\'' +
                ", additionaladdressinfo='" + additionaladdressinfo + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                ", sex='" + sex + '\'' +
                ", vatnumber='" + vatnumber + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", faxnumber='" + faxnumber + '\'' +
                ", amountsign='" + amountsign + '\'' +
                ", amountpaid=" + amountpaid +
                ", currencypaid='" + currencypaid + '\'' +
                ", indicationtest=" + indicationtest +
                ", invoicenumber='" + invoicenumber + '\'' +
                ", invoicetype='" + invoicetype + '\'' +
                ", invoicedate=" + invoicedate +
                ", invoiceclass='" + invoiceclass + '\'' +
                ", orderdate=" + orderdate +
                ", textqualifier1='" + textqualifier1 + '\'' +
                ", ipaddressmerchant='" + ipaddressmerchant + '\'' +
                ", ipaddresscustomer='" + ipaddresscustomer + '\'' +
                ", merchantreference='" + merchantreference + '\'' +
                ", ordertype=" + ordertype +
                ", additionaldata='" + additionaldata + '\'' +
                ", birthdate=" + birthdate +
                ", textqualifier2='" + textqualifier2 + '\'' +
                ", textqualifier3='" + textqualifier3 + '\'' +
                ", stepweek=" + stepweek +
                ", stepmonth=" + stepmonth +
                ", matchdayofweek='" + matchdayofweek + '\'' +
                ", matchdayofmonth='" + matchdayofmonth + '\'' +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                ", numberofpayments=" + numberofpayments +
                ", lastdate=" + lastdate +
                ", nextdate=" + nextdate +
                ", numberofpaymentsdone=" + numberofpaymentsdone +
                ", mac='" + mac + '\'' +
                ", feedbackstatus=" + feedbackstatus +
                ", mandate='" + mandate + '\'' +
                ", emailtypeindicator=" + emailtypeindicator +
                ", overwritepaymentreference='" + overwritepaymentreference + '\'' +
                ", shippingtitle='" + shippingtitle + '\'' +
                ", shippingsex='" + shippingsex + '\'' +
                ", shippingfirstname='" + shippingfirstname + '\'' +
                ", shippingprefixsurname='" + shippingprefixsurname + '\'' +
                ", shippingsurname='" + shippingsurname + '\'' +
                ", shippingstreet='" + shippingstreet + '\'' +
                ", shippinghousenumber='" + shippinghousenumber + '\'' +
                ", shippingadditionaladdressinfo='" + shippingadditionaladdressinfo + '\'' +
                ", shippingzip='" + shippingzip + '\'' +
                ", shippingcity='" + shippingcity + '\'' +
                ", shippingstate='" + shippingstate + '\'' +
                ", descriptor='" + descriptor + '\'' +
                ", amountrefunded=" + amountrefunded +
                ", airlinefields='" + airlinefields + '\'' +
                ", totalamountpaid=" + totalamountpaid +
                ", totalamountrefunded=" + totalamountrefunded +
                ", additionalfrauddata='" + additionalfrauddata + '\'' +
                ", riskproducts='" + riskproducts + '\'' +
                ", riskservices='" + riskservices + '\'' +
                ", riskservicefilter='" + riskservicefilter + '\'' +
                ", reuseorderid=" + reuseorderid +
                ", reuseeffortid=" + reuseeffortid +
                ", reuseattemptid=" + reuseattemptid +
                ", reusecustomerid='" + reusecustomerid + '\'' +
                ", reusemerchantreference='" + reusemerchantreference + '\'' +
                ", statecode='" + statecode + '\'' +
                ", numberofinstallments=" + numberofinstallments +
                ", purchasetype=" + purchasetype +
                ", usagetype=" + usagetype +
                ", hostedindicator='" + hostedindicator + '\'' +
                ", returnurl='" + returnurl + '\'' +
                ", devicetype='" + devicetype + '\'' +
                ", customerreference='" + customerreference + '\'' +
                ", taxamount=" + taxamount +
                ", dutyamount=" + dutyamount +
                ", discountamount=" + discountamount +
                ", shippingamount=" + shippingamount +
                ", merchantorderid=" + merchantorderid +
                ", customercontractidentifier='" + customercontractidentifier + '\'' +
                ", attempts=" + attempts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OprOrderEntity that = (OprOrderEntity) o;
        return orderid == that.orderid &&
                merchantid == that.merchantid &&
                Objects.equals(statusdate, that.statusdate) &&
                Objects.equals(receiveddate, that.receiveddate) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(currencycode, that.currencycode) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(city, that.city) &&
                Objects.equals(resellerid, that.resellerid) &&
                Objects.equals(resellermerchantid, that.resellermerchantid) &&
                Objects.equals(customerid, that.customerid) &&
                Objects.equals(email, that.email) &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(prefixsurname, that.prefixsurname) &&
                Objects.equals(title, that.title) &&
                Objects.equals(companyname, that.companyname) &&
                Objects.equals(companydata, that.companydata) &&
                Objects.equals(description, that.description) &&
                Objects.equals(street, that.street) &&
                Objects.equals(housenumber, that.housenumber) &&
                Objects.equals(additionaladdressinfo, that.additionaladdressinfo) &&
                Objects.equals(zip, that.zip) &&
                Objects.equals(state, that.state) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(vatnumber, that.vatnumber) &&
                Objects.equals(phonenumber, that.phonenumber) &&
                Objects.equals(faxnumber, that.faxnumber) &&
                Objects.equals(amountsign, that.amountsign) &&
                Objects.equals(amountpaid, that.amountpaid) &&
                Objects.equals(currencypaid, that.currencypaid) &&
                Objects.equals(indicationtest, that.indicationtest) &&
                Objects.equals(invoicenumber, that.invoicenumber) &&
                Objects.equals(invoicetype, that.invoicetype) &&
                Objects.equals(invoicedate, that.invoicedate) &&
                Objects.equals(invoiceclass, that.invoiceclass) &&
                Objects.equals(orderdate, that.orderdate) &&
                Objects.equals(textqualifier1, that.textqualifier1) &&
                Objects.equals(ipaddressmerchant, that.ipaddressmerchant) &&
                Objects.equals(ipaddresscustomer, that.ipaddresscustomer) &&
                Objects.equals(merchantreference, that.merchantreference) &&
                Objects.equals(ordertype, that.ordertype) &&
                Objects.equals(additionaldata, that.additionaldata) &&
                Objects.equals(birthdate, that.birthdate) &&
                Objects.equals(textqualifier2, that.textqualifier2) &&
                Objects.equals(textqualifier3, that.textqualifier3) &&
                Objects.equals(stepweek, that.stepweek) &&
                Objects.equals(stepmonth, that.stepmonth) &&
                Objects.equals(matchdayofweek, that.matchdayofweek) &&
                Objects.equals(matchdayofmonth, that.matchdayofmonth) &&
                Objects.equals(startdate, that.startdate) &&
                Objects.equals(enddate, that.enddate) &&
                Objects.equals(numberofpayments, that.numberofpayments) &&
                Objects.equals(lastdate, that.lastdate) &&
                Objects.equals(nextdate, that.nextdate) &&
                Objects.equals(numberofpaymentsdone, that.numberofpaymentsdone) &&
                Objects.equals(mac, that.mac) &&
                Objects.equals(feedbackstatus, that.feedbackstatus) &&
                Objects.equals(mandate, that.mandate) &&
                Objects.equals(emailtypeindicator, that.emailtypeindicator) &&
                Objects.equals(overwritepaymentreference, that.overwritepaymentreference) &&
                Objects.equals(shippingtitle, that.shippingtitle) &&
                Objects.equals(shippingsex, that.shippingsex) &&
                Objects.equals(shippingfirstname, that.shippingfirstname) &&
                Objects.equals(shippingprefixsurname, that.shippingprefixsurname) &&
                Objects.equals(shippingsurname, that.shippingsurname) &&
                Objects.equals(shippingstreet, that.shippingstreet) &&
                Objects.equals(shippinghousenumber, that.shippinghousenumber) &&
                Objects.equals(shippingadditionaladdressinfo, that.shippingadditionaladdressinfo) &&
                Objects.equals(shippingzip, that.shippingzip) &&
                Objects.equals(shippingcity, that.shippingcity) &&
                Objects.equals(shippingstate, that.shippingstate) &&
                Objects.equals(descriptor, that.descriptor) &&
                Objects.equals(amountrefunded, that.amountrefunded) &&
                Objects.equals(airlinefields, that.airlinefields) &&
                Objects.equals(totalamountpaid, that.totalamountpaid) &&
                Objects.equals(totalamountrefunded, that.totalamountrefunded) &&
                Objects.equals(additionalfrauddata, that.additionalfrauddata) &&
                Objects.equals(riskproducts, that.riskproducts) &&
                Objects.equals(riskservices, that.riskservices) &&
                Objects.equals(riskservicefilter, that.riskservicefilter) &&
                Objects.equals(reuseorderid, that.reuseorderid) &&
                Objects.equals(reuseeffortid, that.reuseeffortid) &&
                Objects.equals(reuseattemptid, that.reuseattemptid) &&
                Objects.equals(reusecustomerid, that.reusecustomerid) &&
                Objects.equals(reusemerchantreference, that.reusemerchantreference) &&
                Objects.equals(statecode, that.statecode) &&
                Objects.equals(numberofinstallments, that.numberofinstallments) &&
                Objects.equals(purchasetype, that.purchasetype) &&
                Objects.equals(usagetype, that.usagetype) &&
                Objects.equals(hostedindicator, that.hostedindicator) &&
                Objects.equals(returnurl, that.returnurl) &&
                Objects.equals(devicetype, that.devicetype) &&
                Objects.equals(customerreference, that.customerreference) &&
                Objects.equals(taxamount, that.taxamount) &&
                Objects.equals(dutyamount, that.dutyamount) &&
                Objects.equals(discountamount, that.discountamount) &&
                Objects.equals(shippingamount, that.shippingamount) &&
                Objects.equals(merchantorderid, that.merchantorderid) &&
                Objects.equals(customercontractidentifier, that.customercontractidentifier) &&
                Objects.equals(attempts,that.attempts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderid, merchantid, statusdate, receiveddate, amount, currencycode, surname, city, resellerid, resellermerchantid, customerid, email, firstname, prefixsurname, title, companyname, companydata, description, street, housenumber, additionaladdressinfo, zip, state, sex, vatnumber, phonenumber, faxnumber, amountsign, amountpaid, currencypaid, indicationtest, invoicenumber, invoicetype, invoicedate, invoiceclass, orderdate, textqualifier1, ipaddressmerchant, ipaddresscustomer, merchantreference, ordertype, additionaldata, birthdate, textqualifier2, textqualifier3, stepweek, stepmonth, matchdayofweek, matchdayofmonth, startdate, enddate, numberofpayments, lastdate, nextdate, numberofpaymentsdone, mac, feedbackstatus, mandate, emailtypeindicator, overwritepaymentreference, shippingtitle, shippingsex, shippingfirstname, shippingprefixsurname, shippingsurname, shippingstreet, shippinghousenumber, shippingadditionaladdressinfo, shippingzip, shippingcity, shippingstate, descriptor, amountrefunded, airlinefields, totalamountpaid, totalamountrefunded, additionalfrauddata, riskproducts, riskservices, riskservicefilter, reuseorderid, reuseeffortid, reuseattemptid, reusecustomerid, reusemerchantreference, statecode, numberofinstallments, purchasetype, usagetype, hostedindicator, returnurl, devicetype, customerreference, taxamount, dutyamount, discountamount, shippingamount, merchantorderid, customercontractidentifier,attempts);
    }
}
