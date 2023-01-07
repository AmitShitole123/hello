package in.demo.maven.KafkaExa;

import java.util.Hashtable;
import java.util.Map;
//import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.google.gson.JsonObject;



public class Producer1 {

static Logger logger=LogManager.getLogger(Producer1.class);

public static void main(String[] args) {
       DOMConfigurator.configure("log4j.xml");  
   

}

}
