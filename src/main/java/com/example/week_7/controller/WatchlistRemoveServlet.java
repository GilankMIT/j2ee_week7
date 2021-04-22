package com.example.week_7.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/watchlist/remove")
public class WatchlistRemoveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        HttpSession session = request.getSession();
        List<String> cryptoCoinWatchlist = (List<String>) session.getAttribute("crypto-coin-watchlist");
        if (cryptoCoinWatchlist == null) {
            cryptoCoinWatchlist = new ArrayList<>();
        }

        String coinCode = request.getParameter("coin_code");
        for(int i = 0; i < cryptoCoinWatchlist.size(); i++){
            if(cryptoCoinWatchlist.get(i).equals(coinCode)){
                cryptoCoinWatchlist.remove(i);
                break;
            }
        }

        //replace session
        session.setAttribute("crypto-coin-watchlist", cryptoCoinWatchlist);

        response.getWriter().println("Crypto Coin removed from watchlist successfully, redirecting now...");

        String redirectUrl = request.getContextPath() + "/crypto-watchlist";
        response.setHeader("refresh", "1;url=" + redirectUrl);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
