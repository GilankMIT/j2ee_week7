package com.example.week_7.model;

import java.math.BigDecimal;

public class CryptoCoin {
    private String name;
    private  BigDecimal price;
    private BigDecimal marketCap;
    private BigDecimal volume;
    private BigDecimal circulatingSupply;
    private String icon;
    private String code;
    private boolean isWatchlist;

    public CryptoCoin(String name, BigDecimal price, BigDecimal marketCap, BigDecimal volume,
                      BigDecimal circulatingSupply, String icon, String code, boolean isWatchlist){
        this.name = name;
        this.price = price;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.icon = icon;
        this.isWatchlist = isWatchlist;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(BigDecimal circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isWatchlist() {
        return isWatchlist;
    }

    public void setWatchlist(boolean watchlist) {
        isWatchlist = watchlist;
    }
}
