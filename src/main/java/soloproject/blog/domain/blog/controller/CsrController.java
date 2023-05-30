package soloproject.blog.domain.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import soloproject.blog.domain.blog.dto.BlogDto;

/**
 * CSR 방식의 Controller
 */
@RestController
public class CsrController
         {

//    @Override
    @PostMapping("/post")
    public ResponseEntity post() {
        return new ResponseEntity("Post", HttpStatus.CREATED);
    }

//    @Override
    @GetMapping("/patch")
    public ResponseEntity patch() {
        return new ResponseEntity("Patch", HttpStatus.OK);
    }

//    @Override
    @GetMapping("/get")
    public ResponseEntity get() {
        return new ResponseEntity("Get", HttpStatus.OK);
    }

//    @Override
    @GetMapping("/getAll")
    public ResponseEntity getAll() {
        return new ResponseEntity("GetAll", HttpStatus.OK);
    }

//    @Override
    @GetMapping("/delete")
    public ResponseEntity delete() {
        return new ResponseEntity("delete", HttpStatus.NO_CONTENT);
    }


}
