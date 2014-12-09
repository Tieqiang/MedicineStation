package com.medicine.models.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * VDeptDictId entity. @author MyEclipse Persistence Tools
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class VDeptDictId implements java.io.Serializable {

	// Fields

	private Short serialNo;
	private String deptCode;
	private String deptName;
	private String deptAlias;
	private Boolean clinicAttr;
	private Boolean outpOrInp;
	private Boolean internalOrSergery;
	private String inputCode;
	private String insurDeptCode;
	private String reckonUnitOutp;
	private String reckonUnitInp;
	private Boolean deptAttr;

	// Constructors

	/** default constructor */
	public VDeptDictId() {
	}

	/** minimal constructor */
	public VDeptDictId(String deptCode) {
		this.deptCode = deptCode;
	}

	/** full constructor */
	public VDeptDictId(Short serialNo, String deptCode, String deptName,
			String deptAlias, Boolean clinicAttr, Boolean outpOrInp,
			Boolean internalOrSergery, String inputCode, String insurDeptCode,
			String reckonUnitOutp, String reckonUnitInp, Boolean deptAttr) {
		this.serialNo = serialNo;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.deptAlias = deptAlias;
		this.clinicAttr = clinicAttr;
		this.outpOrInp = outpOrInp;
		this.internalOrSergery = internalOrSergery;
		this.inputCode = inputCode;
		this.insurDeptCode = insurDeptCode;
		this.reckonUnitOutp = reckonUnitOutp;
		this.reckonUnitInp = reckonUnitInp;
		this.deptAttr = deptAttr;
	}

	// Property accessors

	@Column(name = "SERIAL_NO", precision = 3, scale = 0)
	public Short getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(Short serialNo) {
		this.serialNo = serialNo;
	}

	@Column(name = "DEPT_CODE", nullable = false, length = 8)
	public String getDeptCode() {
		return this.deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Column(name = "DEPT_NAME", length = 20)
	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Column(name = "DEPT_ALIAS", length = 20)
	public String getDeptAlias() {
		return this.deptAlias;
	}

	public void setDeptAlias(String deptAlias) {
		this.deptAlias = deptAlias;
	}

	@Column(name = "CLINIC_ATTR", precision = 1, scale = 0)
	public Boolean getClinicAttr() {
		return this.clinicAttr;
	}

	public void setClinicAttr(Boolean clinicAttr) {
		this.clinicAttr = clinicAttr;
	}

	@Column(name = "OUTP_OR_INP", precision = 1, scale = 0)
	public Boolean getOutpOrInp() {
		return this.outpOrInp;
	}

	public void setOutpOrInp(Boolean outpOrInp) {
		this.outpOrInp = outpOrInp;
	}

	@Column(name = "INTERNAL_OR_SERGERY", precision = 1, scale = 0)
	public Boolean getInternalOrSergery() {
		return this.internalOrSergery;
	}

	public void setInternalOrSergery(Boolean internalOrSergery) {
		this.internalOrSergery = internalOrSergery;
	}

	@Column(name = "INPUT_CODE", length = 8)
	public String getInputCode() {
		return this.inputCode;
	}

	public void setInputCode(String inputCode) {
		this.inputCode = inputCode;
	}

	@Column(name = "INSUR_DEPT_CODE", length = 4)
	public String getInsurDeptCode() {
		return this.insurDeptCode;
	}

	public void setInsurDeptCode(String insurDeptCode) {
		this.insurDeptCode = insurDeptCode;
	}

	@Column(name = "RECKON_UNIT_OUTP", length = 8)
	public String getReckonUnitOutp() {
		return this.reckonUnitOutp;
	}

	public void setReckonUnitOutp(String reckonUnitOutp) {
		this.reckonUnitOutp = reckonUnitOutp;
	}

	@Column(name = "RECKON_UNIT_INP", length = 8)
	public String getReckonUnitInp() {
		return this.reckonUnitInp;
	}

	public void setReckonUnitInp(String reckonUnitInp) {
		this.reckonUnitInp = reckonUnitInp;
	}

	@Column(name = "DEPT_ATTR", precision = 1, scale = 0)
	public Boolean getDeptAttr() {
		return this.deptAttr;
	}

	public void setDeptAttr(Boolean deptAttr) {
		this.deptAttr = deptAttr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VDeptDictId))
			return false;
		VDeptDictId castOther = (VDeptDictId) other;

		return ((this.getSerialNo() == castOther.getSerialNo()) || (this
				.getSerialNo() != null && castOther.getSerialNo() != null && this
				.getSerialNo().equals(castOther.getSerialNo())))
				&& ((this.getDeptCode() == castOther.getDeptCode()) || (this
						.getDeptCode() != null
						&& castOther.getDeptCode() != null && this
						.getDeptCode().equals(castOther.getDeptCode())))
				&& ((this.getDeptName() == castOther.getDeptName()) || (this
						.getDeptName() != null
						&& castOther.getDeptName() != null && this
						.getDeptName().equals(castOther.getDeptName())))
				&& ((this.getDeptAlias() == castOther.getDeptAlias()) || (this
						.getDeptAlias() != null
						&& castOther.getDeptAlias() != null && this
						.getDeptAlias().equals(castOther.getDeptAlias())))
				&& ((this.getClinicAttr() == castOther.getClinicAttr()) || (this
						.getClinicAttr() != null
						&& castOther.getClinicAttr() != null && this
						.getClinicAttr().equals(castOther.getClinicAttr())))
				&& ((this.getOutpOrInp() == castOther.getOutpOrInp()) || (this
						.getOutpOrInp() != null
						&& castOther.getOutpOrInp() != null && this
						.getOutpOrInp().equals(castOther.getOutpOrInp())))
				&& ((this.getInternalOrSergery() == castOther
						.getInternalOrSergery()) || (this
						.getInternalOrSergery() != null
						&& castOther.getInternalOrSergery() != null && this
						.getInternalOrSergery().equals(
								castOther.getInternalOrSergery())))
				&& ((this.getInputCode() == castOther.getInputCode()) || (this
						.getInputCode() != null
						&& castOther.getInputCode() != null && this
						.getInputCode().equals(castOther.getInputCode())))
				&& ((this.getInsurDeptCode() == castOther.getInsurDeptCode()) || (this
						.getInsurDeptCode() != null
						&& castOther.getInsurDeptCode() != null && this
						.getInsurDeptCode()
						.equals(castOther.getInsurDeptCode())))
				&& ((this.getReckonUnitOutp() == castOther.getReckonUnitOutp()) || (this
						.getReckonUnitOutp() != null
						&& castOther.getReckonUnitOutp() != null && this
						.getReckonUnitOutp().equals(
								castOther.getReckonUnitOutp())))
				&& ((this.getReckonUnitInp() == castOther.getReckonUnitInp()) || (this
						.getReckonUnitInp() != null
						&& castOther.getReckonUnitInp() != null && this
						.getReckonUnitInp()
						.equals(castOther.getReckonUnitInp())))
				&& ((this.getDeptAttr() == castOther.getDeptAttr()) || (this
						.getDeptAttr() != null
						&& castOther.getDeptAttr() != null && this
						.getDeptAttr().equals(castOther.getDeptAttr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSerialNo() == null ? 0 : this.getSerialNo().hashCode());
		result = 37 * result
				+ (getDeptCode() == null ? 0 : this.getDeptCode().hashCode());
		result = 37 * result
				+ (getDeptName() == null ? 0 : this.getDeptName().hashCode());
		result = 37 * result
				+ (getDeptAlias() == null ? 0 : this.getDeptAlias().hashCode());
		result = 37
				* result
				+ (getClinicAttr() == null ? 0 : this.getClinicAttr()
						.hashCode());
		result = 37 * result
				+ (getOutpOrInp() == null ? 0 : this.getOutpOrInp().hashCode());
		result = 37
				* result
				+ (getInternalOrSergery() == null ? 0 : this
						.getInternalOrSergery().hashCode());
		result = 37 * result
				+ (getInputCode() == null ? 0 : this.getInputCode().hashCode());
		result = 37
				* result
				+ (getInsurDeptCode() == null ? 0 : this.getInsurDeptCode()
						.hashCode());
		result = 37
				* result
				+ (getReckonUnitOutp() == null ? 0 : this.getReckonUnitOutp()
						.hashCode());
		result = 37
				* result
				+ (getReckonUnitInp() == null ? 0 : this.getReckonUnitInp()
						.hashCode());
		result = 37 * result
				+ (getDeptAttr() == null ? 0 : this.getDeptAttr().hashCode());
		return result;
	}

}