package com.poi.mapper;

import com.poi.vo.member.MemberVO;

public interface CRUDMapper<K,E> {
		//crud
		public int insert(K vo);
		
		public K select(E number);

		public int update(K vo);
		
		public int delete(E number);
}
