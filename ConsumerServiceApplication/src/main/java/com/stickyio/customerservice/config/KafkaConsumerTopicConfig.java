package com.stickyio.customerservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConsumerTopicConfig {
    @Bean
    public NewTopic ShoppingApplicationTopic(){
        return TopicBuilder.name("create-order")
                .build();
    }
}
