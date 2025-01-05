package com.example.demoexcel.excel.controller;

import com.example.demoexcel.excel.entity.ExcelDTO;
import com.example.demoexcel.excel.entity.ExcelDTOTwo;
import com.example.demoexcel.excel.service.HandleExcelService;
import com.example.demoexcel.excel.utils.EasyExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author xin.yang3
 * @class ExcelController
 * @desc
 * @date 2024/12/30 11:50
 */
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ExcelController {

    @Autowired
    HandleExcelService handleExcelService;

    @PostMapping("/analysisExcel")
    void handleExcel(@RequestParam("file1") MultipartFile file1,
                     @RequestParam("file2") MultipartFile file2,
                     HttpServletResponse response){
        try {
            List<ExcelDTO> list1 = EasyExcelUtils.readMultipartFile(file1.getInputStream(), ExcelDTO.class, 2);
            List<ExcelDTOTwo> list2 = EasyExcelUtils.readMultipartFile(file2.getInputStream(), ExcelDTOTwo.class, 4);

            List<ExcelDTO> responseList = handleExcelService.handleExcel(list1, list2);
            EasyExcelUtils.export(response, "差集信息", "相关差集信息",responseList, ExcelDTO.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
