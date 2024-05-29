package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Device;
import com.example.model.Devices;

@Controller
public class DeviceController {
	@Autowired
	RestTemplate rs;
	@RequestMapping("/home")
	public String getDevices()
	{
		return "index.html";
	}
	@RequestMapping("/samsung")
	public ModelAndView getSamsung()
	{
		ModelAndView mv=new ModelAndView("samsung.html");
		Device d1=new Device(1,"Samsung note");
		Device d2=new Device(2,"Samsung tab");
		List<Device>listOfDevices=new ArrayList();
		listOfDevices.add(d1);
		listOfDevices.add(d2);
		Devices devices=new Devices(listOfDevices,"Samsung");
		mv.addObject("devices",listOfDevices);
		return mv;
	}
	@RequestMapping("/apple")
	public ModelAndView getApple()
	{
		ModelAndView mv=new ModelAndView("apple.html");
		Device d1=new Device(1,"iPhone 14 pro");
		Device d2=new Device(2,"iPhone 13 pro");
		List<Device>listOfDevices=new ArrayList();
		listOfDevices.add(d1);
		listOfDevices.add(d2);
		Devices devices=new Devices(listOfDevices,"Apple");
		mv.addObject("devices",listOfDevices);
		return mv;
	}
}
