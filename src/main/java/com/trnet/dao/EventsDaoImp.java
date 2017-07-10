package com.trnet.dao;

import com.trnet.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by root on 7/9/17.
 */
@Repository
public class EventsDaoImp implements IEvents {
@Autowired
private MongoTemplate mongoTemplate;


    public List<Event> listEvents() {

        return mongoTemplate.findAll(Event.class,"event");
    }


}
