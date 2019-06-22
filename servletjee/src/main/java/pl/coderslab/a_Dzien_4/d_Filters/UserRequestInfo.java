package pl.coderslab.a_Dzien_4.d_Filters;

import java.time.LocalDateTime;

public class UserRequestInfo {

    private int id;
    private LocalDateTime dateTime;
    private String userAgent;
    private int requestTime;

    public UserRequestInfo() {
    }

    public UserRequestInfo(LocalDateTime dataTime, String userAgent, int requestTime) {
        this.dateTime = dataTime;
        this.userAgent = userAgent;
        this.requestTime = requestTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public int getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(int requestTime) {
        this.requestTime = requestTime;
    }
}
