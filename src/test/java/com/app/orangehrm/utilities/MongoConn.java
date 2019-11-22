package com.app.orangehrm.utilities;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientOptions;


import java.util.Arrays;

public class MongoConn {

	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient(new MongoClientURI
				("mongodb://test-class:VFOG6iIRLCLPpRqM@staging-shard-00-00-0rjb5.mongodb.net:27017,staging-shard-00-01-0rjb5.mongodb.net:27017,staging-shard-00-02-0rjb5.mongodb.net:27017/staging-db?ssl=true&replicaSet=staging-shard-0&authSource=admin&retryWrites=true"));

	}

}
