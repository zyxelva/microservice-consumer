package com.taeyeon.zyx.controller;

import cn.edu100.hippo.report.dto.ReportParamDto;
import com.taeyeon.zyx.common.Page;
import com.taeyeon.zyx.dto.TbClientReportDto;
import com.taeyeon.zyx.feign.FeignController;
import com.taeyeon.zyx.model.*;
import com.taeyeon.zyx.utils.BeanUtil;
import com.taeyeon.zyx.utils.DateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Date;
import java.util.List;


/**
 * 订单微服务
 *
 * @author roy
 */
@Api(tags = "订单信息-zyx")
@RestController
@RequestMapping("/order")
@Validated
public class OrderController {

    private final Logger logger = LoggerFactory.getLogger(OrderController.class);


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignController feignController;

    @Value("${user.url}")
    private String remoteURL;

    @ApiOperation(value = "测试", notes = "")
//	@ApiImplicitParam(name = " name",paramType = "path", required = true, dataType = "String")
    @GetMapping("/testHello/{name}")
    public String testHello(@PathVariable("name") String name) {
        return "Hello world," + name;
    }

    @ApiOperation(value = "根据日志ID查询日志", notes = "")
//	@ApiImplicitParam(name = " id", value = "id", paramType = "query", required = true, dataType = "Long")
    @GetMapping("/user/getReportById")
    public TbClientReportDto getReportById(@RequestParam("id") Long id) {
        System.out.println("================this is one=====================");
        String url = remoteURL + "getReportById/" + id;
        TbClientReportDto tbClientReportDto = restTemplate.getForObject(url, TbClientReportDto.class);
        return tbClientReportDto;
    }

    @ApiOperation(value = "根据日志ID查询日志", notes = "")
//	@ApiImplicitParam(name = " id", value = "id", paramType = "query", required = true, dataType = "Long")
    @GetMapping("/user/getReportById2")
    public ResponseEntity<TbClientReportDto> getReportById2(@RequestParam("id") Long id) {
        System.out.println("================this is two=====================");
        String url = remoteURL + "getReportById2/" + id;
        ResponseEntity<TbClientReportDto> tbClientReportDto = restTemplate.getForEntity(url, TbClientReportDto.class);
        return tbClientReportDto;
    }

    @ApiOperation(value = "根据日志ID查询日志Feign", notes = "")
//	@ApiImplicitParams({
//			@ApiImplicitParam(name = " id", value = "id", paramType = "query", required = true, dataType = "Long")
//	})
    @GetMapping("/user/getReportByIdWithFeign")
    public TbClientReportDto getReportByIdWithFeign(@RequestParam("id") Long id) {
        System.out.println("================this is getReportByIdWithFeign=====================");
//		String url = remoteURL+"getReportById/" + id;
        TbClientReportDto tbClientReportDto = feignController.getReportById(id);
        return tbClientReportDto;
    }

    @ApiOperation(value = "根据日志ID查询日志列表", notes = "")
//	@ApiImplicitParam(name = " ids", value = "ids", paramType = "body", required = true, dataType = "Collection")
    @PostMapping("/user/listByIds")
    public List<TbClientReportDto> listByIds(@RequestBody Collection<Long> ids) {
        System.out.println("================this is listByIds=====================");
        List<TbClientReportDto> clientReportDtoList = feignController.listByIds(ids);
        return clientReportDtoList;
    }

    @ApiOperation(value = "根据日志对象查询日志列表", notes = "")
//	@ApiImplicitParam(name = " ids", value = "ids", paramType = "body", required = true, dataType = "Collection")
    @PostMapping("/user/listByObject")
    public TbClientReportDto listByObject(@RequestBody TbClientReportDto request) {
        System.out.println("================this is listByObject=====================");

        TbClientReportDto tbClientReportDto = feignController.listByObject(request);
        return tbClientReportDto;
    }

    @ApiOperation(value = "分页查询日志文件的列表", notes = "")
    @ApiImplicitParam(name = "clientReportReq", value = "日志查询对象", paramType = "body", required = true, dataType = "ClientReportReq")
    @PostMapping("/page")
    public ResponseEntity<Page<ClientReportRes>> page(@RequestBody @Valid ClientReportReq clientReportReq) {
        return ResponseEntity.ok(feignController.page(BeanUtil.copy(clientReportReq, ReportParamDto.class)));
    }

    @ApiOperation(value = "保存日志上传信息", notes = "")
    @PostMapping("/add")
    public ResponseEntity<Long> add(@RequestBody @Valid ReportReq reportReq ) {
        System.out.println("================add===============");
        TbClientReportDto tbClientReportDto = BeanUtil.copy(reportReq, TbClientReportDto.class);
        tbClientReportDto.setReportTime(DateUtils.getDate(reportReq.getReportTime()));
        tbClientReportDto.setCreateBy(1L);
        tbClientReportDto.setCreateDate(new Date());
        return ResponseEntity.ok(feignController.add(tbClientReportDto));
    }

    @PutMapping("/delete")
    public ResponseEntity<Long> delete(@RequestBody @Valid ReportDeleteReq reportDeleteReq){
        if(null==reportDeleteReq){
            logger.error("delete, but reportDeleteReq is null");
            return ResponseEntity.ok(Long.valueOf(0));
        }
        System.out.println("================delete===============");
        TbClientReportDto tbClientReportDto = feignController.getReportById(reportDeleteReq.getId());
        if(null==tbClientReportDto)
        {
            logger.debug("tbClientReportDto does not exist. id:{}",tbClientReportDto.getId());
            return ResponseEntity.ok(Long.valueOf(0));
        }
        int row = feignController.delete(tbClientReportDto);
        return ResponseEntity.ok(Long.valueOf(row));
    }

}
