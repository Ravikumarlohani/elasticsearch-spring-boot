package com.ameritas.procomp.elasticsearch.data;

import java.util.Date;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="order", type="default")
@Data
public class OrderLog {
	@Id
	private String id;
	private Date timestamp;
	private String className;
	private String methodName;
	private String testCase;
	private String result;
	private String parameters;
}
