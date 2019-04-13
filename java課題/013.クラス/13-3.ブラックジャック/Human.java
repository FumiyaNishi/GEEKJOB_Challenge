package org.camp.servlet;

import java.util.ArrayList;
import java.util.Random;

public abstract class Human { //抽象クラス

	ArrayList<Integer> myCards; //共通フィールド
    public abstract int open(); //抽象メソッド
    public abstract void setCard(ArrayList<Integer> al);
    public abstract boolean checkSum();

}

class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>(); //山札はディーラーが保持

    Dealer() { //コンストラクタ
        for(int mark=0;mark<4;mark++) { //山札を構成
            for(int num=1;num<14;num++) {
                if (num > 10) cards.add(10);
                else cards.add(num);
            }
        }
        this.myCards = new ArrayList<Integer>(); //自身の手札を初期化
    }

    public int open() {
        return getTotal();
    }

    // 受け取ったカードを自分のカードに
    public void setCard(ArrayList<Integer> al) {
        if (al != null) for(Integer card : al) this.myCards.add(card);
    }

    public boolean checkSum() { //17以上ならhitしないという判断
        Integer sum = getTotal();
        if (sum < 17) return true;
        return false;
    }

    public ArrayList<Integer> deal() {
        ArrayList<Integer> resultCard = new ArrayList<Integer>(); //dealするcard

        Random rand = new Random();

        for(int i=0;i<2;i++) { //dealは2枚
            Integer target = rand.nextInt(this.cards.size()); //山札からrandomに指定
            resultCard.add(this.cards.get(target)); //dealしたcardを手札に追加
            this.cards.remove(target); //山札から削除
        }
        return resultCard;
    }

    public ArrayList<Integer> hit() {
        ArrayList<Integer> resultCard = new ArrayList<Integer>(); //hitするカード

        Random rand = new Random();

        Integer target = rand.nextInt(this.cards.size()); //ランダムに山札から指定
        resultCard.add(this.cards.get(target)); //手札に加える
        this.cards.remove(target); //山札から削除

        // 返却
        return resultCard;
    }

    private Integer getTotal() {
        Integer total = 0;

        if (this.myCards != null) {
            int aceCnt = 0;
            for(Integer card : this.myCards) {
                if (card != 1) total += card; // 先に１以外を加算
                else aceCnt++;
            }

            // 1について計算
            if (aceCnt > 0) {
                if (aceCnt > 1) total += (aceCnt - 1); // 2枚目からは必ず+1
                if ((total + 11) <= 21) total += 11; //  残った1枚は残りの合計から判断
                else total += 1;
            }
        }
        return total;
    }
}

class User extends Human {

    User() {
        this.myCards = new ArrayList<Integer>(); //自分の手札を初期化
    }

    public int open() {
        return getTotal();
    }

    public void setCard(ArrayList<Integer> al) {
        if (al != null) for(Integer card : al) this.myCards.add(card);
    }

    public boolean checkSum() { //userは15以上でhitしないという判断
        Integer sum = getTotal();
        if (sum < 15) return true;
        return false;
    }

    private Integer getTotal() {
        Integer total = 0;

        if (this.myCards != null) {
            int aceCnt = 0;
            for(Integer card : this.myCards) {
                if (card != 1) total += card; //1以外を加算
                else aceCnt++; //1の枚数をカウント
            }

            if (aceCnt > 0) {
                if (aceCnt > 1) total += (aceCnt - 1); //2枚目からは必ず＋1

                if ((total + 11) <= 21) total += 11; //残った1枚は他の合計から判断
                else total += 1;
            }
        }
        return total;
    }

}