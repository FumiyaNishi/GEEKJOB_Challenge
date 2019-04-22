<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題13】</p>
        <p> 変数ageに自分の年齢を入れ、20歳以上であれば「お酒が飲めます！」、
            そうでなければ「まだお酒は飲めません！」と表示するようにして下さい。</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        $age = 22; //年齢を変更

        if($age >= 20){ //条件を変更
          echo "お酒が飲めます！"; //追加
        } else {
          echo "まだお酒は飲めません！"; //追加
        }

        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
