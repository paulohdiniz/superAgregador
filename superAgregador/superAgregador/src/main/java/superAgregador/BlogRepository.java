package superAgregador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog, String>{
	
}
