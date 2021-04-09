package com.factory.happickliveproduct.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok annotation
@AllArgsConstructor //lombok annotation
@NoArgsConstructor //lombok annotation
public class Questioner {
	private String questionerId;
	private String questionerName;
}
