package com.weego.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongojack.JacksonDBCollection;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.weego.main.model.Areas;
import com.weego.main.model.Shoppings;

@Repository
public class AreaDao {
	private DB database = MongoConnectionFactory.getDatabase();

	public Areas getAreaById(String id) {
		DBCollection collection = database.getCollection("areas");
		JacksonDBCollection<Areas, String> jackCollection = JacksonDBCollection
				.wrap(collection, Areas.class, String.class);
		BasicDBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		return jackCollection.findOne(query);
	}
	
	public List<String> getAllIds() {
		DBCollection collection = database.getCollection("areas");
		JacksonDBCollection<Areas, String> coll = JacksonDBCollection.wrap(collection, Areas.class,
				String.class);
		List<Areas> areas =  coll.find().toArray();
		List<String> ids = new ArrayList<String>();
		for(Areas area : areas) {
			ids.add(area.getId().toString());
		}
		System.out.println(ids.size());
		return ids;
	}
}
