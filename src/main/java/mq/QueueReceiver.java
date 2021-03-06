package mq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

import static mq.MQConstants.JMSPASSWORD;
import static mq.MQConstants.JMSURL;
import static mq.MQConstants.JMSUSERNAME;

/**
 * Created by yuwang on 2017/7/31.
 */
public class QueueReceiver {
    // tcp 地址
    public static final String BROKER_URL = JMSURL;
    // 目标，在ActiveMQ管理员控制台创建 http://localhost:8161/admin/queues.jsp
    public static final String TARGET = "yuwang.mq.queue";


    public static void run() throws Exception {

        QueueConnection connection = null;
        QueueSession session = null;
        try {
            // 创建链接工厂
            QueueConnectionFactory factory = new ActiveMQConnectionFactory(JMSUSERNAME, JMSPASSWORD, BROKER_URL);
            // 通过工厂创建一个连接
            connection = factory.createQueueConnection();
            // 启动连接
            connection.start();
            // 创建一个session会话
            session = connection.createQueueSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            // 创建一个消息队列
            Queue queue = session.createQueue(TARGET);
            // 创建消息制作者
            javax.jms.QueueReceiver receiver = session.createReceiver(queue);

            receiver.setMessageListener(new MessageListener() {
                public void onMessage(Message msg) {
                    if (msg != null) {
                        MapMessage map = (MapMessage) msg;
                        try {
                            System.out.println(map.getLong("time") + "接收#" + map.getString("text"));
                        } catch (JMSException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            // 休眠100ms再关闭
            Thread.sleep(1000 * 100);

            // 提交会话
            session.commit();

        } catch (Exception e) {
            throw e;
        } finally {
            // 关闭释放资源
            if (session != null) {
                session.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        QueueReceiver.run();
    }
}
