package com.example.week_7.controller;

import com.example.week_7.data.CryptoCoinData;
import com.example.week_7.model.CryptoCoin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/my-watchlist")
public class WatchlistCenterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> cryptoCoinWatchlistCodes = (List<String>) request.getSession().getAttribute("crypto-coin-watchlist");
        if(cryptoCoinWatchlistCodes == null){
            cryptoCoinWatchlistCodes = new ArrayList<>();
        }
        List<CryptoCoin> watchlistedCoin = getWatchlistedCrypto(cryptoCoinWatchlistCodes);
        String view = "templates/index.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(view);

        CryptoCoinData cryptoCoinData = new CryptoCoinData();

        HttpSession httpSession = request.getSession();
        List<String> cryptoWatchlist = (List<String>) httpSession.getAttribute("crypto-coin-watchlist");

        request.setAttribute("coins", watchlistedCoin);
        request.setAttribute("crypto-coin-watchlist", cryptoWatchlist);
        requestDispatcher.forward(request, response);
    }

    List<CryptoCoin> getWatchlistedCrypto(List<String> codes){
        CryptoCoinData cryptoCoinData = new CryptoCoinData();
        List<CryptoCoin> allCoin =  cryptoCoinData.getCryptoCoinDataList();
        List<CryptoCoin> watchlistedCoin = new ArrayList<>();
        for(int i = 0; i < allCoin.size(); i++){
            for(int codeIndex = 0; codeIndex < codes.size(); codeIndex++){
                if(allCoin.get(i).getCode().equals(codes.get(codeIndex))){
                    watchlistedCoin.add(allCoin.get(i));
                }
            }
        }
        return watchlistedCoin;
    }
}
