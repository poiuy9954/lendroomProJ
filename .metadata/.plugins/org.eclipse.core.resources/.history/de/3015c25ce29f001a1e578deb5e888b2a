package com.poi.vo.room;

import java.util.Arrays;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class RoomToolsVO {

	private Long rno,tool, changeTool_no;
	private List<Long> toolList;
	
	/**
	 * for Insert
	 * for delete
	 */
	public RoomToolsVO(Long rno, Long[] toolList) {
		this.rno = rno;
		this.toolList = Arrays.asList(toolList);
	}
	
}
