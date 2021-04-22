package com.example.week_7.controller;


import com.example.week_7.data.CryptoCoinData;
import com.example.week_7.model.CryptoCoin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/crypto-watchlist")
public class WatchlistHomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String view = "templates/index.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(view);

        CryptoCoinData cryptoCoinData = new CryptoCoinData();
        List<CryptoCoin> cryptoCoinList = cryptoCoinData.getCryptoCoinDataList();

        HttpSession httpSession = request.getSession();
        List<String> cryptoWatchlist = (List<String>) httpSession.getAttribute("crypto-coin-watchlist");

        request.setAttribute("coins", cryptoCoinList);
        request.setAttribute("crypto-coin-watchlist", cryptoWatchlist);
        requestDispatcher.forward(request, response);
    }
}
