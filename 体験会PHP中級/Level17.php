<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題17】</p>
        <p> 1から10の数字を画面に表示しよう</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから

        for($i=1;$i<=10;$i++){ //回数を変更
            echo "i の数字は".$i."です"."<br>";
        }
        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
