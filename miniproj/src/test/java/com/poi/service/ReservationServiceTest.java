package com.poi.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.service.reservation.ReservationServiceImpl;
import com.poi.service.reservation.ReservationService;
import com.poi.testparent.TestParent;

import lombok.extern.log4j.Log4j;

@Log4j
public class ReservationServiceTest extends TestParent{

	@Autowired
	private ReservationService reservationService;
	
	
	@Test
	public void addReservationTest()
	{
		
	}
	@Test
	public void getReservationTest()
	{
		reservationService.getResrvationList(1L).forEach((vo)->log.info(vo) );

	}

	@Test
	public void getListTest()
	{
		reservationService.getResrvationListAll().forEach((vo)->log.info(vo) );
	}
	
	@Test
	public void test()
	{
		log.info(reservationService);
	}
	
}