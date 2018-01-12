package org.rhpj.form;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadForm  implements Serializable {

	private static final long serialVersionUID = 1L;

	private MultipartFile file;
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
}
