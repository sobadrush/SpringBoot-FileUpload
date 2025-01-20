package com.roger.springbootfileupload.controller;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * @author RogerLo
 * @date 2025/1/20
 */
@RestController
public class FileUploadController {

    @PostMapping(path = "/uploadBase64Image", produces = "application/json")
    public Map<String, String> uploadBase64Image(@RequestBody Map<String, String> jsonData) throws IOException {
        var imageBase64 = jsonData.get("imageBase64");
        String base64EncodeStr = imageBase64.split(",")[1];
        byte[] imageByte = Base64.decodeBase64(base64EncodeStr );
        String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 5);
        FileUtils.writeByteArrayToFile(FileUtils.getFile("/Users/roger/Desktop" + String.format("/my-image-%s.jpg", uuid)), imageByte);
        return Map.of("code", "0000", "status", "success");
    }

}
