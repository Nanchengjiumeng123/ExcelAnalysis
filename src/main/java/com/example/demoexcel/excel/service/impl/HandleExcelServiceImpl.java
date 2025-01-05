package com.example.demoexcel.excel.service.impl;


import com.example.demoexcel.excel.entity.ExcelDTO;
import com.example.demoexcel.excel.entity.ExcelDTOTwo;
import com.example.demoexcel.excel.service.HandleExcelService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class HandleExcelServiceImpl implements HandleExcelService {


    @Override
    public List<ExcelDTO> handleExcel(List<ExcelDTO> list1, List<ExcelDTOTwo> list2){
        List<String> productNameLists = list2.stream().map(ExcelDTOTwo::getProductName).collect(Collectors.toList());
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duolicates = new HashSet<>();
        for (String productName : productNameLists) {
            if (!seen.add(productName)){
                duolicates.add(productName);
            }
        }

        Set<String> productNameSets = list2.stream().map(ExcelDTOTwo::getProductName).collect(Collectors.toSet());
        Set<String> collect = productNameSets.stream().map(item -> {
            String substring = item.substring(item.indexOf("】") + 1);
            return substring;
        }).collect(Collectors.toSet());

        // 使用 Stream 计算差集
        List<ExcelDTO> difference = list1.stream()
                .filter(entity -> !collect.contains(entity.getProductName()))// 使用 Set
                .collect(Collectors.toList());

        if (!CollectionUtils.isEmpty(duolicates)){
            ExcelDTO dto1 = new ExcelDTO();
            difference.add(dto1);
            ExcelDTO dto2 = new ExcelDTO();
            dto2.setProductName("盘点详情中重复的数据如下：");
            difference.add(dto2);

            List<ExcelDTO> collect1 = duolicates.stream().map(str -> {
                ExcelDTO dto3 = new ExcelDTO();
                dto3.setProductName(str);
                return dto3;
            }).collect(Collectors.toList());
            difference.addAll(collect1);
        }
        return difference;
    }

}
