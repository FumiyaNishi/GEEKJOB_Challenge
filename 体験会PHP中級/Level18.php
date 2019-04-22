<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題18】</p>
        <p>条件分岐と組み合わせて、1から40の間にある偶数だけ表示しよう！</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから

        for($i=1;$i<=40;$i++){ //回数を変更
            if($i % 2 == 0){ //条件を変更
                echo "i の数字は".$i."です"."<br>";
            }
        }
        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
