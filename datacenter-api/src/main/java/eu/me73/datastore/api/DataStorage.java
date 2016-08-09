package eu.me73.datastore.api;

import com.google.common.util.concurrent.ListenableFuture;

/**
 * Generic API for data storage
 */
public interface DataStorage {

    ListenableFuture<Boolean> store(final DataObject dataObject);

}
