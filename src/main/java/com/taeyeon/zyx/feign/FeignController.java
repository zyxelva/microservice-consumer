package com.taeyeon.zyx.feign;

import com.taeyeon.zyx.dto.TbClientReportDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: zhuyuanxin
 * @Date: 18/9/29 上午11:01
 * @Description:
 */
@FeignClient(name = "zyxTaeyeon")
//@RequestMapping("/student")
public interface FeignController {
    @GetMapping(value = "/student/getReportById/{id}")
     TbClientReportDto getReportById(@PathVariable("id") Long id);
}
