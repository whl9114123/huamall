package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.ImageBiz;

@RestController
public class ImageController {

	@Autowired
	private ImageBiz ib;

	public ImageBiz getIb() {
		return ib;
	}

	public void setIb(ImageBiz ib) {
		this.ib = ib;
	}
	
}
