package in.demo.maven.KafkaExa;

import java.util.Hashtable;
import java.util.Map;
//import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.google.gson.JsonObject;



public class Producer1 {

static Logger logger=LogManager.getLogger(Producer1.class);

public static void main(String[] args) {
       DOMConfigurator.configure("log4j.xml");  
   


// 1)set properties

// Properties pro=new Properties();
Map<String, Object> pro=new Hashtable <String,Object> ();

pro.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
pro.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
pro.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

// 2)create kafka Producer
KafkaProducer< String, String> kp1=new KafkaProducer <String, String> (pro);
KafkaProducer< String, String> kp2=new KafkaProducer <String, String> (pro);

logger.info("producer created");

// 3)send kafka Producer record
JsonExa ab=new JsonExa();

ProducerRecord< String, String> pr1= new ProducerRecord <String, String> ("topic1",ab.abc());
kp1.send(pr1);
//
// ProducerRecord< String, String> pr2= new ProducerRecord <String, String> ("topic2","Amit");
// kp1.send(pr2);

logger.warn("record send");

kp1.close();


logger.warn("connection close");
}

}
