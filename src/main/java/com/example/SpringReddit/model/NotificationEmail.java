package com.example.SpringReddit.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEmail {
    private String subject;
    private String recipient;
    private String body;

    public String getRecipient(){
        return recipient;
    }

    public String getSubject(){
        return subject;
    }

    public String getBody(){
        return body;
    }


}
