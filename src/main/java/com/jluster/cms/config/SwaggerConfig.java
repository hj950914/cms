package com.jluster.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Author: hj
 * Date: 2019-05-22 18:00
 * Description: swagger配置类:http://localhost:8080/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket petApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())//添加所有Controller
//               添加指定包下的Controller文件
                .apis(RequestHandlerSelectors.basePackage("com.jluster.cms.controller"))
                .paths(PathSelectors.any())
                .build();

//    Api的一些描述信息
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Swagger2构建RESTful API文档")
                .description("SpringBoot集成Springbox开源项目，实现OAS，构建成RESTful API文档")
                .contact(new Contact("", "", ""))
                .version("v1.0")
                .build();
        docket.apiInfo(apiInfo);

        return docket;

    }

}
