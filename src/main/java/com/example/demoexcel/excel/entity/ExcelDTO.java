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
    @ExcelProperty("*商品名称")
    @ColumnWidth(35)
    private String productName;
    //商品名称
    @ExcelProperty("通用名称")
    @ColumnWidth(35)
    private String productNameTongyong;

    @ExcelProperty("一级分类")
    @ColumnWidth(15)
    private String yijifenlei;

    @ExcelProperty("二级分类")
    @ColumnWidth(15)
    private String erjifenlei;
    @ExcelProperty("供应商")
    @ColumnWidth(15)
    private String supplier;
    //品牌名称
    @ExcelProperty("品牌")
    @ColumnWidth(15)
    private String brandName;
    //适合宠物类型
    @ExcelProperty("适合宠物类型")
    @ColumnWidth(15)
    private String suit;

    //条形码
    @ExcelProperty("保质期")
    @ColumnWidth(15)
    private String baozhiqi;
    //条形码
    @ExcelProperty("条形码")
    @ColumnWidth(15)
    private String barCode;
    //条形码
    @ExcelProperty("更多条形码")
    @ColumnWidth(15)
    private String moreBarCode;
    //规格型号
    @ExcelProperty("规格型号")
    @ColumnWidth(15)
    private String specifiModels;
    //规格型号
    @ExcelProperty("单位")
    @ColumnWidth(15)
    private String unit;
    //批发价
    @ExcelProperty("批发价")
    @ColumnWidth(15)
    private String wholesalPrice;
    //库存
    @ExcelProperty("库存")
    @ColumnWidth(15)
    private String stockQuantity;
    //平均成本价
    @ExcelProperty("平均成本价")
    @ColumnWidth(15)
    private String averageCostPrice;

    @ExcelProperty("零售价")
    @ColumnWidth(15)
    private String lingshouujia;

    @ExcelProperty("会员价")
    @ColumnWidth(15)
    private String huiyuanjia;

    @ExcelProperty("是否支持负库存销售")
    @ColumnWidth(15)
    private String kucunxiaoshou;

    @ExcelProperty("库存预警数")
    @ColumnWidth(15)
    private String kucunyujing;

    @ExcelProperty("是否参与会员打折")
    @ColumnWidth(15)
    private String huiyuandazhe;

    @ExcelProperty("是否复购提醒")
    @ColumnWidth(15)
    private String shifoufugou;

    @ExcelProperty("重量")
    @ColumnWidth(15)
    private String zhongliang;

    @ExcelProperty("药品分类(处方药/非处方药)")
    @ColumnWidth(15)
    private String yaowufenlei;

    @ExcelProperty("投药单位")
    @ColumnWidth(15)
    private String touyao;

    @ExcelProperty("1库存单位等于投药单位数")
    @ColumnWidth(15)
    private String nihao;

    @ExcelProperty("用法")
    @ColumnWidth(15)
    private String yongfa;

    @ExcelProperty("药物信息")
    @ColumnWidth(15)
    private String yaowu;

    @ExcelProperty("生产厂商")
    @ColumnWidth(15)
    private String shengchan;

    @ExcelProperty("批准文号")
    @ColumnWidth(15)
    private String pizhun;

    @ExcelProperty("备注")
    @ColumnWidth(15)
    private String remark;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNameTongyong() {
        return productNameTongyong;
    }

    public void setProductNameTongyong(String productNameTongyong) {
        this.productNameTongyong = productNameTongyong;
    }

    public String getYijifenlei() {
        return yijifenlei;
    }

    public void setYijifenlei(String yijifenlei) {
        this.yijifenlei = yijifenlei;
    }

    public String getErjifenlei() {
        return erjifenlei;
    }

    public void setErjifenlei(String erjifenlei) {
        this.erjifenlei = erjifenlei;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getBaozhiqi() {
        return baozhiqi;
    }

    public void setBaozhiqi(String baozhiqi) {
        this.baozhiqi = baozhiqi;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getMoreBarCode() {
        return moreBarCode;
    }

    public void setMoreBarCode(String moreBarCode) {
        this.moreBarCode = moreBarCode;
    }

    public String getSpecifiModels() {
        return specifiModels;
    }

    public void setSpecifiModels(String specifiModels) {
        this.specifiModels = specifiModels;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getWholesalPrice() {
        return wholesalPrice;
    }

    public void setWholesalPrice(String wholesalPrice) {
        this.wholesalPrice = wholesalPrice;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getAverageCostPrice() {
        return averageCostPrice;
    }

    public void setAverageCostPrice(String averageCostPrice) {
        this.averageCostPrice = averageCostPrice;
    }

    public String getLingshouujia() {
        return lingshouujia;
    }

    public void setLingshouujia(String lingshouujia) {
        this.lingshouujia = lingshouujia;
    }

    public String getHuiyuanjia() {
        return huiyuanjia;
    }

    public void setHuiyuanjia(String huiyuanjia) {
        this.huiyuanjia = huiyuanjia;
    }

    public String getKucunxiaoshou() {
        return kucunxiaoshou;
    }

    public void setKucunxiaoshou(String kucunxiaoshou) {
        this.kucunxiaoshou = kucunxiaoshou;
    }

    public String getKucunyujing() {
        return kucunyujing;
    }

    public void setKucunyujing(String kucunyujing) {
        this.kucunyujing = kucunyujing;
    }

    public String getHuiyuandazhe() {
        return huiyuandazhe;
    }

    public void setHuiyuandazhe(String huiyuandazhe) {
        this.huiyuandazhe = huiyuandazhe;
    }

    public String getShifoufugou() {
        return shifoufugou;
    }

    public void setShifoufugou(String shifoufugou) {
        this.shifoufugou = shifoufugou;
    }

    public String getZhongliang() {
        return zhongliang;
    }

    public void setZhongliang(String zhongliang) {
        this.zhongliang = zhongliang;
    }

    public String getYaowufenlei() {
        return yaowufenlei;
    }

    public void setYaowufenlei(String yaowufenlei) {
        this.yaowufenlei = yaowufenlei;
    }

    public String getTouyao() {
        return touyao;
    }

    public void setTouyao(String touyao) {
        this.touyao = touyao;
    }

    public String getNihao() {
        return nihao;
    }

    public void setNihao(String nihao) {
        this.nihao = nihao;
    }

    public String getYongfa() {
        return yongfa;
    }

    public void setYongfa(String yongfa) {
        this.yongfa = yongfa;
    }

    public String getYaowu() {
        return yaowu;
    }

    public void setYaowu(String yaowu) {
        this.yaowu = yaowu;
    }

    public String getShengchan() {
        return shengchan;
    }

    public void setShengchan(String shengchan) {
        this.shengchan = shengchan;
    }

    public String getPizhun() {
        return pizhun;
    }

    public void setPizhun(String pizhun) {
        this.pizhun = pizhun;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
