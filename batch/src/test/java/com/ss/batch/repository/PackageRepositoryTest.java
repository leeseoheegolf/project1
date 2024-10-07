package com.ss.batch.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ss.batch.entity.PackageEntity;

@SpringBootTest
public class PackageRepositoryTest {
	
	@Autowired
	private PackageRepository repo;
	
	@Test //Junit이미 스프링부트에서 제공을 하는 라이브러리!
	public void test_save() {
		
		// given : 테스트를 위한 초기 데이터 설정
		PackageEntity entity = new PackageEntity();
		entity.setPackageName("바디 챌린지 pt 12주");
		entity.setPeriod(84);
		
		// when : 실제로 테스트할 작업 수행(데이터베이스 저장)
		repo.save(entity);
		
		// then	: 예상 결과를 검증(ID가 자동으로 생성)
		// 아이디가 자동으로 들어가면 null이 아닌걸 확인 
		assertNotNull(entity.getPackSeq());
		
		
	}
	

}
