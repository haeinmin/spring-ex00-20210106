package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	//이전에는 클래스 로딩, 커넥션 열기, statement 얻기, query 실행, resultSet 처리, 커넥션 닫기
	//이제 나머지는 mybatis가 처리, query만 작성하면 됨
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	public String getTime2();
}