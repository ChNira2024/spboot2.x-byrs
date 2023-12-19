package com.eidiko.niranjana.controller;

import java.util.Base64;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eidiko.niranjana.ext.FileUtils;
@Controller
public class ExtensionController {

	@GetMapping("/get")
	@ResponseBody
	public static void getExtensionController()
	{
		byte[] s1 = FileUtils.ExtensionGet(".png").getBytes();
		System.out.println("jk"+s1.toString());   //jk[B@282eaddc

		// Convert the byte array to Base64
        String base64String = Base64.getEncoder().encodeToString(s1);

        // Display the Base64-encoded string
        System.out.println(base64String);
	}
}
