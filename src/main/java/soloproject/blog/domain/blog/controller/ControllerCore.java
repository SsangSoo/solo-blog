package soloproject.blog.domain.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


/**
 * SSR 방식의 Controller와 CSR 방식의 Controller를 위한 Controller 인터페이스.
 */
public interface ControllerCore {

    default String postView() {
        return "post";
    }

    default String patchView() {
        return "patch";
    }

    default String getView() {
        return "get";
    }

    default String getAllView() {
        return "getAll";
    }

    default String deleteView() {
        return "delete";
    }

    //

    default ResponseEntity post() {
        return new ResponseEntity(HttpStatus.CREATED);
    }

    default ResponseEntity patch() {
        return new ResponseEntity(HttpStatus.OK);
    }

    default ResponseEntity get() {
        return new ResponseEntity(HttpStatus.OK);
    }

    default ResponseEntity getAll() {
        return new ResponseEntity(HttpStatus.OK);
    }

    default ResponseEntity delete() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    Object post1();
}
