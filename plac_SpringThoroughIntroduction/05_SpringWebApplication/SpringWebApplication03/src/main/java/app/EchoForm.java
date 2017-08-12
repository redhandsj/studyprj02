package app;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class EchoForm implements Serializable {
    private static final long serialVersionUID = 1L;

    // 日付
    // 必須チェック
    @NotEmpty
    // 日付
    @Pattern(regexp = "^([MTSH]\\d{1,2}|\\d{2,4})/?(0?[1-9]|1[0-2])/?(0?[1-9]|[1-2][0-9]|3[0-1])$")
    private String dtext;

    // 科目
    // 必須チェック
    @NotEmpty
    // 最大文字数チェック
    @Size(max = 100)
    private String text;

    // 金額
    // 必須チェック
    @NotEmpty
    // 最大文字数チェック
    @Size(max = 10)
    // 数値チェック(半角数値で０以上)
    @Min(0)
    @Pattern(regexp = "^[0-9]{1,10}$")
    private String amount;

    public String getDtext() {
		return dtext;
	}

	public void setDtext(String dtext) {
		this.dtext = dtext;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}