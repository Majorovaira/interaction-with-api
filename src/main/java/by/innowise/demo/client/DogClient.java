package by.innowise.demo.client;



import by.innowise.demo.entity.Dog;
import by.innowise.demo.hystrix.DogFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value = "dogs",
        url = "http://shibe.online/api/shibes",
        fallback = DogFallback.class)
public interface DogClient {

    @RequestMapping(method = RequestMethod.GET)
    Dog[] getDog();



}
