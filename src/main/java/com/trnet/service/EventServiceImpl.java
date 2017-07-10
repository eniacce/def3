package com.trnet.service;

import com.trnet.dao.IEvents;
import com.trnet.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by root on 7/9/17.
 */
@Repository
public class EventServiceImpl implements IEventService {

    @Autowired
    IEvents events;

    public List<Event> contactList() {
        return events.listEvents();
    }


}
