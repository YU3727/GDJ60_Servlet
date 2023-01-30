package com.pooh.home.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.pooh.home.util.DBConnection;

public class MemberDAO {
//230130 2~3교시 홈쇼핑 table JAVA에 구현하기
	
	//다시 만들어야함
	public MemberDAO() {
	}
	
	
	//setAddMember
	//정보를 어딘가에서 받아와서 DB에 INSERT 하는 메서드 만들기
	public int setAddMember(MemberDTO mDTO) throws Exception{
		
		//연결
		Connection connection = DBConnection.getConnection();
		
		//쿼리문
		String sql = "INSERT INTO MEMBER "
				+ "VALUES(?, ?, ?, ?, ?)";
		
		//쿼리문 미리보내기
		//db로 보내야하니까 db에 연결된 커넥션을 부른다.
		PreparedStatement st = connection.prepareStatement(sql); 
		
		//물음표에 들어갈 값 완성(콘솔에 값을 받아서 입력하는걸로 했는데 외부에서 받아오는걸로 수정해야함)
		st.setString(1, mDTO.getId()); //받아오기위해 매개변수 사용
		st.setString(2, mDTO.getPw());
		st.setString(3, mDTO.getMemberName());
		st.setString(4, mDTO.getMemberPhone());
		st.setString(5, mDTO.getEmail());
		
		//쿼리문 최종실행, 결과처리
		int result = st.executeUpdate();
		
		//연결해제
		DBConnection.disConnection(st, connection);
		
		
		return result;
		
	}
}
