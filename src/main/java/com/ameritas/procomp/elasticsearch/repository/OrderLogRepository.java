package com.ameritas.procomp.elasticsearch.repository;
import com.ameritas.procomp.elasticsearch.data.OrderLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderLogRepository extends ElasticsearchRepository<OrderLog, String> {

}
