
package org.uiowa.cs2820.engine;

import org.uiowa.cs2820.engine.Database;
import org.uiowa.cs2820.engine.Field;

public class Indexer {
	Indexer(id) {
		String path = id;
		Database db = new Database();
	    }

	add(Field newf) {
		if (path != null) {
			String fieldValue = newf.getFieldValue();
			db.add(path, fieldValue);
			}
		}

	remove(Field newf) {
		if (path != null) {
			String fieldValue = newf.getFieldValue();
			db.remove(path, fieldValue);
			}
		}

	close() {
		path = null;
		}
	}