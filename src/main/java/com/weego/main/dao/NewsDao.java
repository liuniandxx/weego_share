package com.weego.main.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.weego.main.model.News;
import org.bson.types.ObjectId;
import org.mongojack.JacksonDBCollection;
import org.springframework.stereotype.Repository;

@Repository
public class NewsDao {
    private DB database = MongoConnectionFactory.getDatabase();

    public News getNewsById(String id) {
        DBCollection collection = database.getCollection("news");

        JacksonDBCollection<News, String> jackCollection = JacksonDBCollection
                .wrap(collection, News.class, String.class);

        BasicDBObject query = new BasicDBObject();
        query.put("_id", new ObjectId(id));

        return jackCollection.findOne(query);
    }
}
