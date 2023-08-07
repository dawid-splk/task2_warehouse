package com.internship.warehouse.product_info;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoService {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private ProductInfoRepository repository;

    public ProductInfoService(KafkaTemplate<String, Object> kafkaTemplate, ProductInfoRepository repository) {
        this.kafkaTemplate = kafkaTemplate;
        this.repository = repository;
    }

    @KafkaListener(topics = "store_control")
    public void listener(ConsumerRecord<String, Object> record) {
        long id = Long.parseLong(record.key());
        ProductInfo productInfo = repository.findById(id);
        kafkaTemplate.send("store_status", String.valueOf(id), productInfo.getQuantity());
    }

}
