package com.taeyeon.zyx.common;

/**
 * 业务模块异常码
 */
public interface ErrorMsgConsts {
	/**
	 * 日志上传
	 */
	interface ClientReport {
		String uidParamNotNull = "uid.param.not.null";
		String fileUrlParamNotNull = "fileUrl.param.not.null";
		String reportTimeParamNotNull = "reportTime.param.not.null";
		String fileSizeParamNotNull = "fileSize.param.not.null";
		String countParamNotValidated = "count.param.not.validated";
		String extensionParamNotNull = "extension.param.not.null";
		String countIsTooLarge = "count.is.too.large";
		String authorizationNotBeenGenerated = "authorization.not.been.generated";
		String countParamNotNull = "count.param.not.null";
		String bucketNameParamNotNull = "bucketName.param.not.null";
	}
	
	/**
	 * 授权
	 */
	interface Authorization {
		String authResultEmpty = "auth.result.empty";
		String authTicketError = "auth.ticket.error";
	}

}
