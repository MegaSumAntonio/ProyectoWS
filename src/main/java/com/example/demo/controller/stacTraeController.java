package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.DAO.stacTraeDao;

@Controller
@RequestMapping("/stacTrae")
public class stacTraeController {
	@Autowired
	private stacTraeDao traeDaoImp;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String listarWS(ModelMap mp) {
		mp.addAttribute("listaWS", traeDaoImp.getWSEnUso());
		return "";
	}
}
