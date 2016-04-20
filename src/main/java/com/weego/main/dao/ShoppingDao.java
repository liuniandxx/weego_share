package com.weego.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongojack.JacksonDBCollection;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.weego.main.model.Shoppings;

@Repository
public class ShoppingDao {
	private DB database = MongoConnectionFactory.getDatabase();

	public Shoppings getShoppingById(String id) {
		DBCollection collection = database.getCollection("shoppings");
		JacksonDBCollection<Shoppings, String> jackCollection = JacksonDBCollection
				.wrap(collection, Shoppings.class, String.class);
		BasicDBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		return jackCollection.findOne(query);
	}
	
	public List<String> getAllIds() {
		DBCollection collection = database.getCollection("shoppings");
		JacksonDBCollection<Shoppings, String> coll = JacksonDBCollection.wrap(collection, Shoppings.class,
				String.class);
		List<Shoppings> shoppings =  coll.find().toArray();
		List<String> ids = new ArrayList<String>();
		for(Shoppings shopping : shoppings) {
			ids.add(shopping.getId().toString());
		}
		System.out.println(ids.size());
		return ids;
	}
}
