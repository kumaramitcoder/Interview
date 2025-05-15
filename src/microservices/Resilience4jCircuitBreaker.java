package microservices;

import java.nio.channels.AsynchronousByteChannel;

public class Resilience4jCircuitBreaker {
    public static void main(String[] args) {

    }
    // 1) FallBack Mechanism
   /* @CircuitBreaker(name="orderService", fallbackMethod = "fallbackResponse")
    public String callOrderService(){
        return restTemplate.getForObject("http://order-service/api/orders", String.class);
    }

    public String fallbackResponse(Exception ex){
        return "Fallback: Order Service is unavailable, Please try again later.";
    }*/

    // 2)  Retry Mechanism for Temporary Failures. If the payment-service fails, the request will retry up to 3 times with a 2-second delay
   /* @Retryable(value = {HttpServerErrorException.class}, maxAttempts = 3, backoff = @Backoff(delay = 1000, multiplier = 2))
    public ResponseEntity<String>  callPaymentService(){
        return restTemplate.getForEntity("http://payment-service/api/payments", String.class);
    }
    @Recover
    public ResponseEntity<String> fallbackForPaymentService(HttpServerErrorException e) {
        // Fallback logic when all retries are exhausted
        return ResponseEntity.status(502).body("Payment service is temporarily unavailable");
    }*/

//    3) Set Timeouts to avoid blocking requests. If a service is unresponsive, requests may hang indefinitely. Timeouts ensure that failing services do not slow down the entire system.
//    Solution : Configure timeouts for outgoing HTTP calls

    /*public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory(){
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectTimeout(3000);
        factory.setReadTimeout(5000);
        return factory;
    }*/

//     4) Implement Fallback Mechanism. When a service fails, return a default response or use a cached response instead.
//    Solution : Store recent successful responses in a cache (e.g. Redis) and serve them when the service is down

    /*public String fallBackOrderDetails(String orderId, Throwable ex){
        return redisCache.get("order_"+ orderId, String.class);
    }*/

//    5) Use Asynchronous Processing for Non-Critical Requests. Instead of synchronous REST calls, consider event-driven communication (kafka, RabbitMQ) for better resilience.


   /* conclusion
    ------------
    To Handle failure recoery in a synchronous REST-based microservices architecture:
        1) Use Circuit Breaker to prevent repeated calls to a failing service.
        2) Implement Retry to temporary failures with exponential backoff.
        3) Set Timeouts to avoid blocking the requset chain.
        4) Use Fallback Response or Cache for missing Data.
        5) Move to Asynchronous communication for non-critical requests.*/



}
