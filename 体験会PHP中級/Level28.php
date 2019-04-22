<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題28】</p>
        <p>配列の要素全ての合計値と、その平均値を表示して下さい。</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        $points = array(10,25,35,40,55);

        //追加
        $sum = 0;
        foreach($points as $point) {
          $sum += $point;
        }
        echo $sum;

        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
