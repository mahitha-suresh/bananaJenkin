package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Shoe;
import com.example.model.Shoes;
@RestController
@RequestMapping("/puma")
public class ShoeController {
	
	
	@GetMapping("/shoes")
	public Shoes getPuma()
	{
		
		Shoe s1=new Shoe(1,"Puma Men");
		Shoe s2=new Shoe(2,"Puma Women");
		List<Shoe>listOfShoes=new ArrayList();
		listOfShoes.add(s1);
		listOfShoes.add(s2);
		Shoes shoes=new Shoes(listOfShoes,"Puma");
		
		return shoes;
	}
	
}
