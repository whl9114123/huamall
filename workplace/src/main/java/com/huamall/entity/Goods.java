package com.huamall.entity;

public class Goods {
    private Integer goodsId;

    private String goodsTitle;

    private String goodsDetail;

    private String goodsImage;

    private Integer goodsPrice;

    private Integer goodsInstock;

    private Integer goodsStatus;

    private Integer goodsTypeid;

    private String goodsColor;

    private String goodsStandard;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle == null ? null : goodsTitle.trim();
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail == null ? null : goodsDetail.trim();
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsInstock() {
        return goodsInstock;
    }

    public void setGoodsInstock(Integer goodsInstock) {
        this.goodsInstock = goodsInstock;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsTypeid() {
        return goodsTypeid;
    }

    public void setGoodsTypeid(Integer goodsTypeid) {
        this.goodsTypeid = goodsTypeid;
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor == null ? null : goodsColor.trim();
    }

    public String getGoodsStandard() {
        return goodsStandard;
    }

    public void setGoodsStandard(String goodsStandard) {
        this.goodsStandard = goodsStandard == null ? null : goodsStandard.trim();
    }
}