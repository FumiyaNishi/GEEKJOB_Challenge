<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題10】</p>
        <p> 次のプログラムを作成しましょう!</p>
        <p>1. 変数numに数値の50を入れる</p>
		<p>2. 変数numの値から15を引く</p>
		<p>3. 変数numの値を半分にする</p>
		<p>4. 変数numを表示する</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        //　全て追加
        $num = 50;
        $num -= 15;
        $num = (int)($num / 2); //型変換が必要？？
        echo $num;

        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
