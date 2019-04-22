<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題27】</p>
        <p>配列の要素を全て表示させてください。</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから
        $names = array("はばの","いとう","すぎやま","いまやなぎた","うちだ","はせがわ");

        //追加
        foreach($names as $name) {
          echo $name." ";
        }


        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
