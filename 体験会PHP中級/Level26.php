<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題26】</p>
        <p>九九の表が表示されるプログラムを作成して下さい</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから


        for($i = 1; $i <= 9; $i++){
          for($j = 1; $j <=9; $j++){
            echo ($i * $j)." ";
          }
          echo "<br>";
        }


        // ここまで
        ?>
        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
