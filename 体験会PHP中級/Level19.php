<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>GEEK JOB TRYAL</title>
    </head>
    <body>

        <p>【課題19】</p>
        <p>条件分岐と組み合わせて、1から40を表示して、偶数のときだけ「偶数です！」と追加で表示しよう！</p>
        -------------------------<br>
        <p>【実行結果】</p><br>
        <?php
        // ここから

        for($i=1;$i<=40;$i++){ //回数を変更
          echo $i." "; //追加
          if($i % 2 == 0){ //条件を変更
              echo "偶数です！"; //br削除
          }
          echo "<br>"; //追加
        }
        // ここまで
        ?>

        <!-- これは消しちゃだめなやつ -->
        <?php include "../footer.php" ?>
    </body>
</html>
