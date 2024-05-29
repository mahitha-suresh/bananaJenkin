package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Device;
import com.example.model.Devices;
@RestController
@RequestMapping("/apple")
public class DeviceController {
	
	
	@GetMapping("/devices")
	public Devices getApple()
	{
		
		Device d1=new Device(1,"iPhone 15 pro");
		Device d2=new Device(2,"iPhone 13 mini");
		List<Device>listOfDevices=new ArrayList();
		listOfDevices.add(d1);
		listOfDevices.add(d2);
		Devices devices=new Devices(listOfDevices,"Apple");
		
		return devices;
	}
	
}
