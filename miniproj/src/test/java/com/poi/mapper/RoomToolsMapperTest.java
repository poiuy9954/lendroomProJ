package com.poi.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.testparent.TestParent;
import com.poi.vo.room.RTJoinVO;
import com.poi.vo.room.RoomToolsVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class RoomToolsMapperTest extends TestParent {

	@Autowired
	private RoomToolsMapper roomToolsMapper;
	@Autowired
	private RoomMapper roomMapper;
	
	
	@Test
	public void delete()
	{
		Long[] toolList = {};
		
		RoomToolsVO vo = new RoomToolsVO(1L,toolList);
		log.info(roomToolsMapper.delete(vo));
	}
	
	@Test
	public void update()
	{
		RoomToolsVO vo = new RoomToolsVO();
		vo.setRno(1L);
		vo.setTool(3L);
		vo.setChangeTool_no(4L);
		roomToolsMapper.update(vo);
	}
	
	@Test
	public void getList()
	{
		roomToolsMapper.getList(1L).forEach((vo)->log.info(vo));
	}
	
	@Test
	public void insert()
	{
		Long[] toolList = {1L,2L,3L};
		RoomToolsVO vo = new RoomToolsVO(3L, toolList);
		log.info(roomToolsMapper.insert(vo));
	}
	
	@Test
	public void test()
	{
		log.info(roomToolsMapper);
	}
	
	@Test
	public void test2()
	{
		Long rno = 1L;
		RTJoinVO vo = new RTJoinVO();
		vo.setRoom(roomMapper.select(rno));
		vo.setTools(roomToolsMapper.getListJoined(rno));
		log.info(vo);
	}
	
	
}
