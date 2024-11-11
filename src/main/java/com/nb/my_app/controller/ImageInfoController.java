package com.nb.my_app.controller;

import com.nb.my_app.entity.ImageInfo;
import com.nb.my_app.service.ImageInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class ImageInfoController {
    Logger logger = LoggerFactory.getLogger(Logger.class);

    private final ImageInfoService imageInfoService;


    public ImageInfoController(ImageInfoService imageInfoService) {
        this.imageInfoService = imageInfoService;
    }

    @PostMapping
    public ResponseEntity<String> setImageInfo(@RequestBody ImageInfo imageInfo) {
        imageInfoService.setImageInfo(imageInfo);
        return ResponseEntity.ok("Image info inserted successfully");
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        String message;
        try {
            String uploadDir = "D:\\DataFile\\javaFile\\nb_project\\my_app\\src\\main\\resources\\file\\";
            File uploadedFile = new File(uploadDir + file.getOriginalFilename());
            file.transferTo(uploadedFile);
            message = "上传成功";
            logger.info(message);
            return "upload";
        } catch (IOException e) {
            message = "上传失败：" + e.getMessage();
            logger.error(message);
            return "upload";
        }


    }
}
