package com.factory.happickliveproduct.domain.vo;

import java.util.Date;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.factory.happickliveproduct.domain.enums.LiveStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok annotation
@AllArgsConstructor //lombok annotation
@NoArgsConstructor //lombok annotation

public class LiveBooking {

	private Long liveId;
	private Date liveDate;
	@Enumerated(EnumType.STRING)
	private LiveStatus liveStauts;
}
