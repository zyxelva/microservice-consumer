package com.taeyeon.zyx.feign;

import cn.edu100.hippo.report.dto.ReportParamDto;
import com.taeyeon.zyx.common.Page;
import com.taeyeon.zyx.dto.TbClientReportDto;
import com.taeyeon.zyx.model.ClientReportRes;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * @Author: zhuyuanxin
 * @Date: 18/9/29 上午11:01
 * @Description:
 */
@FeignClient(name = "zyxTaeyeon")
@RequestMapping("/student")
public interface FeignController {
    /**
     * 根据 id查询日志
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/getReportById/{id}")
    TbClientReportDto getReportById(@PathVariable("id") Long id);

    /**
     * 根据 id列表查询日志 List
     *
     * @param ids
     * @return
     */
    @PostMapping("/listByids")
    List<TbClientReportDto> listByIds(@RequestBody Collection<Long> ids);

    /**
     * 根据日志实体查询日志信息
     *
     * @param request
     * @return
     */
    @PostMapping("/listByObject")
    TbClientReportDto listByObject(TbClientReportDto request);

    /**
     * 根据uid，手机号，日志上传的原因类型，上报起始时间，上报结束时间，分页查询日志文件的列表
     *
     * @param reportParamDto
     * @return
     */

    @PostMapping("/page")
    Page<ClientReportRes> page(ReportParamDto reportParamDto);

    /**
     * 日志新增
     *
     * @param dto
     * @return
     */
    @PostMapping("/add")
    Long add(TbClientReportDto dto);

    /**
     * 删除日志
     *
     * @param dto
     * @return
     */
    @PutMapping("/delete")
    int delete(TbClientReportDto dto);
}
