package UmbertoAmoroso.u5s6d1.services;

import UmbertoAmoroso.u5s6d1.entities.Blog;
import UmbertoAmoroso.u5s6d1.exceptions.NotFoundExceptions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogServices {
    private List<Blog> blogList = new ArrayList<>();
    public List<Blog> findAll(){
        return this.blogList;
    }
    public Blog saveBlog(Blog body){
        Random rndm = new Random();
        body.setId(rndm.nextInt(1,1000));
        this.blogList.add(body);
        return body;
    }
    public Blog findById(int blogId){
        Blog found = null;
        for(Blog blog:this.blogList){
            if (blog.getId() == blogId) found=blog;
        }
        if (found==null)throw new NotFoundExceptions(blogId);
return found;
}
public Blog findByBlogAndUpdate(int blodId, Blog updateblog){
Blog found = null;
for (Blog blog:this.blogList){
if(blog.getId()==blodId){
found=blog;
found.setTitolo(updateblog.getTitolo());
found.setCategoria(updateblog.getCategoria());
found.setContenuto(updateblog.getContenuto());
found.setCover(updateblog.getCover());
found.setMinuti(updateblog.getMinuti());}
}
    if (found==null) throw new NotFoundExceptions(blodId);
    return found;
}

    public void findByIdAndDelete(int blogId){
        Blog found = null;
        for (Blog blog:this.blogList){
            if(blog.getId()==blogId)found=blog;
        }
        if(found == null)throw new NotFoundExceptions(blogId);
        this.blogList.remove(found);
    }

}