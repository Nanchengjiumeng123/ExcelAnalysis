package com.example.demoexcel.excel.service.impl;


import com.example.demoexcel.excel.entity.ExcelDTO;
import com.example.demoexcel.excel.service.HandleExcelService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class HandleExcelServiceImpl implements HandleExcelService {


    @Override
    public List<ExcelDTO> handleExcel(List<ExcelDTO> list1, List<ExcelDTO> list2){
        // 将 listB 转换为 Set
        Set<ExcelDTO> set2 = new HashSet<>(list2);

        // 使用 Stream 计算差集
        List<ExcelDTO> difference = list1.stream()
                .filter(entity -> !set2.contains(entity))// 使用 Set
                .collect(Collectors.toList());
        return difference;
    }
}
