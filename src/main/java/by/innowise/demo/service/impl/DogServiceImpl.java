package by.innowise.demo.service.impl;

import by.innowise.demo.client.DogClient;
import by.innowise.demo.service.DogService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@Service
public class DogServiceImpl implements DogService {



    @Autowired
    private DogClient dogClient;

    @Override
    public byte[] getDog() throws IOException {

        String urlString =  dogClient.getDog()[0].getUrlImage();
        URL url = new URL(urlString);
        InputStream is = url.openStream();

        return IOUtils.toByteArray(is);
    }

}
