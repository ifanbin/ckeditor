package com.example.ckeditor2.controller;

import lombok.Data;

@Data
public class UploadImageModel {

    /**
     * 1成功，0失败
     */
    private Integer uploaded;

    private String fileName;

    private String url;

}
