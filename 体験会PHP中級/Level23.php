<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題23】</p>
        <p>変数moneyに好きな金額を入れてください。
		 </br>
		 </br> また、以下の条件分岐を作成して下さい。
		 </br> moneyの値が150以上のとき「ペットボトルを買いました」
		 </br> moneyの値が150未満かつ120以上のとき「缶を買いました」
		 </br> それ以外のときは「何も買えませんでした」
		 </br> と表示されるようにしてください。
		 </br>
		 </br> また、購入時にmoneyの残金と、購入したものがまだどれくらい購入できるかを表示しましょう。</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから

        $money = 1501;
        if($money >= 150) {
          echo "ペットボトルを買いました<br>";
          echo "残金：".($money - 150)."<br>";
          echo "あと".(int)(($money - 150)/150)."個買えます";
        }else if($money >= 120) {
          echo "缶を買いました<br>";
          echo "残金：".($money - 150)."<br>";
        }else echo "何も買えませんでした";



        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
