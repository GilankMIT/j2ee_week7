package com.example.week_7.data;



import com.example.week_7.model.CryptoCoin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CryptoCoinData {
    List<CryptoCoin> cryptoCoinDataList = new ArrayList<>();

    public CryptoCoinData(){
        CryptoCoin cryptoCoin = new CryptoCoin(
                "Bitcoin",
                new BigDecimal(415013.19),
                new BigDecimal(7_744_249_529_458.0),
                new BigDecimal(458_176_486_935.0),
                new BigDecimal(18681975),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/1.png",
                "BTC",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);


        cryptoCoin = new CryptoCoin(
                "Ethereum",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png",
                "ETH",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);

        cryptoCoin = new CryptoCoin(
                "Binance Coin",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/1839.png",
                "BNB",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);

        cryptoCoin = new CryptoCoin(
                "XRP",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/52.png",
                "XRP",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);

        cryptoCoin = new CryptoCoin(
                "Cardano",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png",
                "ADA",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);

        cryptoCoin = new CryptoCoin(
                "Tether",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png",
                "USDT",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);

        cryptoCoin = new CryptoCoin(
                "Polkadot",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/6636.png",
                "DOT",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);

        cryptoCoin = new CryptoCoin(
                "Uniswap",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/7083.png",
                "UNI",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);

        cryptoCoin = new CryptoCoin(
                "Litecoin",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/2.png",
                "LTC",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);

        cryptoCoin = new CryptoCoin(
                "Chainlink",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/1975.png",
                "LINK",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);

        cryptoCoin = new CryptoCoin(
                "Bitcoin Cash",
                new BigDecimal(14970.2),
                new BigDecimal(1_734_227_326_812.0),
                new BigDecimal(194_230_267_106.0),
                new BigDecimal(115_458_522),
                "https://s2.coinmarketcap.com/static/img/coins/64x64/1831.png",
                "BCH",
                false);
        this.cryptoCoinDataList.add(cryptoCoin);
    }

    public List<CryptoCoin> getCryptoCoinDataList() {
        return cryptoCoinDataList;
    }
}
