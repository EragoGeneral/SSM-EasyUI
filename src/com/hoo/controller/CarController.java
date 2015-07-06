package com.hoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hoo.entity.Car;

@Controller
@RequestMapping("/car")
public class CarController {

	@RequestMapping("/add")
	public String addCar(Car car, Model model){
		if(car == null){
			car = new Car();
		}
		car.setId(1);
		car.setVIN("0xwwer11123423");
		car.setYear(2013);
		model.addAttribute("car", car);
		
		return "/car_detail.jsp";
	}
}
