package com.baymax.hackathon.endpoint;

import com.baymax.hackathon.model.Publisher;
import com.baymax.hackathon.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by npanthi on 11/11/2017.
 */
@RestController
public class PublisherEndpoint {
    @Autowired
    private PublisherService publisherService;

    @RequestMapping(method = RequestMethod.POST, value = "/publisher")
    public Publisher createPublisher(@RequestBody Publisher publisher) {
        return publisherService.createPublisher(publisher);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/publishers")
    public List<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }
}
