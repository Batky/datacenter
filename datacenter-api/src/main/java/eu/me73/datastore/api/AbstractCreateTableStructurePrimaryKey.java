package eu.me73.datastore.api;


import com.google.common.base.Preconditions;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Abstract class to create primary keys from any data to normalized data
 */
public class AbstractCreateTableStructurePrimaryKey {

    private final Map<String, String> fields = new ConcurrentHashMap<>();

    public void addKey(final String originalColumn, final String newColumn) {
        Preconditions.checkNotNull(originalColumn, "Original column cannot be null if creating column key pair.");
        String veryNewColumn;
        if (Objects.isNull(newColumn)) {
            veryNewColumn = originalColumn;
        } else {
            veryNewColumn = newColumn;
        }
        fields.put(originalColumn, veryNewColumn);
    }

}
