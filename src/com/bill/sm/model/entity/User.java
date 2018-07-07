package com.bill.sm.model.entity;

/**
 * 作者Email:fengminbiao@126.com
 * 创建时间：2018年7月2日下午2:47:45
 * 类说明：用户表
 */
@SuppressWarnings("serial")
public class User extends BaseModel
{
    private String username;		//登录名
    private String password;		//密码
    private String fullname;		//姓名
    private String idNumber;		//身份证号
    private String dateOfBirth;		//出生日期
    private Integer isLock;			//是否锁定
    private Integer workingStatus;	//在职状态
    private String picture;			//头像
    private String validityStartDate;	//有效期开始日期
    private String validityEndDate;		//有效期结束日期
    private String companyId;	//公司Id
    private String postId;			//职位Id
    private String tel;				//电话号码
    private String email;			//邮箱
    private String qq;
    private String wechat;
    private String roleId;
    private String userGroupId;
    
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Integer getIsLock() {
		return isLock;
	}


	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}


	public Integer getWorkingStatus() {
		return workingStatus;
	}


	public void setWorkingStatus(Integer workingStatus) {
		this.workingStatus = workingStatus;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getValidityStartDate() {
		return validityStartDate;
	}


	public void setValidityStartDate(String validityStartDate) {
		this.validityStartDate = validityStartDate;
	}


	public String getValidityEndDate() {
		return validityEndDate;
	}


	public void setValidityEndDate(String validityEndDate) {
		this.validityEndDate = validityEndDate;
	}

	public String getCompanyId()
	{
		return companyId;
	}


	public void setCompanyId(String companyId)
	{
		this.companyId = companyId;
	}


	public String getPostId() {
		return postId;
	}


	public void setPostId(String postId) {
		this.postId = postId;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getQq() {
		return qq;
	}


	public void setQq(String qq) {
		this.qq = qq;
	}


	public String getWechat() {
		return wechat;
	}


	public void setWechat(String wechat) {
		this.wechat = wechat;
	}


	public String getRoleId() {
		return roleId;
	}


	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}


	public String getUserGroupId() {
		return userGroupId;
	}


	public void setUserGroupId(String userGroupId) {
		this.userGroupId = userGroupId;
	}


	@Override
	public String toString()
	{
		return "User [username=" + username + ", password=" + password + ", fullname=" + fullname + ", idNumber="
				+ idNumber + ", dateOfBirth=" + dateOfBirth + ", isLock=" + isLock + ", workingStatus=" + workingStatus
				+ ", picture=" + picture + ", validityStartDate=" + validityStartDate + ", validityEndDate="
				+ validityEndDate + ", companyId=" + companyId + ", postId=" + postId + ", tel=" + tel
				+ ", email=" + email + ", qq=" + qq + ", wechat=" + wechat + ", roleId=" + roleId + ", userGroupId="
				+ userGroupId + ", " + super.toString()
				+ "]";
	}
	
}
