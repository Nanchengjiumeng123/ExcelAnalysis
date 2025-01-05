package com.example.demoexcel.excel.service;


import com.example.demoexcel.excel.entity.ExcelDTO;
import com.example.demoexcel.excel.entity.ExcelDTOTwo;

import java.util.List;

public interface HandleExcelService {

    /**
     * 处理excel
     */
    List<ExcelDTO> handleExcel(List<ExcelDTO> list1, List<ExcelDTOTwo> list2);

}
