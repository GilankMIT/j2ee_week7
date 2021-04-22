<%@ page import="java.text.NumberFormat" %>
<%@ page import="com.example.week_7.model.CryptoCoin" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: gilang
  Date: 14/04/21
  Time: 10.18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-12">
        <table class="table table-striped">
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>Price</th>
                <th>Market Cap</th>
                <th>Volume (24h)</th>
                <th>Circulating Supply</th>
                <th>Watchlist</th>
            </tr>

            <%
                NumberFormat formatter = NumberFormat.getInstance(new Locale("en_US"));
                List<CryptoCoin> coins = (List<CryptoCoin>) request.getAttribute("coins");

                List<String> cryptoWatchlist = (List<String>) request.getAttribute("crypto-coin-watchlist");

                for(int i = 0; i < coins.size(); i+=1) { %>
            <tr>
                <td><%=i + 1%></td>
                <td><img src="<%= coins.get(i).getIcon()%>" alt="btc-image" width="15px"> <%= coins.get(i).getName()%></td>
                <td>¥<%= formatter.format(coins.get(i).getPrice().longValue())%></td>
                <td>¥<%= formatter.format(coins.get(i).getMarketCap().longValue())%></td>
                <td>¥<%= formatter.format(coins.get(i).getVolume().longValue())%></td>
                <td><%= formatter.format(coins.get(i).getCirculatingSupply().longValue()) + " " + coins.get(i).getCode()%> </td>
                <td>
                    <!-- Coin already in watch list, toggle remove-->
                    <%
                        boolean isCoinInWatchlist = false;

                        //check if crypto watch list session is not empty, then iterate to check if
                        //current coin is in watchlist
                        if(cryptoWatchlist != null){
                            for(int watchListIndex = 0; watchListIndex < cryptoWatchlist.size(); watchListIndex++) {
                                if(cryptoWatchlist.get(watchListIndex).equals(coins.get(i).getCode())){
                                    isCoinInWatchlist = true;
                                }
                            }
                        }

                        if(isCoinInWatchlist){%>
                    <form action="watchlist/remove" method="post">
                        <input type="hidden" name="coin_code" value="<%=coins.get(i).getCode()%>">
                        <input type="submit" class="btn btn-danger" value="Remove from Watchlist">
                    </form>
                    <% }else{ %>
                    <form action="watchlist/add" method="post">
                        <input type="hidden" name="coin_code" value="<%=coins.get(i).getCode()%>">
                        <input type="submit" class="btn btn-primary" value="Add to Watchlist">
                    </form>
                    <% } %>
                </td>
            </tr>
            <% } %>
        </table>
    </div>
</div>
