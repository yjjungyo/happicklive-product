package com.factory.happickliveproduct.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ProductController {

//	private final MemberService memberService;
//	@GetMapping("/members/teams/{teamid}")
//	public ResponseEntity<List<Member>> selectAllMember(@PathVariable Long teamid) {
//		return ResponseEntity.ok().body(memberService.findAllMemberByTeamId(teamid));
//		
//	}
}
