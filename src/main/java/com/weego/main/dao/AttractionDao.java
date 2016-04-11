package com.weego.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongojack.JacksonDBCollection;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.weego.main.model.LatestAttractions;

@Repository
public class AttractionDao {
	private DB database = MongoConnectionFactory.getDatabase();

	public LatestAttractions getAttractionById(String id) {
		DBCollection collection = database.getCollection("latestattractions");
		JacksonDBCollection<LatestAttractions, String> jackCollection = JacksonDBCollection
				.wrap(collection, LatestAttractions.class, String.class);
		
		BasicDBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		return jackCollection.findOne(query);
	}
	
	public List<String> getAllIds() {
		DBCollection collection = database.getCollection("latestattractions");
		JacksonDBCollection<LatestAttractions, String> coll = JacksonDBCollection.wrap(collection, LatestAttractions.class,
				String.class);
		List<LatestAttractions> attractions =  coll.find().toArray();
		List<String> ids = new ArrayList<String>();
		for(LatestAttractions attraction : attractions) {
			ids.add(attraction.getId().toString());
		}
		System.out.println(ids.size());
		return ids;
	}
}
