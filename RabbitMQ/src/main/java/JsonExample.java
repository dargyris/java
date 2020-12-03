import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class JsonExample {
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        JSONObject json = new JSONObject();
        json.put("from_date", "01-Dec-2020");
        json.put("to_date", "31-Dec-2020");
        json.put("email", "diamantisargiris@gmail.com");
        json.put("query", "select * from data");

        channel.basicPublish("", "Queue-1", null, json.toString().getBytes());
        channel.close();
        connection.close();
    }
}
