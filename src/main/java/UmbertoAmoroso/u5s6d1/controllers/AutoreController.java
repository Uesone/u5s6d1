package UmbertoAmoroso.u5s6d1.controllers;

import UmbertoAmoroso.u5s6d1.entities.Blog;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autore")

public class AutoreController {
    //1. GET http://localhost:3001/autore
    @GetMapping
    private String getAllAutori(){
        return "Ecco tutti gli autori!";
    }
    //2. GET http://localhost:3001/blog{autoreid}
    @GetMapping("/autoreid")
    private String getAutoreById(@PathVariable int autoreId){
        return "Eccco il blog creato!";
    }
    //3. POST http://localhost:3001/{+body}
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private String createBlog(@RequestBody Blog body){
        return "Blog creato!";
    }
    //4. PUT  http://localhost:3001/{autoreid}{+body}
    @PutMapping("/blogId")
    private String findAutoreByIdAndUpdate(@PathVariable int autoreId, @RequestBody Blog body){
        return "Hai modificato il blog!";
    }
    //5. DELETE http://localhost:3001/{autoreid}
    @DeleteMapping("/autoreId")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private String deleteAutore(@PathVariable int autoreId){
        return "Hai eliminato l' Autore!";
    }


}
