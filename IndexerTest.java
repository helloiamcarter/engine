/*
 
 Carter Davis / Indexer Test
 
 Group 4
 ----------------------
 Carter Davis: Indexer
 Chung Meng Chua: Database
 Austin Washburn: FieldSearch
 Tim Miller: Field
 
 */

package org.uiowa.cs2820.engine;

import org.uiowa.cs2820.engine.Field;
import org.uiowa.cs2820.engine.Indexer;
import org.junit.*;
import static org.junit.Assert.*;

public class IndexerTest {
	@Test
	public void testAdd() {
		Indexer i = new Indexer("path");
		Field f = new Field("name","value");
		i.add(f);
		String p = i.db.get("value");
		boolean path = p.contains("path");
		assertEquals(path,true);
		boolean value = p.contains("value");
		assertEquals(value,true);		
		}
	
	@Test
	public void testClose() {
		Indexer i = new Indexer("path");
		Field f = new Field("name","value");
		i.add(f);
		i.close();
		Field g = new Field("name2","value2");
		i.add(g);
		String p = i.db.get("value2");
		assertEquals(p,null);
		}
	
	}