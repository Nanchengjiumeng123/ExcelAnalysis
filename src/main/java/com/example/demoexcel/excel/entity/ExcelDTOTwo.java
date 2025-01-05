package com.example.demoexcel.excel.entity;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;

import java.io.Serializable;

@HeadRowHeight(20) // 头高
@ContentRowHeight(15) // 行高
public class ExcelDTOTwo implements Serializable {

    //商品名称
    @ExcelProperty("商品名称")
    @ColumnWidth(35)
    private String productName;
    //条形码
    @ExcelProperty("条形码")
    @ColumnWidth(15)
    private String barCode;
    //规格型号
    @ExcelProperty("规格型号")
    @ColumnWidth(15)
    private String specifiModels;
    //平均成本价
    @ExcelProperty("平均成本价")
    @ColumnWidth(15)
    private String averageCostPrice;
    //库存数量
    @ExcelProperty("系统库存")
    @ColumnWidth(15)
    private String stockQuantity;
    //盘盈量
    @ExcelProperty("盘点实存")
    @ColumnWidth(15)
    private String profitVolume;
    //盘盈量
    @ExcelProperty("盈亏数量")
    @ColumnWidth(15)
    private String profitNumber;
    //盘盈量
    @ExcelProperty("盈亏小计")
    @ColumnWidth(15)
    private String profitTotal;
    @ExcelProperty("盘点人/盘点数")
    @ColumnWidth(15)
    private String person;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getSpecifiModels() {
        return specifiModels;
    }

    public void setSpecifiModels(String specifiModels) {
        this.specifiModels = specifiModels;
    }

    public String getAverageCostPrice() {
        return averageCostPrice;
    }

    public void setAverageCostPrice(String averageCostPrice) {
        this.averageCostPrice = averageCostPrice;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getProfitVolume() {
        return profitVolume;
    }

    public void setProfitVolume(String profitVolume) {
        this.profitVolume = profitVolume;
    }

    public String getProfitNumber() {
        return profitNumber;
    }

    public void setProfitNumber(String profitNumber) {
        this.profitNumber = profitNumber;
    }

    public String getProfitTotal() {
        return profitTotal;
    }

    public void setProfitTotal(String profitTotal) {
        this.profitTotal = profitTotal;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }


    // 重写 equals 方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 引用相等
        if (!(o instanceof ExcelDTO)) return false; // 类型检查
        ExcelDTOTwo myEntity = (ExcelDTOTwo) o;
        return productName != null ? productName.equals(myEntity.productName) : myEntity.productName == null; // 根据 name 比较
    }

    // 重写 hashCode 方法
    @Override
    public int hashCode() {
        return productName != null ? productName.hashCode() : 0; // 根据 name 生成 hashCode
    }

}
