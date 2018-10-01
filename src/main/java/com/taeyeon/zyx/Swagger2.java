package com.taeyeon.zyx;

/**
 * @Author: zhuyuanxin
 * @Date: 18/9/29 下午4:37
 * @Description:
 */

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
@EnableSwagger2
//@Profile({"dev", "dev2", "test"})
//@Import({BeanValidatorPluginsConfiguration.class})
public class Swagger2 {

//    @Bean
//    public Docket createRestApi() {
//        List<ResponseMessage> responseMessageList = new ArrayList<>();
//        responseMessageList.add(new ResponseMessageBuilder().code(200).message("请求成功\n"
//                + "无匹配资源:response body 为 0 字节，不返回任何数据\n"
//                + "单个资源：{field1: value1, …}\n"
//                + "资源集合：[{field1: value1, …}]\n"
//                + "资源集合（带分页）：\n"
//                + "{\n"
//                + "  \"list\":  [{\"field1\": \"value1\", …}]\n"
//                + "  \"pageNo\": 0,\n"
//                + "  \"pageSize\": 0,\n"
//                + "  \"total\": 0\n"
//                + "}").build());
//        responseMessageList.add(new ResponseMessageBuilder().code(299).message("业务异常错误，需要展示返回体中的msg").responseModel(new ModelRef("EduErrorResponse")).build());
//        responseMessageList.add(new ResponseMessageBuilder().code(401).message("授权失败，需要引导用户登陆重试").build());
//        responseMessageList.add(new ResponseMessageBuilder().code(403).message("授权失败，用户没有该资源访问权限,也可能用户未登陆，需要提示用户").build());
//        responseMessageList.add(new ResponseMessageBuilder().code(404).message("找不到资源，请检查请求路径").build());
//        responseMessageList.add(new ResponseMessageBuilder().code(500).message("服务器内部错误").responseModel(new ModelRef("EduErrorResponse")).build());
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .globalResponseMessage(RequestMethod.GET, responseMessageList)
//                .globalResponseMessage(RequestMethod.POST, responseMessageList)
//                .globalResponseMessage(RequestMethod.PUT, responseMessageList)
//                .globalResponseMessage(RequestMethod.DELETE, responseMessageList)
//                .apiInfo(apiInfo()).directModelSubstitute(Date.class, Long.class).select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).paths(PathSelectors.any())
//                .build();
//    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("管理后台 RESTful APIs").description("This is created by ZYX")
                .termsOfServiceUrl("http://zyx.yy.com")
                .contact("15612345678").version("1.0").build();
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).paths(PathSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Spring Boot中使用Swagger2构建RESTful APIs")
//                .description("更多Spring Boot相关文章请关注：http://blog.didispace.com/")
//                .termsOfServiceUrl("http://blog.didispace.com/")
//                .contact("程序猿DD")
//                .version("1.0")
//                .build();
//    }
}
