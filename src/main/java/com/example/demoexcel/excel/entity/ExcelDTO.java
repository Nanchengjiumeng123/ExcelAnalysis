package com.example.demoexcel.excel.entity;


import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;

import java.io.Serializable;

@HeadRowHeight(20) // 头高
@ContentRowHeight(15) // 行高
public class ExcelDTO implements Serializable {

    //商品名称
    @ExcelProperty("商品名称")
    @ColumnWidth(35)
    private String productName;
    //条形码
    @ExcelProperty("条形码")
    @ColumnWidth(15)
    private String barCode;
    //品牌名称
    @ExcelProperty("品牌名称")
    @ColumnWidth(15)
    private String brandName;
    //规格型号
    @ExcelProperty("规格型号")
    @ColumnWidth(15)
    private String specifiModels;
    //供应商
    @ExcelProperty("供应商")
    @ColumnWidth(15)
    private String supplier;
    //批发价
    @ExcelProperty("批发价")
    @ColumnWidth(15)
    private String wholesalPrice;
    //平均成本价
    @ExcelProperty("平均成本价")
    @ColumnWidth(15)
    private String averageCostPrice;
    //库存数量
    @ExcelProperty("库存数量")
    @ColumnWidth(15)
    private String stockQuantity;
    //销售量
    @ExcelProperty("销售量")
    @ColumnWidth(15)
    private String salesVolume;
    //自用量
    @ExcelProperty("自用量")
    @ColumnWidth(15)
    private String personalUse;
    //报废量
    @ExcelProperty("报废量")
    @ColumnWidth(15)
    private String scrapQuantity;
    //赠送量
    @ExcelProperty("赠送量")
    @ColumnWidth(15)
    private String giftAmount;
    //盘亏量
    @ExcelProperty("盘亏量")
    @ColumnWidth(15)
    private String lossAmount;
    //盘盈量
    @ExcelProperty("盘盈量")
    @ColumnWidth(15)
    private String profitVolume;
    //拆散量
    @ExcelProperty("拆散量")
    @ColumnWidth(15)
    private String dismantlingAmount;
    //其他出库量
    @ExcelProperty("其他出库量")
    @ColumnWidth(15)
    private String otherOutboundQuantities;
    //退货
    @ExcelProperty("退货")
    @ColumnWidth(15)
    private String returnTheGoods;
    //调拨出库
    @ExcelProperty("调拨出库")
    @ColumnWidth(15)
    private String transferOutOfWarehouse;
    //积分兑换
    @ExcelProperty("积分兑换")
    @ColumnWidth(15)
    private String pointsRedemption;

    // 重写 equals 方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 引用相等
        if (!(o instanceof ExcelDTO)) return false; // 类型检查
        ExcelDTO myEntity = (ExcelDTO) o;
        return productName != null ? productName.equals(myEntity.productName) : myEntity.productName == null; // 根据 name 比较
    }

    // 重写 hashCode 方法
    @Override
    public int hashCode() {
        return productName != null ? productName.hashCode() : 0; // 根据 name 生成 hashCode
    }


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

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSpecifiModels() {
        return specifiModels;
    }

    public void setSpecifiModels(String specifiModels) {
        this.specifiModels = specifiModels;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getWholesalPrice() {
        return wholesalPrice;
    }

    public void setWholesalPrice(String wholesalPrice) {
        this.wholesalPrice = wholesalPrice;
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

    public String getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(String salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getPersonalUse() {
        return personalUse;
    }

    public void setPersonalUse(String personalUse) {
        this.personalUse = personalUse;
    }

    public String getScrapQuantity() {
        return scrapQuantity;
    }

    public void setScrapQuantity(String scrapQuantity) {
        this.scrapQuantity = scrapQuantity;
    }

    public String getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(String giftAmount) {
        this.giftAmount = giftAmount;
    }

    public String getLossAmount() {
        return lossAmount;
    }

    public void setLossAmount(String lossAmount) {
        this.lossAmount = lossAmount;
    }

    public String getProfitVolume() {
        return profitVolume;
    }

    public void setProfitVolume(String profitVolume) {
        this.profitVolume = profitVolume;
    }

    public String getDismantlingAmount() {
        return dismantlingAmount;
    }

    public void setDismantlingAmount(String dismantlingAmount) {
        this.dismantlingAmount = dismantlingAmount;
    }

    public String getOtherOutboundQuantities() {
        return otherOutboundQuantities;
    }

    public void setOtherOutboundQuantities(String otherOutboundQuantities) {
        this.otherOutboundQuantities = otherOutboundQuantities;
    }

    public String getReturnTheGoods() {
        return returnTheGoods;
    }

    public void setReturnTheGoods(String returnTheGoods) {
        this.returnTheGoods = returnTheGoods;
    }

    public String getTransferOutOfWarehouse() {
        return transferOutOfWarehouse;
    }

    public void setTransferOutOfWarehouse(String transferOutOfWarehouse) {
        this.transferOutOfWarehouse = transferOutOfWarehouse;
    }

    public String getPointsRedemption() {
        return pointsRedemption;
    }

    public void setPointsRedemption(String pointsRedemption) {
        this.pointsRedemption = pointsRedemption;
    }
}
