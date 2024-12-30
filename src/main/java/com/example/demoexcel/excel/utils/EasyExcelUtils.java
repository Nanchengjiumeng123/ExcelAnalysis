package com.example.demoexcel.excel.utils;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


public class EasyExcelUtils {

    private static final String UTF_8 = "UTF-8";

    /**
     * 读取文件数据，并返回一个包含指定类型数据的列表。
     *
     * @param inputStream 文件对象输入流
     * @param clazz       数据对象的类型
     * @param <T>         泛型类型，表示数据对象的类型
     * @return 包含解析后数据对象的列表
     */
    public static <T> List<T> readMultipartFile(InputStream inputStream, Class<T> clazz) {
        // 用于存储解析后的数据对象
        final List<T> dataList = new ArrayList<>();

        EasyExcel.read(inputStream, clazz, new AnalysisEventListener<T>() {
            @Override
            public void invoke(T data, AnalysisContext analysisContext) {
                // 将解析后的数据对象添加到 dataList中
                dataList.add(data);
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                // 读取完成后可以进行一些操作
            }
        }).headRowNumber(2).sheet().doRead();
//        }).sheet().doRead();

        // 返回解析后数据对象的列表
        return dataList;
    }

    /**
     * 导出 Excel文件
     *
     * @param response  HTTP 响应对象
     * @param fileName  文件名，用于在客户端保存文件时显示
     * @param sheetName 工作表名，Excel 文件中的工作表名称
     * @param list      要导出的数据列表
     * @param clazz     实体类的类对象，用于定义 Excel 文件的结构
     * @param <T>       数据列表的元素类型
     */
    public static <T> void export(HttpServletResponse response, String fileName, String sheetName, List<T> list, Class<T> clazz) {
        try {
            // 设置响应内容类型为 Excel 文件
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            // 设置响应字符编码
            response.setCharacterEncoding(UTF_8);

            // 使用 URLEncoder 编码文件名，防止中文乱码
            // replaceAll("\\+", "%20") 用于将空格编码为 %20，而不是 + 号
            String fileNameEncode = URLEncoder.encode(fileName, UTF_8).replaceAll("\\+", "%20");

            // 设置响应头，告诉浏览器这是一个附件
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileNameEncode + ".xlsx");

            // 使用 EasyExcel 写入数据到响应的输出流
            // clazz 参数用于指定 Excel 文件的结构类
            // sheetName 参数用于指定 Excel 文件中的工作表名称
             EasyExcel.write(response.getOutputStream(), clazz)
//                     .registerWriteHandler(new CustomCellWriteHeightConfig())
//                     .registerWriteHandler(new CustomCellWriteWidthConfig())
                     .autoCloseStream(true)
                     .sheet(sheetName)
                     .doWrite(list);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
