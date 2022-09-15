package com.ThanhBegin.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BeginController {

	@GetMapping("/hi") // localhost:8080/hi -> gọi hàm Hello, trả về chuỗi Hello và gọi templates
						// Hello.html
	public String Hello() {

		return "Hello"; // return trang có tên là Hello
	}

	@RequestMapping(value = "/Home", method = RequestMethod.GET) // Phương thức là Get(Lấy thông tin từ server theo URI
	// Hoặc GetMapping("/Home") như trên																// đã cung cấp)
	public String Home(HttpServletRequest request) {
		request.setAttribute("msg", "Hello world!!!"); // msg có thuộc tính là "Hello world!!!"
		return "index";
	}
}
