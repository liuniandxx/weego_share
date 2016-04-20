package com.weego.main.dao;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.UnknownHostException;

public class MongoConnectionFactory {

    private static Logger logger = LogManager
            .getLogger(MongoConnectionFactory.class);
    private static MongoClient mongoClient = null;

    public static DB getDatabase() {
        DB database;

        if (mongoClient == null) {
            try {
                initializeMongoClient();
            } catch (UnknownHostException e) {
                e.printStackTrace();
                logger.fatal("数据库服务器不可用 {}" + e.getStackTrace());
            }
        }

        String databaseName = "travel1";
        database = mongoClient.getDB(databaseName);
        return database;
    }

    private static void initializeMongoClient() throws UnknownHostException {

        String host = "182.92.176.84";
        //String host = "123.56.65.17";
    	Integer port = 27017;

        mongoClient = new MongoClient(host, port);
    }

    @SuppressWarnings("unused")
    public static synchronized void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
