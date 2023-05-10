package soloproject.blog.domain.blog.controller;

/**
 * SSR 방식의 Controller와 CSR방식의 Controller를 위한 Controller인터페이스.
 */
public interface BlogController {

    Object post();
    Object patch();

    Object get();

    Object getAll();

    Object delete();
    
}
