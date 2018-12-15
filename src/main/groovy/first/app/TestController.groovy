package first.app

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@CompileStatic
@Controller
class TestController {
	@Get("/hello")
	Map<String, String> hello() {
		Map<String, String> map = [
		        'a': 'aaaaaaaaa',
		        'b': 'bbbb'
		]
		return map
	}
}
