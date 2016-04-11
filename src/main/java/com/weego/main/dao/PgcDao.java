package com.weego.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongojack.JacksonDBCollection;
import org.springframework.stereotype.Repository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.weego.main.model.Pgcs;
import com.weego.main.model.Restaurants;


@Repository
public class PgcDao {
    private DB database = MongoConnectionFactory.getDatabase();

    public Pgcs getSpecifiedPgc(String pgcId) {
        DBCollection collection = database.getCollection("pgcs");
        JacksonDBCollection<Pgcs, String> jackCollection = JacksonDBCollection.wrap(collection, Pgcs.class, String.class);
        BasicDBObject query = new BasicDBObject();
        query.put("_id", new ObjectId(pgcId));
        return jackCollection.findOne(query);
    }
    
    public List<String> getAllIds() {
		DBCollection collection = database.getCollection("pgcs");
		JacksonDBCollection<Pgcs, String> coll = JacksonDBCollection.wrap(collection, Pgcs.class,
				String.class);
		List<Pgcs> pgcs =  coll.find().toArray();
		List<String> ids = new ArrayList<String>();
		for(Pgcs pgc : pgcs) {
			ids.add(pgc.getId().toString());
		}
		System.out.println(ids.size());
		return ids;
	}
}
