package com.my.ssm.core.advice.vo;

/**
 * 存储基本数据
 * 
 * @ClassName SysTrackUser
 * 
 * @author WJ
 * @date 2019年5月6日 下午2:26:11
 *
 */
public class SysTrackUser {

	private Long userId;
	private String userCode;
	private String userName;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
