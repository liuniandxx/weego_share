package com.weego.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongojack.JacksonDBCollection;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.weego.main.model.Restaurants;

@Repository
public class RestaurantDao {
	private DB database = MongoConnectionFactory.getDatabase();
	
	public Restaurants getRestaurantById(String id) {
		DBCollection collection = database.getCollection("restaurants");
		JacksonDBCollection<Restaurants, String> jackCollection = JacksonDBCollection
				.wrap(collection, Restaurants.class, String.class);
		
		BasicDBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(id));
		return jackCollection.findOne(query);
	}
	
	public List<String> getAllIds() {
		DBCollection collection = database.getCollection("restaurants");
		JacksonDBCollection<Restaurants, String> coll = JacksonDBCollection.wrap(collection, Restaurants.class,
				String.class);
		List<Restaurants> restaurants =  coll.find().toArray();
		List<String> ids = new ArrayList<String>();
		for(Restaurants restaurant : restaurants) {
			ids.add(restaurant.getId().toString());
		}
		System.out.println(ids.size());
		return ids;
	}
}
