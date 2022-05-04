package custom.account.server.service;

import java.sql.SQLTransactionRollbackException;
import java.util.List;

import org.apache.ibatis.transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;

import custom.account.server.dao.CustomDao;
import custom.account.server.dto.AccountDto;
import custom.account.server.dto.CountryDto;
import custom.account.server.dto.CustomDto;
import custom.account.server.dto.CustomParam;
import custom.account.server.dto.TotalDto;

@Service
@Transactional
public class CustomService {

	@Autowired
	CustomDao dao;
	
	// 거래처 등록
	@Transactional
	public boolean insertTotal(TotalDto dto) {
		int a = dao.insertTotalA(dto);
		int b = dao.insertTotalB(dto);
		
		int n;
		
		if(a>0 && b>0) {
			n = 1;
			System.out.println("둘다수정완료");
		}else {		
			n = 0;
		}
		System.out.println("수정할 n의 값 : " + n);
		return n>0?true:false;
	}
	
	// 나라목록 조회
	public List<CountryDto> searchCountry() {
		return dao.searchCountry();
	}
	
	// 거래처 목록 조회
	public List<CustomDto> searchCustom(CustomParam dto) {
		return dao.searchCustom(dto);
	}
	
	// 선택한 거래처 정보 불러오기
	public TotalDto getCustomDetail(String busiNum) {
		return dao.getCustomDetail(busiNum);
	}
	
	// 선택한 거래처 정보 삭제
	@Transactional
	public boolean deleteTotal(String busiNum) {
		int a = dao.deleteTotalA(busiNum);
		int b = dao.deleteTotalA(busiNum);
		
		int n;
		
		if(a>0 && b>0) {
			n = 1;
			System.out.println("if문 진입");
		}else {			
			n = 0;
		}
		System.out.println("수정할 n의 값 : " + n);
		return n>0?true:false;
	}
	
	// 선택한 거래처 정보 수정
	@Transactional
	public boolean updateTotal(TotalDto dto) throws Exception {
		int a = dao.updateTotalA(dto);
		int b = dao.updateTotalB(dto);
		
		int n;
		
		if(a>0 && b>0) {
			n = 1;
			System.out.println("if문 진입");
		}else {			
			n = 0;
		}
		System.out.println("수정할 n의 값 : " + n);
		return n>0?true:false;
	}
	
}
