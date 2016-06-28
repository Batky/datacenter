package eu.me73.datastore.impl;

import eu.me73.datastore.api.DataObject;

/**
 * Example object
 */
public class ExampleDataObject implements DataObject {

    Long id;
    String text;

    public ExampleDataObject(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
