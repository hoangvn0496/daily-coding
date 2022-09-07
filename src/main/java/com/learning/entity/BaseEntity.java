package com.learning.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author VuNgocHoang
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
//
//	@Column(name = "CREATED_BY")
//	private String createdBy;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "CREATED_DATETIME")
//	private Date createdDateTime;
//
//	@Column(name = "UPDATED_BY")
//	private String updatedBy;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "UPDATED_DATETIME")
//	private Date updatedDateTime;
//
//	@PrePersist
//	protected void onCreate() {
//		createdDateTime = new Date();
//		updatedDateTime = new Date();
//	}
//
//	@PreUpdate
//	protected void onUpdate() {
//		updatedDateTime = new Date();
//	}
//
//	/**
//	 * Get createdBy
//	 *
//	 * @return the createdBy
//	 */
//	public String getCreatedBy() {
//		return createdBy;
//	}
//
//	/**
//	 * Set createdBy
//	 *
//	 * @param createdBy
//	 */
//	public void setCreatedBy(String createdBy) {
//		this.createdBy = createdBy;
//	}
//
//	/**
//	 * Get createdDateTime
//	 *
//	 * @return the createdDateTime
//	 */
//	public Date getCreatedDateTime() {
//		return createdDateTime;
//	}
//
//	/**
//	 * Set createdDateTime
//	 *
//	 * @param createdDateTime
//	 */
//	public void setCreatedDateTime(Date createdDateTime) {
//		this.createdDateTime = createdDateTime;
//	}
//
//	/**
//	 * Get updatedBy
//	 *
//	 * @return the updatedBy
//	 */
//	public String getUpdatedBy() {
//		return updatedBy;
//	}
//
//	/**
//	 * Set updatedBy
//	 *
//	 * @param updatedBy
//	 */
//	public void setUpdatedBy(String updatedBy) {
//		this.updatedBy = updatedBy;
//	}
//
//	/**
//	 * Get updatedDateTime
//	 *
//	 * @return the updatedDateTime
//	 */
//	public Date getUpdatedDateTime() {
//		return updatedDateTime;
//	}
//
//	/**
//	 * Set updatedDateTime
//	 *
//	 * @param updatedDateTime
//	 */
//	public void setUpdatedDateTime(Date updatedDateTime) {
//		this.updatedDateTime = updatedDateTime;
//	}

}
