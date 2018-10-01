package com.taeyeon.zyx.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("新增日志文件model")
public class ReportRes {
	@ApiModelProperty("日志对应的uid")
	private Long uid;
	@ApiModelProperty("日志上传的原因类型: 0-主动上报、1-自动拉取、2-错误触发")
	private Integer type;
	@ApiModelProperty("子类型")
	private Integer subType;
	@ApiModelProperty("日志URL")
	private String fileUrl;
	@ApiModelProperty("反馈内容")
	private String feedback;
	@ApiModelProperty("上报时间")
	private Long reportTime;
	@ApiModelProperty("版本名称")
	private String versionName;
	@ApiModelProperty("版本号")
	private Integer versionCode;
	@ApiModelProperty("发行渠道")
	private String channel;
	@ApiModelProperty("OS类型: 0-Android、1-iOS、2-WinPhone、3-其它")
	private Integer osType;
	@ApiModelProperty("OS版本")
	private String osVersion;
	@ApiModelProperty("设备型号")
	private String deviceModel;
	@ApiModelProperty("APP名称")
	private String appName;
	@ApiModelProperty("设备ID")
	private String deviceId;
	@ApiModelProperty("MacAddress")
	private String macAddr;
	@ApiModelProperty("业务类型")
	private String bizType;
	@ApiModelProperty("业务标识")
	private String bizId;
	@ApiModelProperty("文件大小")
	private String fileSize;
	@ApiModelProperty("手机号码")
	private String phone;
	@ApiModelProperty("网络类型: wifi, 4g")
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
