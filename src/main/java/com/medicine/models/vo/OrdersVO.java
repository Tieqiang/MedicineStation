package com.medicine.models.vo;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by heren on 2014/12/12.
 */
@XmlRootElement
public class OrdersVO implements Serializable {

    private Integer id ;
    private Integer repeatIndicator ;
    private String className ;
    private Date startDateTime ;
    private String orderText ;
    private Double dosage ;
    private String dosageUnits ;
    private String administration ;
    private String frequency ;
    private String performSchedule ;
    private Date stopDateTime ;
    private String freqDetail ;
    private Integer billingAttr ;
    private Integer drugBillingAttr;
    private String doctor ;
    private String stopDoctor ;
    private String nurse ;
    private String duration ;
    private String durationUnits ;
    private Date processingDateTime ;


    public OrdersVO() {
    }

    public OrdersVO(Integer id, Integer repeatIndicator, String className, Date startDateTime, String orderText, Double dosage, String dosageUnits, String administration, String frequency, String performSchedule, Date stopDateTime, String freqDetail, Integer billingAttr, Integer drugBillingAttr, String doctor, String stopDoctor, String nurse, String duration, String durationUnits, Date processingDateTime) {
        this.id = id;
        this.repeatIndicator = repeatIndicator;
        this.className = className;
        this.startDateTime = startDateTime;
        this.orderText = orderText;
        this.dosage = dosage;
        this.dosageUnits = dosageUnits;
        this.administration = administration;
        this.frequency = frequency;
        this.performSchedule = performSchedule;
        this.stopDateTime = stopDateTime;
        this.freqDetail = freqDetail;
        this.billingAttr = billingAttr;
        this.drugBillingAttr = drugBillingAttr;
        this.doctor = doctor;
        this.stopDoctor = stopDoctor;
        this.nurse = nurse;
        this.duration = duration;
        this.durationUnits = durationUnits;
        this.processingDateTime = processingDateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRepeatIndicator() {
        return repeatIndicator;
    }

    public void setRepeatIndicator(Integer repeatIndicator) {
        this.repeatIndicator = repeatIndicator;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }

    public Double getDosage() {
        return dosage;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }

    public String getDosageUnits() {
        return dosageUnits;
    }

    public void setDosageUnits(String dosageUnits) {
        this.dosageUnits = dosageUnits;
    }

    public String getAdministration() {
        return administration;
    }

    public void setAdministration(String administration) {
        this.administration = administration;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getPerformSchedule() {
        return performSchedule;
    }

    public void setPerformSchedule(String performSchedule) {
        this.performSchedule = performSchedule;
    }

    public Date getStopDateTime() {
        return stopDateTime;
    }

    public void setStopDateTime(Date stopDateTime) {
        this.stopDateTime = stopDateTime;
    }

    public String getFreqDetail() {
        return freqDetail;
    }

    public void setFreqDetail(String freqDetail) {
        this.freqDetail = freqDetail;
    }

    public Integer getBillingAttr() {
        return billingAttr;
    }

    public void setBillingAttr(Integer billingAttr) {
        this.billingAttr = billingAttr;
    }

    public Integer getDrugBillingAttr() {
        return drugBillingAttr;
    }

    public void setDrugBillingAttr(Integer drugBillingAttr) {
        this.drugBillingAttr = drugBillingAttr;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getStopDoctor() {
        return stopDoctor;
    }

    public void setStopDoctor(String stopDoctor) {
        this.stopDoctor = stopDoctor;
    }

    public String getNurse() {
        return nurse;
    }

    public void setNurse(String nurse) {
        this.nurse = nurse;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDurationUnits() {
        return durationUnits;
    }

    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    public Date getProcessingDateTime() {
        return processingDateTime;
    }

    public void setProcessingDateTime(Date processingDateTime) {
        this.processingDateTime = processingDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrdersVO)) return false;

        OrdersVO ordersVO = (OrdersVO) o;

        if (!administration.equals(ordersVO.administration)) return false;
        if (!billingAttr.equals(ordersVO.billingAttr)) return false;
        if (!className.equals(ordersVO.className)) return false;
        if (!doctor.equals(ordersVO.doctor)) return false;
        if (!dosage.equals(ordersVO.dosage)) return false;
        if (!dosageUnits.equals(ordersVO.dosageUnits)) return false;
        if (!drugBillingAttr.equals(ordersVO.drugBillingAttr)) return false;
        if (!duration.equals(ordersVO.duration)) return false;
        if (!durationUnits.equals(ordersVO.durationUnits)) return false;
        if (!freqDetail.equals(ordersVO.freqDetail)) return false;
        if (!frequency.equals(ordersVO.frequency)) return false;
        if (!id.equals(ordersVO.id)) return false;
        if (!nurse.equals(ordersVO.nurse)) return false;
        if (!orderText.equals(ordersVO.orderText)) return false;
        if (!performSchedule.equals(ordersVO.performSchedule)) return false;
        if (!processingDateTime.equals(ordersVO.processingDateTime)) return false;
        if (!repeatIndicator.equals(ordersVO.repeatIndicator)) return false;
        if (!startDateTime.equals(ordersVO.startDateTime)) return false;
        if (!stopDateTime.equals(ordersVO.stopDateTime)) return false;
        if (!stopDoctor.equals(ordersVO.stopDoctor)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + repeatIndicator.hashCode();
        result = 31 * result + className.hashCode();
        result = 31 * result + startDateTime.hashCode();
        result = 31 * result + orderText.hashCode();
        result = 31 * result + dosage.hashCode();
        result = 31 * result + dosageUnits.hashCode();
        result = 31 * result + administration.hashCode();
        result = 31 * result + frequency.hashCode();
        result = 31 * result + performSchedule.hashCode();
        result = 31 * result + stopDateTime.hashCode();
        result = 31 * result + freqDetail.hashCode();
        result = 31 * result + billingAttr.hashCode();
        result = 31 * result + drugBillingAttr.hashCode();
        result = 31 * result + doctor.hashCode();
        result = 31 * result + stopDoctor.hashCode();
        result = 31 * result + nurse.hashCode();
        result = 31 * result + duration.hashCode();
        result = 31 * result + durationUnits.hashCode();
        result = 31 * result + processingDateTime.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "OrdersVO{" +
                "id=" + id +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", className='" + className + '\'' +
                ", startDateTime=" + startDateTime +
                ", orderText='" + orderText + '\'' +
                ", dosage='" + dosage + '\'' +
                ", dosageUnits='" + dosageUnits + '\'' +
                ", administration='" + administration + '\'' +
                ", frequency='" + frequency + '\'' +
                ", performSchedule='" + performSchedule + '\'' +
                ", stopDateTime=" + stopDateTime +
                ", freqDetail='" + freqDetail + '\'' +
                ", billingAttr='" + billingAttr + '\'' +
                ", drugBillingAttr='" + drugBillingAttr + '\'' +
                ", doctor='" + doctor + '\'' +
                ", stopDoctor='" + stopDoctor + '\'' +
                ", nurse='" + nurse + '\'' +
                ", duration='" + duration + '\'' +
                ", durationUnits='" + durationUnits + '\'' +
                ", processingDateTime=" + processingDateTime +
                '}';
    }
}
