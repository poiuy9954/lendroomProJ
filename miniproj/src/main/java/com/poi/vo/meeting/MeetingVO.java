package com.poi.vo.meeting;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class MeetingVO {

	private Long mtno, room, openMember;
	private String title;
	private LocalDateTime reservationStartDate, reservationEndDate,realStartDate,realEndDate, regDate,modiDate;
	
}
