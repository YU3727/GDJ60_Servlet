package com.pooh.home.test;

import java.util.List;

import com.pooh.home.member.MemberDAO;
import com.pooh.home.member.MemberDTO;
import com.pooh.home.product.ProductDAO;
import com.pooh.home.product.ProductDTO;
import com.pooh.home.product.ProductOptionDTO;

public class ProductService { //test용 메서드
//230130 6교시 Service는 DAO로 작업을 하기 전/후처리를 하기 위한 메서드명이다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ㅋㅋㅋ
		ProductDAO pDAO = new ProductDAO();
		ProductDTO pDTO = new ProductDTO();
		
		pDTO.setProductName("product1");
		pDTO.setProductDetail("detail1");
//		pDTO.setProductScore(0.0); //이렇게 하지말고 처음에 쿼리문 넣을때 default로 0.0으로 주자
		
		ProductOptionDTO poDTO = new ProductOptionDTO();
		poDTO.setOptionName("optionName1");
		poDTO.setOptionPrice(100);
		poDTO.setOptionStock(10);
		poDTO.setProductNum(null);
		
		poDTO = new ProductOptionDTO();
		poDTO.setOptionName("optionName2");
		poDTO.setOptionPrice(200);
		poDTO.setOptionStock(20);
		poDTO.setProductNum(null);
		
		int result = 0;
		
		try {
			//커넥션
//			Connection connection = DBConnection.getConnection();
//			System.out.println(connection != null); //true가 나오면 성공
			
			//setAddMember 테스트
//			result = mDAO.setAddMember(mDTO);
//			System.out.println(result != 0);
			
			//setAddProduct 테스트
//			result = pDAO.setAddProduct(pDTO);
//			System.out.println(result != 0);
			
			//getProductList 테스트
			List<ProductDTO> ar = pDAO.getProductList();
			System.out.println(ar.size() != 0);
			
			
			//setAddProductOption 테스트
			//getProductNum은 시퀀스번호를 먼저 만들고 집어넣은 다음에 프로덕트를 만듬
			Long num = pDAO.getProductNum();
			pDTO.setProductNum(num);
			result = pDAO.setAddProduct(pDTO);
			//productnum은 시퀀스로 가져오기 때문에
			
			//제일 최근에 등록한 Product를 자동으로 찾기위해 getMax 사용
			//getMax는 프로덕트를 만들고 시퀀스번호를 가져와야했음
//			Long num = pDAO.getMax(); 
//			poDTO.setProductNum(num);
			
			if(result > 0) {
				pDAO.setAddProductOption(poDTO);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
