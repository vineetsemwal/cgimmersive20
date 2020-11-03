package org.cap.apps.uploaddownload.util;

import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Files;

@Component
public class UploadDownloadUtil {
    private final String UPLOAD_DIR_PATH = "/home/vineet/Desktop/data/upload";

    private final File uploadDir=new File(UPLOAD_DIR_PATH);

    public File getUploadDir(){
        return uploadDir;
    }

}
