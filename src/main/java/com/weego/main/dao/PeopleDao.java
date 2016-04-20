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
import com.weego.main.model.Peoples;

@Repository
public class PeopleDao {
	private DB database = MongoConnectionFactory.getDatabase();

	public Peoples getPeopleById(String peopleId) {
		DBCollection collection = database.getCollection("peoples");
		JacksonDBCollection<Peoples, String> jackCollection = JacksonDBCollection
				.wrap(collection, Peoples.class, String.class);
		BasicDBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(peopleId));
		return jackCollection.findOne(query);
	}
	
	public List<String> getAllIds() {
		DBCollection collection = database.getCollection("peoples");
		JacksonDBCollection<Peoples, String> coll = JacksonDBCollection.wrap(collection, Peoples.class,
				String.class);
		List<Peoples> peoples =  coll.find().toArray();
		List<String> ids = new ArrayList<String>();
		for(Peoples people : peoples) {
			ids.add(people.getId().toString());
		}
		System.out.println(ids.size());
		return ids;
	}
}
