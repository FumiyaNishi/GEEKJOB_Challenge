package org.camp.servlet;

public class BlackJack {

	public static void main(String[] args) {
		// ディーラーとユーザーを生成
		Dealer dealer = new Dealer();
		User user = new User();

    	System.out.println("ブラックジャックスタート！");
        // deal
        dealer.setCard(dealer.deal());
        user.setCard(dealer.deal());

        // どちらかがカードを必要とする限りhit
        while((dealer.checkSum() || user.checkSum())) {
            if (dealer.checkSum()) dealer.setCard(dealer.hit());
            if (user.checkSum()) user.setCard(dealer.hit());
            System.out.println("ディーラー："+dealer.myCards.toString() +"　ユーザー："+user.myCards.toString());
        }

        // 両方出揃ったら、結果表示
        Integer dealerTotal = dealer.open();
        Integer userTotal = user.open();

        System.out.println("ディーラー="+dealerTotal+" "+dealer.myCards.toString()+"　ユーザー="+userTotal+" "+user.myCards.toString());

        if (dealerTotal > 21) dealerTotal = 0;
        if (userTotal > 21) userTotal = 0;

        if (dealerTotal == userTotal) {
            if (dealerTotal == 21) {
                if (dealer.myCards.size() > user.myCards.size()) System.out.println("ユーザー WIN");
                else if (dealer.myCards.size() < user.myCards.size()) System.out.println("ユーザー LOSE");
                else System.out.println("引き分け。。。");
            } else System.out.println("引き分け。。。");
        } else if (userTotal > dealerTotal) System.out.println("ユーザー WIN");
          else System.out.println("ユーザー LOSE");
    }

}