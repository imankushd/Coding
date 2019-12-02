import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CompletableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Executor executor = Executors.newFixedThreadPool(10);
		
		System.out.println("Starting Time : "+LocalDateTime.now());
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> { return 1;},executor).thenApplyAsync(value -> {return value+5;}).thenApplyAsync(value -> {return value+5;}).thenApplyAsync(value -> {return value+5;});
		System.out.println("Output after computation: "+future.get());
		System.out.println("Starting Time : "+LocalDateTime.now());

	}
}