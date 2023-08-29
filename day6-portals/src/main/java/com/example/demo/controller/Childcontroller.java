package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Childentity;

import com.example.demo.service.Childservice;


@RestController
public class Childcontroller {
	@Autowired
	Childservice ar;
	
	@PostMapping("addchild")
	public Childentity addndetails(@RequestBody Childentity ssp)
	{
		return ar.saveinfo(ssp);
		
		
	}
	@PostMapping("addnchild")
	public List<Childentity> addndetails(@RequestBody List<Childentity> ssp)
	{
		return ar.savedetails(ssp);
		
		
	}
	
	@GetMapping("showchild")
	public List<Childentity> show()
	{
		return ar.showinfo();
	}
	
	@GetMapping("sort/{name}")
	public List<Childentity> getsortinfo(@PathVariable String name){
		return ar.sortinfo(name);
	}
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Childentity> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return ar.getbypage(pageno,pagesize);
	}
}
	


	
