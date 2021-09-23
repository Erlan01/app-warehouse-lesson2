package uz.pdp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.entity.Attachment;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface AttachmentService {

    ResponseEntity<Attachment> upload(MultipartHttpServletRequest request) throws IOException;

    ResponseEntity<?> get(Long id);

    ResponseEntity<?> download(Long id, HttpServletResponse response) throws IOException;
}
