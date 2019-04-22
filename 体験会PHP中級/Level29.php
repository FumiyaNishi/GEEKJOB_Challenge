<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題29】</p>
        <p>配列の要素の最大値と最低値を表示して下さい</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        $points = array(10,25,35,40,55);

        //追加
        $max = $points[0];
        $min = $points[0];
        foreach($points as $point) {
          if($point > $max) $max = $point;
          if($point < $min) $min = $point;
        }
        echo "max = ".$max."<br>";
        echo "min = ".$min;

        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
