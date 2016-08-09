package eu.me73.datastore.impl;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import eu.me73.datastore.api.DataObject;
import eu.me73.datastore.api.DataStorage;

/**
 * Created by batky on 6/28/16.
 */
public class ExampleMemoryDataStore implements DataStorage {

    public ListenableFuture<Boolean> store(final DataObject dataObject) {
        return Futures.immediateFuture(null);
    }

}
