package com.internousdev.sampleweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.sampleweb.dto.ManagerLoginDTO;
import com.internousdev.sampleweb.util.DBConnector;

public class ManagerLoginDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection con=dbConnector.getConnection();
	private ManagerLoginDTO managerLoginDTO=new ManagerLoginDTO();

	public ManagerLoginDTO getLoginManagerInfo(String loginManagerId,String loginPassword){
		String sql="SELECT * FROM manager_info where user_id=? AND password=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginManagerId);
			ps.setString(2, loginPassword);
			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				managerLoginDTO.setLoginManagerId(rs.getString("user_id"));
				managerLoginDTO.setLoginPassword(rs.getString("password"));

				if(!(rs.getString("id").equals(null))){
					managerLoginDTO.setLoginFlg(true);
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return managerLoginDTO;
	}
	public ManagerLoginDTO getManagerLoginDTO(){
		return managerLoginDTO;
	}
}