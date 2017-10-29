package com.api.amqp.domain;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author kaze 2017/10/29
 */
@Document(collection = "system_log")
public class SystemLog {

    @Indexed(unique = true)
    @Field("log_code")
    private Long logCode;

    @Field("username")
    private String username;

    @Field("create_time")
    private Date createTime;

    @Field("client_ip")
    private String clientIp;

    @Field("server_ip")
    private String serverIp;

    @Field("detail")
    private String detail;

    @Field("user_agent")
    private String userAgent;

    public Long getLogCode() {
        return logCode;
    }

    public void setLogCode(Long logCode) {
        this.logCode = logCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

}
