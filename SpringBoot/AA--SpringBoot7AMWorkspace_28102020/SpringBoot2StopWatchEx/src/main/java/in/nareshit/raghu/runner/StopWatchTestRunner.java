package in.nareshit.raghu.runner;



import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class StopWatchTestRunner implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		
		StopWatch watch = new StopWatch("TestRunner-run()");
		
		watch.start("LOOP#1"); //taskName
		
		for (int i = 0; i < 10000000; i++) {
			double result = Math.pow(i+1, i) + Math.pow(3, i) ;
		}
		
		watch.stop();
		
		watch.start("LOOP#2"); //taskName
		for (int i = 0; i < 200000000; i++) {
			double result = Math.pow(i+1, i) + Math.pow(3, i) ;
		}
		
		watch.stop();
		
		watch.start("LOOP#3"); //taskName
		
		for (int i = 0; i < 30000000; i++) {
			double result = Math.pow(i+1, i) + Math.pow(3, i) ;
		}
		
		watch.stop();
		
		System.out.println(watch.prettyPrint());
		
		
	}

}
