<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題24】</p>
        <p>1から100の数字の偶数の和を表示してください</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから

        $sum = 0;
        for($i = 1; $i <= 100; $i++) if($i % 2 == 0) $sum += $i;
        echo $sum;

        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
