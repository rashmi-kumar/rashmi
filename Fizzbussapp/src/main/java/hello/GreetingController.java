package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/fizzbuzz")
    public Greeting greeting(@RequestParam(value="start", defaultValue="0") String start,@RequestParam (value="end" ,defaultValue="10") String end,@RequestParam (value="Fizz" ,defaultValue="Fizz ") String fizz,@RequestParam (value="Buzz", defaultValue="Buzz ") String Buzz,@RequestParam (value="Fizzbuzz", defaultValue="FizzBuzz ") String FizzBuzz ) {
		Greeting greet=new Greeting();
		for(int i = Integer.parseInt(start); i<=Integer.parseInt(end); i++){
			if(i%3 == 0 && i%5 == 0){
				greet.setFizzbuzz(FizzBuzz+" ");
			}
			else if(i % 3 == 0){
					greet.setBuzz(fizz+" ");
			}
			else if(i%5==0){
					greet.setFizz(Buzz+" ");
			}
			else {
				greet.setCount(Integer.toString(i)+" ");
			}
		}

        return new Greeting(greet.getCount(),greet.getBuzz(),greet.getFizz(),greet.getFizzbuzz());
    }
}