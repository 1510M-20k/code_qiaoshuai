package com.qs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qs.model.Test;
import com.qs.service.QsService;


@Controller
public class QsController {
	@Autowired
	private QsService service;
	@RequestMapping("list")
	public String list(HttpServletRequest request) {
		List<Test> list=service.list();
		request.setAttribute("list",list);
		return "list";
	}
}
