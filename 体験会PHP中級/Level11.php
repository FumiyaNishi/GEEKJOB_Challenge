<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題11】</p>
        <p> 変数の値を書き換えて、「100未満です」と表示されるようにしましょう！!</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        $num = 5; //数字を変更

        if($num < 100){
            echo "100未満です";
        }

        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
