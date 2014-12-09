package com.medicine.models.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * VDeptDict entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "V_DEPT_DICT", schema = "PHAR")
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class VDeptDict implements java.io.Serializable {

	// Fields

	private VDeptDictId id;

	// Constructors

	/** default constructor */
	public VDeptDict() {
	}

	/** full constructor */
	public VDeptDict(VDeptDictId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "serialNo", column = @Column(name = "SERIAL_NO", precision = 3, scale = 0)),
			@AttributeOverride(name = "deptCode", column = @Column(name = "DEPT_CODE", nullable = false, length = 8)),
			@AttributeOverride(name = "deptName", column = @Column(name = "DEPT_NAME", length = 20)),
			@AttributeOverride(name = "deptAlias", column = @Column(name = "DEPT_ALIAS", length = 20)),
			@AttributeOverride(name = "clinicAttr", column = @Column(name = "CLINIC_ATTR", precision = 1, scale = 0)),
			@AttributeOverride(name = "outpOrInp", column = @Column(name = "OUTP_OR_INP", precision = 1, scale = 0)),
			@AttributeOverride(name = "internalOrSergery", column = @Column(name = "INTERNAL_OR_SERGERY", precision = 1, scale = 0)),
			@AttributeOverride(name = "inputCode", column = @Column(name = "INPUT_CODE", length = 8)),
			@AttributeOverride(name = "insurDeptCode", column = @Column(name = "INSUR_DEPT_CODE", length = 4)),
			@AttributeOverride(name = "reckonUnitOutp", column = @Column(name = "RECKON_UNIT_OUTP", length = 8)),
			@AttributeOverride(name = "reckonUnitInp", column = @Column(name = "RECKON_UNIT_INP", length = 8)),
			@AttributeOverride(name = "deptAttr", column = @Column(name = "DEPT_ATTR", precision = 1, scale = 0)) })
	public VDeptDictId getId() {
		return this.id;
	}

	public void setId(VDeptDictId id) {
		this.id = id;
	}

}