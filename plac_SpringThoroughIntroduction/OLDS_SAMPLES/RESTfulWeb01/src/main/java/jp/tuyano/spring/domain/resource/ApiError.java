package jp.tuyano.spring.domain.resource;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * アプリのエラー情報を保持する
 * @author h-dodo
 *
 */
public class ApiError  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String message;

	@JsonProperty("documentation_url")
	private String documentationUrl;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDocumentationUrl() {
		return documentationUrl;
	}

	public void setDocumentationUrl(String documentationUrl) {
		this.documentationUrl = documentationUrl;
	}


}
