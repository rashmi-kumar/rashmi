package hello;

public class Greeting {

    private StringBuilder fizz;
    private StringBuilder buzz ;
	private StringBuilder fizzbuzz;
	private StringBuilder count;
	
	public StringBuilder getCount() {
		return count;
	}

	public void setCount(String count1) {
		this.count = count.append(count1);
	}

	public StringBuilder getFizz() {
		return fizz;
	}

	public void setFizz(String fizz1) {
		this.fizz=fizz.append(fizz1);
	}

	public StringBuilder getBuzz() {
		return buzz;
	}

	public void setBuzz(String buzz1) {
		this.buzz = buzz.append(buzz1);
	}

	public StringBuilder getFizzbuzz() {
		return fizzbuzz;
	}

	public Greeting(StringBuilder count,StringBuilder fizz, StringBuilder buzz, StringBuilder fizzbuzz) {
		super();
		this.count=count;
		this.fizz = fizz;
		this.buzz = buzz;
		this.fizzbuzz = fizzbuzz;
	}

	public Greeting() {
		this.count= new StringBuilder();
		this.fizz = new StringBuilder(); 
		this.buzz = new StringBuilder(); 
		this.fizzbuzz = new StringBuilder(); 
	}

	public void setFizzbuzz(String fizzbuzz1) {
		this.fizzbuzz = fizzbuzz.append(fizzbuzz1);
	}
	
}