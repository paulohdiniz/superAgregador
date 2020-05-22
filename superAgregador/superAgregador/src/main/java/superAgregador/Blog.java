package superAgregador;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {
	
	@Id
	private String uri;
	//private String user;
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	/*public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}*/
}
