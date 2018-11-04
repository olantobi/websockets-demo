package com.liferon.websocketsdemo.messages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

    @Getter
    private String content;
}
