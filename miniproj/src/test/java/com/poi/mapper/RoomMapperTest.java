package com.poi.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.testparent.TestParent;
import com.poi.vo.room.RoomVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class RoomMapperTest extends TestParent {

	@Autowired
	private RoomMapper roomMapper;

	@Test
	public void delete()
	{
		log.info(roomMapper.delete(4L));
	}
	
	@Test
	public void update()
	{
		RoomVO vo = new RoomVO();
		vo.setRno(2L);
		vo.setName("A2");
		vo.setPosition("7類 辦難");
		vo.setCompany("BitCamp");	
		log.info(roomMapper.update(vo));
	}
	
	@Test
	public void getList() {
		roomMapper.getList().forEach((vo) -> log.info(vo));
	}

	@Test
	public void select() {
		log.info(roomMapper.select(2L));
	}

	@Test
	public void insert() {
		for (int i = 1; i < 4; i++) {
			RoomVO vo = new RoomVO();
			vo.setName("C"+i);
			vo.setPosition("6類 辦難");
			vo.setCompany("BitCamp");
			log.info(roomMapper.insert(vo));
		}
	}

	@Test
	public void test() {
		log.info(roomMapper);
	}


}
