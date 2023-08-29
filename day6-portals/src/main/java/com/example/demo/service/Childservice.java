package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Childentity;

import com.example.demo.repository.Childrepo;

@Service
public class Childservice {
	@Autowired
	Childrepo srp;
	public Childentity saveinfo(Childentity ssp)
	{
		return srp.save(ssp);
	}
    public List<Childentity> savedetails(List<Childentity> ssp)
    {
    	return (List<Childentity>)srp.saveAll(ssp);
    }
    
	public List<Childentity> showinfo()
	{
		return srp.findAll();
	}
	
	
	public List<Childentity> sortinfo(String s)
	{
		return srp.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<Childentity> getbypage(int pgno,int pgsize){
		Page<Childentity> p=srp.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
		
	}
	
}

