package soloproject.blog.domain.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * SSR 방식의 Controller
 */
//@Controller
public class ViewController implements BlogController {

    @Override
    @GetMapping("/post")
    public String post() {
        return "view/post";
    }

    @Override
    @GetMapping("/patch")
    public String patch() {
        return "view/patch";
    }

    @Override
    @GetMapping("/get")
    public String get() {
        return "view/get";
    }

    @Override
    @GetMapping("/getAll")
    public String getAll() {
        return "view/getAll";
    }

    @Override
    @GetMapping("/delete")
    public String delete() {
        return "view/delete";
    }

}
