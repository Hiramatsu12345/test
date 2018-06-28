package com.internousdev.sampleweb.dto;

public class ManagerLoginDTO {

	private String loginManagerId;
	private String loginPassword;
	private boolean loginFlg=false;

	public String getLoginManagerId(){
		return loginManagerId;
	}
	public void setLoginManagerId(String loginManagerId){
		this.loginManagerId=loginManagerId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg=loginFlg;
	}
}
