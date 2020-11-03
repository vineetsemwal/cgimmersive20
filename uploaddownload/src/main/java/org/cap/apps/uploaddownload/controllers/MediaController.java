package org.cap.apps.uploaddownload.controllers;

import org.cap.apps.uploaddownload.util.UploadDownloadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Blob;


/**
 * @NotBlank on string to validate string is not empty
 * @Size(min=2, max=5) to validate string is of length greater than equal to two and smaller than equal to 5
 * @Min(5) to validate number whether number is minimum 5
 * @Max(5) to validate number whether number is maximum 5
 * @Validated on class will help triggering validation on methods
 * @Valid if you require to trigger validations on the fields of object
 */
@Validated
@RequestMapping("/medias")
@RestController
public class MediaController {

    @Autowired
    private UploadDownloadUtil util;

    @PostMapping("/add")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        File uploadDir=util.getUploadDir();
        File target = new File(uploadDir,file.getOriginalFilename());
        Path targetPath = Paths.get(target.toURI());
        long size = Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
        return "file uploaded with size=" + size;
    }

    @GetMapping(value = "/{filename}/download", produces = "application/octet-stream")
    public ResponseEntity<Resource> downloadMedia(@PathVariable("filename")String filename) throws IOException{
        File uploadDir=util.getUploadDir();
        File downloadFile=new File(uploadDir,filename);
        Resource resource=new UrlResource(downloadFile.toURI());
        HttpHeaders headers=new HttpHeaders();
        headers.set("Content-Disposition","attachment; filename="+filename);
        ResponseEntity<Resource>responseEntity=new ResponseEntity<>(resource, headers,HttpStatus.OK);
        return responseEntity;
    }


}
