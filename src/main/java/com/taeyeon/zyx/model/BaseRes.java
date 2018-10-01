package com.taeyeon.zyx.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础响应对象，web端使用
 */
public abstract class BaseRes implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 实体编号（唯一标识）
	 */
	protected Long id;

	@ApiModelProperty(value = "备注", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String remarks;
	@ApiModelProperty("创建人")
	protected Long createBy;
	@ApiModelProperty("更新人")
	protected Long updateBy;
	@ApiModelProperty("创建时间")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date createDate;
	@ApiModelProperty("更新时间")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected Date updateDate;
	@ApiModelProperty("创建人名字")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String createUserName;
	@ApiModelProperty("更新人名字")
	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
	protected String updateUserName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}

	public Long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}
}
