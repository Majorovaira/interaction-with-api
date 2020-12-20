package by.innowise.demo.hystrix;

import by.innowise.demo.client.DogClient;
import by.innowise.demo.entity.Dog;


public class DogFallback implements DogClient {
    @Override
    public Dog[] getDog() {
        return new Dog[0];
    }

}
