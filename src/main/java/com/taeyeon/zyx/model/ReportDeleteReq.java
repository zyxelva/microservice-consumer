package com.taeyeon.zyx.model;

import com.taeyeon.zyx.common.ErrorMsgConsts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@ApiModel("删除日志文件model")
public class ReportDeleteReq {
    @NotNull(message = ErrorMsgConsts.ClientReport.uidParamNotNull)
    @Min(1)
    @ApiModelProperty(value = "日志对应的uid", required = true)
    private Long id;

    @NotNull(message = ErrorMsgConsts.ClientReport.reportTimeParamNotNull)
    @ApiModelProperty(value = "上报时间", required = true)
    private Long reportTime;


    public Long getReportTime() {
        return reportTime;
    }

    public void setReportTime(Long reportTime) {
        this.reportTime = reportTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
