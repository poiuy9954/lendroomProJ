package com.poi.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.testparent.TestParent;
import com.poi.vo.meeting.MeetingVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class MeetingMapperTest extends TestParent {

	@Autowired
	private MeetingMapper meetingMapper;

	@Test
	public void delete() {
		Long number = 3L;
		log.info(meetingMapper.delete(number));
	}

	@Test
	public void update() {
		MeetingVO vo = new MeetingVO();
		vo.setMtno(1L);
		vo.setRealStartDate(LocalDateTime.now());
		vo.setRealEndDate(LocalDateTime.now().plusHours(2L));
		log.info(meetingMapper.update(vo));
	}

	@Test
	public void getList() {
		meetingMapper.getList().forEach((vo) -> log.info(vo));
		;
	}

	@Test
	public void read() {
		log.info(meetingMapper.select(1L));
	}

	@Test
	public void insert() {

		LocalDateTime reservationStartDate = LocalDateTime.of(2020, 05, 20, 9, 00, 00);
		MeetingVO vo = new MeetingVO();
		vo.setTitle("부서비 사용처 " + reservationStartDate.toLocalDate());
		vo.setOpenMember(1L);
		vo.setRoom(3L);
		vo.setReservationStartDate(reservationStartDate);
		vo.setReservationEndDate(reservationStartDate.plusHours(1));
		log.info(meetingMapper.insert(vo));

	}


	@Test
	public void test() {
		log.info(meetingMapper);
	}

}
