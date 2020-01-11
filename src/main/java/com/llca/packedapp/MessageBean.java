package com.llca.packedapp;

import java.io.Serializable;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class MessageBean implements Serializable {

    public String getMessage() {
        return "Кнопка Тест нажата   " + LocalTime.now();
    }
}
