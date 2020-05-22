package superAgregador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
	
	//usei static porque quero que todas as classes usando o Service peguem o mesmo repositorio
	@Autowired
	static private BlogRepository blogRepository;
	
	public List<Blog> getAllBlogs(){
		List<Blog> listaDeBlogs = new ArrayList<>();
		blogRepository.findAll().forEach(listaDeBlogs::add);
		return listaDeBlogs;
	}
	public void addBlog(Blog blog) {
		blogRepository.save(blog);
	}
	public void deleteBlog(Blog blog) {
		blogRepository.delete(blog);
	}
}
