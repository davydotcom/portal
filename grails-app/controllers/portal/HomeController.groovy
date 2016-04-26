package portal
import com.bertramlabs.plugins.*


@SSLRequired
class HomeController {

    def index() { 
    	render view: '/index.gsp', model: [books: Book.count()]
    }
}
