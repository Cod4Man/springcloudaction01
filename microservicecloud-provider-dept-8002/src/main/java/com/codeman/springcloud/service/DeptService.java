package com.codeman.springcloud.service;

import com.codeman.springcloud.entities.Dept;

import java.util.List;


public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
