package org.rhpj.controller;

import java.io.IOException;
import java.io.InputStream;

import org.rhpj.form.FileUploadForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/file/upload")
@Controller
public class FileUploadController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		FileUploadForm fileUploadForm = new FileUploadForm();
		model.addAttribute(fileUploadForm);
		return "fileupload/home";
	}

	
	@RequestMapping(params = "upload" , method = RequestMethod.POST) 
	public String upload(FileUploadForm form) throws IOException {
		MultipartFile file = form.getFile();
		String contentType = file.getContentType();
		String parameterName = file.getName();
		String originalFilename = file.getOriginalFilename();
		long fileSize = file.getSize();
		try (InputStream content = file.getInputStream()) {
			
		}
		return "redirect:/file/upload?complete";
	}
	
	
	
}
