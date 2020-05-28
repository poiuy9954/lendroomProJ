package com.poi.service.reservation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poi.mapper.MeetingMapper;
import com.poi.vo.meeting.MeetingVO;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private MeetingMapper meetingMapper;
	
	@Override
	public void addReservation(MeetingVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteReservation(Long mtno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modiReservation(MeetingVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Map<String,String>> getResrvationList(Long mtno) {
		// TODO Auto-generated method stub
		return meetingMapper.getList(mtno);
	}
	
	@Override
	public List<Map<String, String>> getResrvationListAll() {
		
		return meetingMapper.getList();
	}

	

}