package com.qs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qs.dao.QsDao;
import com.qs.model.Test;

@Service
public class QsServiceimpl implements QsService{
@Autowired
private QsDao dao;

public List<Test> list() {
	// TODO Auto-generated method stub
	return dao.list();
}
}
