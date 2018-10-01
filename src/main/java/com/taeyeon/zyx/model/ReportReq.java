package com.taeyeon.zyx.model;

import com.taeyeon.zyx.common.ErrorMsgConsts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@ApiModel("新增日志文件model")
public class ReportReq {
	@NotNull(message = ErrorMsgConsts.ClientReport.uidParamNotNull)
	@Min(1)
	@ApiModelProperty(value="日志对应的uid",required = true)
	private Long uid;
	@ApiModelProperty(value="日志上传的原因类型: 0-主动上报、1-自动拉取、2-错误触发")
	private Integer type;
	@ApiModelProperty(value="子类型")
	private Integer subType;
	@NotNull(message = ErrorMsgConsts.ClientReport.fileUrlParamNotNull)
	@ApiModelProperty(value="日志URL",required = true)
	private String fileUrl;
	@ApiModelProperty(value="反馈内容")
	private String feedback;
	@NotNull(message = ErrorMsgConsts.ClientReport.reportTimeParamNotNull)
	@ApiModelProperty(value="上报时间",required = true)
	private Long reportTime;
	@ApiModelProperty(value="版本名称")
	private String versionName;
	@ApiModelProperty(value="版本号")
	private Integer versionCode;
	@ApiModelProperty(value="发行渠道")
	private String channel;
	@ApiModelProperty(value="OS类型: 0-Android、1-iOS、2-WinPhone、3-其它")
	private Integer osType;
	@ApiModelProperty(value="OS版本")
	private String osVersion;
	@ApiModelProperty(value="设备型号")
	private String deviceModel;
	@ApiModelProperty(value="APP名称")
	private String appName;
	@ApiModelProperty(value="设备ID")
	private String deviceId;
	@ApiModelProperty(value="MacAddress")
	private String macAddr;
	@ApiModelProperty(value="业务类型")
	private String bizType;
	@ApiModelProperty(value="业务标识")
	private String bizId;
	@NotNull(message = ErrorMsgConsts.ClientReport.fileSizeParamNotNull)
	@ApiModelProperty(value="文件大小",required = true)
	private String fileSize;
	@ApiModelProperty(value="手机号码")
	private String phone;
	@ApiModelProperty(value="网络类型: wifi, 4g")
	private String netType;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getSubType() {
		return subType;
	}

	public void setSubType(Integer subType) {
		this.subType = subType;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Long getReportTime() {
		return reportTime;
	}

	public void setReportTime(Long reportTime) {
		this.reportTime = reportTime;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public Integer getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Integer getOsType() {
		return osType;
	}

	public void setOsType(Integer osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getMacAddr() {
		return macAddr;
	}

	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizId() {
		return bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNetType() {
		return netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
	}

}
