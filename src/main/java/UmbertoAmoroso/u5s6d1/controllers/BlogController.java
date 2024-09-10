package UmbertoAmoroso.u5s6d1.controllers;

import UmbertoAmoroso.u5s6d1.entities.Blog;
import UmbertoAmoroso.u5s6d1.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")

public class BlogController {
    @Autowired
    private BlogServices blogServices;
    //1. GET http://localhost:3001/blog
    @GetMapping
    private String getAllBlogs(){
        return blogServices.findAll().toString();
    }
    //2. GET http://localhost:3001/blog{blogid}
    @GetMapping("/blodid")
    private Blog getBlogById(@PathVariable int blogId){
        return blogServices.findById(blogId);
    }
    //3. POST http://localhost:3001/{+body}
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private String createBlog(@RequestBody Blog body){
        return "Blog creato!";
    }
    //4. PUT  http://localhost:3001/{blogid}{+body}
    @PutMapping("/blogId")
    private String findBlogByIdAndUpdate(@PathVariable int blogId, @RequestBody Blog body){
        return "Hai modificato il blog!";
    }
    //5. DELETE http://localhost:3001/{blogid}
    @DeleteMapping("/blogId")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private String deleteBlog(@PathVariable int blogId){
        return "Hai eliminato il blog!";
    }

}
