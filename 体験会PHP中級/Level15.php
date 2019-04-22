<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題15】</p>
        <p> 変数numを宣言して、適当な数値を入れましょう。
		その後、numの値が4の倍数であれば「4の倍数です！」と表示されるプログラムを作りましょう。</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        $num = 100; //数字を変更
        if($num % 4 == 0){ //条件と処理を追加
          echo "4の倍数です";
        }

        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
