package com.lhx.spring.springboot;

import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.metrics.jmx.JmxMetricWriter;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;

@Configuration
public class ExportConfiguration {
	@Bean
	@ExportMetricWriter
	public MetricWriter createMetricWriter(MBeanExporter exporter) {
		return new JmxMetricWriter(exporter);
	}
}
