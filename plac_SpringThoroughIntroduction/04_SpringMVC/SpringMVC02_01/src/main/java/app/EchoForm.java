package app;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class EchoForm implements Serializable {
    private static final long serialVersionUID = 1L;

    // 入力値を保持するプロパティを定義する
    // 必須チェック
    @NotEmpty
    // 最大文字数チェック
    @Size(max = 100)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}