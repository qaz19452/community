package com.example.community.dto;

/**
 * client_id	string	需要。您从GitHub收到的GitHub App的客户端ID。
 * client_secret	string	需要。您从GitHub收到的GitHub App的客户密码。
 * code	string	需要。您收到的作为对步骤1的响应的代码。
 * redirect_uri	string	授权后将用户发送到应用程序中的URL。
 * state	string	您在步骤1中提供的无法猜测的随机字符串。
 */
public class AccessTokenDto {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
