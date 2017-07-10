package com.trnet.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by root on 7/9/17.
 */
@Document(collection = "event")
public class Event {
    public String trait_name;

    public String getTrait_name() {
        return trait_name;
    }

    public void setTrait_name(String trait_name) {
        this.trait_name = trait_name;
    }
}
