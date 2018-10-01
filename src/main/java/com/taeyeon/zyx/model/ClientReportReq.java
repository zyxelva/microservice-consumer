package com.taeyeon.zyx.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(description="日志上传记录列表查询 model")
public class ClientReportReq  implements Serializable{

	private static final long serialVersionUID = -7436446897861730114L;
	@ApiModelProperty("日志对应的uid")
	private Long uid;
	@ApiModelProperty("手机号")
	private String phone;
	@ApiModelProperty("查询开始时间")
	private Date queryBeginDate;
	@ApiModelProperty("查询结束时间")
	private Date queryEndDate;
	@ApiModelProperty("日志上传的原因类型uploadReasonType, 0-主动上报、1-自动拉取、2-错误触发，字典:uploadReasonType")
	private Integer type;
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getQueryBeginDate() {
		return queryBeginDate;
	}
	public void setQueryBeginDate(Date queryBeginDate) {
		this.queryBeginDate = queryBeginDate;
	}
	public Date getQueryEndDate() {
		return queryEndDate;
	}
	public void setQueryEndDate(Date queryEndDate) {
		this.queryEndDate = queryEndDate;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}
