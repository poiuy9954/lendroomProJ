package com.poi.mapper;

import java.util.List;

import com.poi.vo.meeting.MeetingVO;

public interface MeetingMapper extends CRUDMapper<MeetingVO, Long> {

	
	public List<MeetingVO> getList();
	
	
	
}
