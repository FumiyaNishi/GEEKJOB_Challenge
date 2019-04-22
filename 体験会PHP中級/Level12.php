<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題12】</p>
        <p> 変数numを宣言し、適当な数値を入れて下さい。</p>
        <p>numの数値が正の数であれば「numは正の数です！」と表示されるようにしましょう。</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        $num = 12; //数字を変更

        if($num > 0){ //条件を変更
            echo $num."は正の数です";
        }

        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
